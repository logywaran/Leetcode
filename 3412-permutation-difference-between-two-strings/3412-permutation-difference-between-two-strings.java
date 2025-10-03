class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum =0;
        
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        for(int i = 0; i<sarr.length;i++){
            for(int j =0;j<sarr.length;j++){
                if(sarr[i]==tarr[j]){
                    sum+=Math.abs(i-j);
                }
            }
        }
        return sum ;
    }
}