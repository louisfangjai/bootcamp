// LeetCode: 942
class Solution {
    public int[] diStringMatch(String s) {
        // s contains 'I' or 'D' only.
        // 1 <= length <= 100000

        // Example 1: "IDID"
        // I: 0 -> 4
        // D: 4 -> 1
        // I: 1 -> 3
        // D: 3 -> 2
        // [0, 4, 1, 3, 2]
        // [0, 3, 2, 4, 1]

        // Example 2: "III"
        // [0, 1, 2, 3]

        // Example 3: "DDI"
        // [2, 1, 0, 3]

        // Approach: Use I / D to determine the previous value
            // No matter the next char is I or D
            // we still put "min" to arr
            // Reason: if current char is I and next char is I
            // min will become +1, so it is OK. (0 -> 1)
            // if next char is D -> we will put max. 
            // Then it also fulfill 'I' operation. (0 -> 4)
        //  I  D  I  I
        // [0, 4, 1, 2, 3]
        int strLen = s.length();
        int min = 0;
        int max = strLen;
        int[] arr = new int[strLen + 1];
        for (int i = 0; i < strLen; i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = min;
                min++;
            } else {
                arr[i] = max;
                max--;
            }
        }
        // arr[arr.length - 1] = max; // also OK, min = max finally
        arr[arr.length - 1] = min;
        return arr;
    }
}