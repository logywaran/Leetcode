class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int res = 0;
        int cal = arrivalTime + delayedTime ;
        if(cal == 24){
            return res;
        }
        else if(cal < 24){
            res = cal;

        }
        else if(cal > 24){
            res = cal%24;
        }
        return res;
    }
}