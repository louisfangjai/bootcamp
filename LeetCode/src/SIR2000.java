// LeetCode: 2000
class Solution {
    public String reversePrefix(String word, char ch) {
        // str.indexOf()
        // 1. Check if ch exists?
        int idx = word.indexOf(ch);
        if (idx == -1)
            return word; //indexOf搵唔到出-1比返佢
        // 2. lowercase only. word.length() >= 1
        // idx
        // Swap for reverse
        char[] arr = word.toCharArray(); // slow
        char temp;
        int strLength = idx + 1;//idx0位開數，+1先係長度
        for (int i = 0; i < strLength; i++) {
            // Scenario 1: 1, 2, 3, 4, 5 // > length / 2 - 1
            // Scenario 2: 1, 2, 3, 4, 5, 6 // > length / 2 - 1
            if (i > strLength / 2 - 1) //換過一次就夠
                break;
            // swap
            temp = arr[i];
            arr[i] = arr[strLength - 1 - i];
            arr[strLength - 1 - i] = temp;
        }
        return String.valueOf(arr);
    }
}