class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        int left=0;
        int right=n-1;
        int j=n-1;
        while(left<=right){
            int sqL=nums[left]*nums[left];
            int sqR=nums[right]*nums[right];
            if(sqL>=sqR){
                res[j]=sqL;
                left++;
            }
            else{
                res[j]=sqR;
                right--;
            }
           j--;
        }
       
          return res;
    }
}