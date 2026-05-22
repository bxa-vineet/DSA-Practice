class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for(int i=0; i<gas.length; i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }

        if(totalcost>totalgas){
            return -1;
        }
          
          int amount = 0;
           int idx = 0;
        for(int i=0; i<gas.length; i++){
            amount = amount + gas[i] - cost[i];
            if(amount<0){
                idx = i+1;
                amount = 0;
            }

        }

        return idx;
    }
}