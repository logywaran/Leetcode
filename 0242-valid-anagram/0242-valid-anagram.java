class Solution {
    public boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(ttr);
        
        return Arrays.equals(str,ttr);
        
    }
}