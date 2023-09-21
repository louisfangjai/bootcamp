// LeetCode: 1941
class Solution {
    public boolean areOccurrencesEqual(String s) {
        // if (s.length() <= 1)
        //     return true;
        // Part 1:
        // arr[]
        int[] arr = new int[26]; // 'a' -> 97
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        // Part 2: min max -> check if all numbers are same
        // a 0 b 0 c 1 d 0 e 0 f 1 0 2 1

        Integer previous = null; // 'a' -> 2
        for (int num : arr) {
            if (previous == null && num != 0) {
                previous = num;
                continue;
            }
            if (num != 0 && previous != 0) {
                if (num != previous)
                    return false;
                previous = num;
            }
        }
        return true;
    }
}