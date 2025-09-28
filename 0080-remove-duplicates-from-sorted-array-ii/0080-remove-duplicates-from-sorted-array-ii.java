class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;  

        int insertPos = 2;

        for (int i = 2; i < n; i++) {
            
            if (nums[i] != nums[insertPos - 2]) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        return insertPos;
    }
}
