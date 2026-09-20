class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int sum=0;
       int left=0;
       int min_length=Integer.MAX_VALUE;
       int n=nums.length;
       for(int right=0;right<n;right++){
        sum=sum+nums[right];
        while(sum>=target){
           min_length= Math.min(min_length,right-left+1);
           sum-=nums[left];
            left++;
        }
       }
       return min_length==Integer.MAX_VALUE? 0:min_length;

    }
}