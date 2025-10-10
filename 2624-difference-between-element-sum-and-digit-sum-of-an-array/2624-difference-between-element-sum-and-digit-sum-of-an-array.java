class Solution {
    public int differenceOfSum(int[] nums) {
        int esum =0;
        int dsum = 0;

        for(int i=0;i<nums.length;i++){
            esum+=nums[i];
            dsum+=digsum(nums[i]);
        }
        return Math.abs(esum-dsum);


    }
    public int digsum(int x){
        int sum = 0;
        
        while(x>0){
            
                int digit = x%10;
                sum+=digit;
                x/=10;
            
        }
        return sum;
    }
}