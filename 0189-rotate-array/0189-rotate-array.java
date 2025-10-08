class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n==0){
            return;
        }
        k = k%n;
        if(k==0){
            return;
        }

        int[] res= new int[n];
        int pos = 0;
        for(int i = n-k;i<n;i++){
            res[pos++] = nums[i];
        }
        for(int i = 0 ;i<n-k;i++){
            res[pos++] = nums[i];
        }
        for(int i = 0 ; i<n;i++){
            nums[i] = res[i];
        }
    }
}