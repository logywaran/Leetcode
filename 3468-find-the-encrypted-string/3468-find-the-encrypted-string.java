class Solution {
    public String getEncryptedString(String s, int k) {
        char[] sarr = s.toCharArray();
        String str ="" ;
        
        
        for(int i=0;i<sarr.length;i++){
            int m = (i+k)%sarr.length;
            str+= sarr[m];

        }
       
        return str;
    }
}