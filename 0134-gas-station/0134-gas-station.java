class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        for(int i=0;i<gas.length;i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
        }
         if(totalCost>totalGas){
                return -1;
         }
        int sum=0;
        int pos=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                sum=0;
                pos=i+1;
            }
        }
        return pos;
    }
}