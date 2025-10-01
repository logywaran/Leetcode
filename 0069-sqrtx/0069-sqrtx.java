class Solution {
    public int mySqrt(int x) {
        int i = 1;
        int count = 0;
        
        while (x>=i){
            x = x - i ;

            i = i + 2;
            count++;
        }
        return count;
    }
}