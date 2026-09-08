class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxbestending=nums[0];
        int minbestending=nums[0];
        int ans = Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            int v1=maxbestending+nums[i];
            int v2=minbestending+nums[i];
            int v3=nums[i];
           
            maxbestending=Math.max(v1,v3);
            minbestending=Math.min(v2,v3);
               ans = Math.max(ans,
                    Math.max(maxbestending, Math.abs(minbestending)));
        }
        return ans;
    }
}