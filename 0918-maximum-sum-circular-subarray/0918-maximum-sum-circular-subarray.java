class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxending=nums[0];
        int minending=nums[0];
        int totalsum=nums[0];
        int maxsum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]+maxending;
            maxending=Math.max(v1,v2);
            maxsum=Math.max(maxending,maxsum);
            int v3=nums[i]+minending;
            minending=Math.min(v1,v3);
            minsum=Math.min(minending,minsum);
            totalsum=totalsum+nums[i];

        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum-minsum);
    }
}