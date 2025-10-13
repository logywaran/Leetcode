class Solution {
    public int diagonalSum(int[][] mat) {
        int msum = 0;
        int ssum = 0;
        int result = 0;
        for(int i=0;i<mat.length;i++){
            msum+=mat[i][i];
            ssum+=mat[i][mat.length-1-i];
            if(mat.length%2!=0){
                result = msum + ssum - mat[mat.length/2][mat.length/2];
            }
            else{
                result = msum + ssum;
            }
        }
        return result;
    }
}