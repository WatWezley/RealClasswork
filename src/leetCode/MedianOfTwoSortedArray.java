package leetCode;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        System.out.println(findingTheMedianOfTwoSortedArray(array1, array2));


    }


    public static double findingTheMedianOfTwoSortedArray(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] mergedArrayed = new int[size];
        System.arraycopy(nums1, 0, mergedArrayed, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArrayed, nums1.length, nums2.length);
        Arrays.sort(mergedArrayed);
        double median;
        if (mergedArrayed.length % 2 == 0) {
            double firstMedian = mergedArrayed[mergedArrayed.length / 2];
            double secondMedian = mergedArrayed[mergedArrayed.length / 2 - 1];
            median = (firstMedian + secondMedian) / 2;
        } else {
            median = mergedArrayed[mergedArrayed.length / 2];
        }
        return median;
    }
}
