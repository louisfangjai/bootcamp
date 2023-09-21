// LeetCode: 1588
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int oddLength = 1;
        int sum = 0;
        while (oddLength <= arr.length) {
            sum += subarrayTotal(oddLength, arr);
            oddLength += 2;
        }
        return sum;
    }
    public static int subarrayTotal(int length, int[] arr) {
        int j = 0;
        int total = 0;
        for (int i = 0; i + length <= arr.length; i++) {
            // if (i + length > arr.length)
            //     break;
            // i = 0, 1, 2
            j = i;
            while (j < length + i) { 
                // i = 0, j = 0, 1, 2
                // i = 1, j = 1, 2, 3
                // i = 2, j = 2, 3, 4
                total += arr[j];
                j++;
            }
        }
        return total;
    }
}