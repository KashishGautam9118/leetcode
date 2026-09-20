class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int left=0;
       int prod=1;
       int n=nums.length;
       int count=0;
       if(k<=1){
        return 0;
       }
       for(int right=0;right<n;right++){
        prod*=nums[right];
        while(prod>=k){
            prod/=nums[left];
            left++;
        }
        count+=right-left+1;
       }
    return count;
    }
    
}