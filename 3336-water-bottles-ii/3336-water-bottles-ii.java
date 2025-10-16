class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty = numBottles;
        int total = 0 ; 
        while(empty >= numExchange){
            empty = empty  - numExchange + 1;
            numExchange++;
            total++;
        }
        return total + numBottles;
    }
}