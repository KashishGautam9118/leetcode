class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        while(j<nums.length){
            if(nums[j]==0){
                count++;
            }
        while(i<=j && count>k){
            if(nums[i]==0){
                count--;
            }
            i++;
        }
        max=Math.max(max,j-i+1);
        j++;
        }
      return max;  
    }
}