class Solution {
    public int counts(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int total =0 ;
        for(int i=0;i<nums.length;i++){
            if(counts(nums[i])%2==0){
                total++;
            }
        }
         return total;
    }
   
}