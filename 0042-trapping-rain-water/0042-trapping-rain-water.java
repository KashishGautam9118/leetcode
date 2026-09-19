class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int left_max = height[left];
        int right_max = height[right];

        int water=0;
            while(left<right){
                if(left_max<right_max){
                    left++;
                    left_max=Math.max(left_max,height[left]);
                    water=water+left_max-height[left];
                }
                else{
                    right--;
                    right_max=Math.max(right_max,height[right]);
                    water=water+right_max-height[right];
                }
            }
        return water;
    }
}