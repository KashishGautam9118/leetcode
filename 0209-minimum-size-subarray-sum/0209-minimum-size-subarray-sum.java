class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int high=0;high<n;high++){
             sum=sum+nums[high];
            while(sum>=target){
                int len=(high-low)+1;
                ans=Math.min(ans,len);
                sum=sum-nums[low];
                low++;
            }
        }
            if (ans == Integer.MAX_VALUE) {
            return 0;
        }

     
        return ans;

    }
}