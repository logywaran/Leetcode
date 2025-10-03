class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        k %= n;  
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int m = (i + k) % n;
            sb.append(s.charAt(m));
        }

        return sb.toString();
    }
}
