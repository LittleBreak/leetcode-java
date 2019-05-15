package leetcode;

// https://leetcode.com/problems/sort-array-by-parity/

/*
* 先排好序，再使用push或unshift
*
* */
public class SortArrayByParity {
    // java中的数组是要定义好大小的。
    // 将奇数加到后方，偶数加到前方
    public int[] sortArrayByParity(int[] A) {
        int size = A.length;
        int start = 0, end = size - 1;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            if (A[i] % 2 == 1) {
                res[end--] = A[i];
            } else {
                res[start++] = A[i];
            }
        }
        return res;
    }

}
