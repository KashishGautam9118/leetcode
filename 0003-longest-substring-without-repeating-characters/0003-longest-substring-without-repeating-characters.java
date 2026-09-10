class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int low=0;
        int res=0;
        int distinct=0;
        int [] f=new int [128];
        for(int high=0;high<n;high++){
            f[s.charAt(high)]++;
            if (f[s.charAt(high)] == 1) {
                distinct++;
            }
            while(distinct<high-low+1){
                f[s.charAt(low)]--;
                if(f[s.charAt(low)]==0){
                    distinct--;
                }
                low++;
            }
            int len=high -low+1;
            res=Math.max(len,res);

        }

    return res;

    }
}