class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefixsum=prefixsum+nums[i];
            int rem=prefixsum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(map.containsKey(rem)){
                count=count+map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}