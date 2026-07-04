class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double[] result = new double[nums1.length + nums2.length];
        int k = 0;
        double median = 0;

        for(int i = 0; i < nums1.length; i++) {
            result[k++] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++) {
            result[k++] = nums2[i];
        }

        Arrays.sort(result);

        if(result.length % 2 == 0) median = (result[result.length/2 - 1] + result[result.length/2]) / 2;
        else median = result[result.length / 2];

        return median;
    }
}
