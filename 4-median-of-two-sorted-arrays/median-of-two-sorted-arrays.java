class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int one = nums1.length;
        int two = nums2.length;
        int[] result = new int[one + two];
        int i = 0, j = 0, k = 0;

        while (i < one && j < two) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < one) {
            result[k++] = nums1[i++];
        }

        while (j < two) {
            result[k++] = nums2[j++];
        }

        if (result.length % 2 != 0) {
            return result[result.length / 2];
        } else {
            int mid = result.length / 2;
            return (result[mid] + result[mid - 1]) / 2.0;
        }
    }
}