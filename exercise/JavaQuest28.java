/**
 * Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
 * 
 * A substring is a contiguous sequence of characters within a string.
 * 
 */
/*
 * Constraints:
 * 
 * 1 <= patterns.length <= 100 1 <= patterns[i].length <= 100 1 <= word.length <= 100 patterns[i] and word consist of lowercase English letters.
 */
public class JavaQuest28 {
    public static void main(String[] args) {
        System.out.println(
                StringsNumber2(new String[] {"a", "abc", "bc", "d"}, "abc")); // output : 3
        System.out.println(StringsNumber2(new String[] {"a", "b", "c", "d"},
                "aaaabbababba")); // output : 2
        System.out.println(
                StringsNumber2(new String[] {"xyz", "x", "y", "z"}, "abc")); // output : 0
        System.out
                .println(StringsNumber2(new String[] {"a", "a", "a", ""}, "ab")); // output : 3
    }

    public static int StringsNumber(String[] patterns, String word) {
        // code here
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (patterns[i]!= "" && word.contains(patterns[i]))
                count++;
        }

        return count;
    }
    public static int StringsNumber2(String[] patterns, String word) {
        // code here
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            for(int j=0; j< patterns[i].length(); j++) {
                if(word.contains(String.valueOf(patterns[i].charAt(j)))){
                    count++;
                break;
                }
            }
        }

        return count;
    }
}
