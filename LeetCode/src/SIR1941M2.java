// LeetCode: 1941
class Solution {
    public boolean areOccurrencesEqual(String s) {
        // Part 1: arr[] to count all elements
        int[] arr = new int[26]; // char - 'a'
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        // Part 2: min max -> check if all numbers are same
        int max = 0;
        int min = 1000;
        for (int num : arr) {
            if (num != 0) {
                if (num > max)
                    max = num;
                if (num < min)
                    min = num;
                if (min != max)
                    return false;
            }
        }
        return min == max;
    }
}