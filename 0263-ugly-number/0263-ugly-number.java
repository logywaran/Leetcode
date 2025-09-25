                // WITH HELP OF CHAT GPT 
                //OPTIMISED CODE

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false; 
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}

                        //MY BRUTE FORCE CODE :)
                        //TLE ERROR:(

// class Solution {
//     public boolean prime(int x) {
//         if (x <= 1) return false;
//         for (int i = 2; i <= x / 2; i++) {
//             if (x % i == 0) {
//                 return false; 
//             }
//         }
//         return true; 
//     }


//     public boolean isUgly(int n) {
//         if (n <= 0) return false;
//         if (n == 1) return true;

        
//         for (int i = 2; i <= n; i++) {
//             if (n % i == 0) {
                
//                 if (prime(i) && i != 2 && i != 3 && i != 5) {
//                     return false;
//                 }
//             }
//         }

//         return true; 
//     }
// }
