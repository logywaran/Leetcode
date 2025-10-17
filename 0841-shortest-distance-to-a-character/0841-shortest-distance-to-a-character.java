class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int minDist = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (arr[j] == c) {
                    minDist = Math.min(minDist, Math.abs(i - j));
                }
            }
            res[i] = minDist;
        }
        return res;
    }
}
