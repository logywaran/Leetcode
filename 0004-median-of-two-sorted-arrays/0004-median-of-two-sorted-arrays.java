class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length+nums2.length];
        int k =0 ;
        for(int i=0;i<nums1.length;i++){
            merged[k++] = nums1[i];
        }
        for(int i =0;i<nums2.length;i++){
            merged[k++] = nums2[i];
        }
        Arrays.sort(merged);

        double result = 0;

        if(merged.length%2==0){
            result = (merged[merged.length/2] + merged[merged.length/2 - 1] )/ 2.0;
        }
        else{
            result = merged[merged.length/2];
        }
        return result;

    }
}