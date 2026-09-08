class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0;
        int ans=1;
        int cm=1;
        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            else{
                nums[officer+1]=nums[cm];
                officer++;
                cm++;
            }
        }
        return officer+1;
    }
}