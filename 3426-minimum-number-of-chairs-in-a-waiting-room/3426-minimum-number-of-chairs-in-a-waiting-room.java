class Solution {
    public int minimumChairs(String s) {
        char[] sarr = s.toCharArray();
        int n = sarr.length;
        int occupied = 0;
        int available = 0;

        for(int i =0 ;i<sarr.length;i++){
            if(sarr[i]=='E'){
                occupied++;
                
            }
            else if(sarr[i]=='L'){
                occupied--;
            }
            if(occupied>available){
                available = occupied;
            }
        }
        return available;
        
    }
}