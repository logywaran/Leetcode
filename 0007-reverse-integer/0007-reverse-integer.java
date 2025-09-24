class Solution {
    public int reverse(int x) {
        long num = x;                  
        boolean isNegative = num < 0;  
        if (isNegative) {
            num = -num;                
        }

        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (rev > Integer.MAX_VALUE) return 0;  

        return isNegative ? (int)(-rev) : (int)rev;
    }
}
