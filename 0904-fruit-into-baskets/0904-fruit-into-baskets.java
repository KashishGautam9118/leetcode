class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int low=0;
        int res=0;
        int[] f=new int[n];
        int distinct=0;
        for(int high=0;high<n;high++){
            f[fruits[high]]++;
            if (f[fruits[high]] == 1) {
                distinct++;
            }
            while(distinct>2){
                     f[fruits[low]]--;
                if(f[fruits[low]]==0){
                    distinct--;
                }
                low++;
            }
            if(distinct<=2){
                int len=high-low+1;
                res=Math.max(len,res);
            }

        }
        return res;

    }
}