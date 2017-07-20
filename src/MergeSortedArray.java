/**
 * Created by haohao on 17-7-20.
 */
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold
 additional elements from nums2. The number of elements initialized in nums1 and nums2 are m
 and n respectively.
 */

public class MergeSortedArray {
    // 先挪位置，再从前向后归并，其实可以从后往前归并，就不需要挪动了
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        //挪位置,从后往前，否则会覆盖
        for (int i = (m + n - 1); i >= n; i--)
            nums1[i] = nums1[i - n];
        //归并
        int j = 0;
        int k = n;
        for (int i = 0; i < (m + n); i++) {
            if (j >= n)
                nums1[i] = nums1[k++];
            else if (k >= m + n)
                nums1[i] = nums2[j++];
            else if (nums2[j] <= nums1[k])
                nums1[i] = nums2[j++];
            else
                nums1[i] = nums1[k++];
        }
    }

    //直接从后向前归并
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int j = m - 1;
        int k = n - 1;
        for (int i = (m + n - 1); i >= 0; i--) {
            if (j < 0)
                nums1[i] = nums2[k--];
            else if (k < 0)
                nums1[i] = nums1[j--];
            else if (nums1[j] > nums2[k])
                nums1[i] = nums1[j--];
            else
                nums1[i] = nums2[k--];
        }
    }
}
