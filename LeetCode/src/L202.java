// LeetCode: 202
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> integers = new HashSet<>();
        int num = n;
        while(num != 1) {
            num = squareOfDigits(num); // 
            if (!integers.add(num))
                return false; // not a happy number
        }
        return true;
    }

    public static int squareOfDigits(int num) {
        // Another approach: int -> String -> toCharArray -> int
        int sum = 0;
        while(num > 0) { // let num = 304
            sum += Math.pow(num % 10, 2);
            num /= 10; // 3 / 10 -> 0
        }
        return sum;
    }
}