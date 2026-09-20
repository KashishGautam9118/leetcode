class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int curr_count=0;
       int max_count=0;
       int n=nums.length;
       for(int j=0;j<n;j++){
        if(nums[j]==1){
            curr_count++;
        }
        else{
            max_count=Math.max(max_count,curr_count);
            curr_count=0;
        }
       }
       return Math.max(max_count,curr_count);
    }
}