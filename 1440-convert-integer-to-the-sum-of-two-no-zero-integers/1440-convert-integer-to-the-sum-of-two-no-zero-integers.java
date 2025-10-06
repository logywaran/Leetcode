class Solution {
    public int[] getNoZeroIntegers(int n) {
        int m =0;
        int o =0;
        for(int i=1;i<n;i++){
           int j =n-i;
                if(nozero(i)&&nozero(j)){
                    m=i;
                    o=j;
                    break;
                } 
        }
        return new int[]{m,o};
    }
    public boolean nozero(int num){
        while(num>0){
            if(num%10==0)return false;
            num/=10;
        }
        return true;
    }
}