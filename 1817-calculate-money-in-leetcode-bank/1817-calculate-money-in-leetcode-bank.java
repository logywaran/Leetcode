class Solution {
    public int totalMoney(int n) {
        int output = 0 ;
        int week = n/7;
        
        int days = n%7;
        int z = 7 ;
        for(int i =1;i<=week;i++){
            for(int j=i;j<=z;j++){
                output +=j;

            }
            z++;
        }
        for(int i = 1  ;i<=days;i++){
            output = output + (i+week);
        }
        return output;
    }
}