class Solution {
    public int firstUniqChar(String s) {
        boolean found = false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            boolean isrepeating = false;

            for(int j =0;j<s.length();j++){
                if(i!=j && s.charAt(j)==c){
                    isrepeating = true;
                    break;
                }
                
                    
                }
                  if(!isrepeating){
                    return s.indexOf(c);
            }
          
        }
        return -1;
    }
}