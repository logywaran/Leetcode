class Solution {
    public String getEncryptedString(String s, int k) {
        
        String str ="" ;
        
        
        for(int i=0;i<s.length();i++){
            int m = (i+k)%s.length();
            str+= s.charAt(m);

        }
       
        return str;
    }
}