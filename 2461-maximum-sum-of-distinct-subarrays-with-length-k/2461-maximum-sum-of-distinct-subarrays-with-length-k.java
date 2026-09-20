class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
       long windowsum=0;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<k;i++){
            windowsum+=nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
       } 
       long  maxsum=0;
         if (map.size() == k) {
            maxsum = windowsum;
        }
       for(int j=k;j<n;j++){
        windowsum+=nums[j];
        map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
        windowsum-=nums[j-k];
        map.put(nums[j - k], map.get(nums[j - k]) - 1);

            if (map.get(nums[j - k]) == 0) {
                map.remove(nums[j - k]);
            }
            if (map.size() == k){

        maxsum=Math.max(windowsum,maxsum);
            }
       }
       return maxsum;

    }
}