// LeetCode: 2347
class Solution {
    public String bestHand(int[] ranks, char[] suits) { //ranks 同suits 盡量唔好郁!
        if (isFlush(suits))
            return "Flush";
        if (isThreeOfAKind(ranks))
            return "Three of a Kind";
        if (isPair(ranks))
            return "Pair";
        return "High Card";
    }
    public static boolean isFlush(char[] suits) {
        for (int i = 1; i < suits.length; i++) { // start from 1 花，可以古惑D
        // 最後先郁中間，i++盡量唔好郁，要郁就郁 i =
            if (suits[i] != suits[i - 1])
                return false;
        }
        return true;
    }
    public static boolean isThreeOfAKind(int[] ranks) {
        int[] cards = new int[13];
        for (int i = 0; i < ranks.length; i++) {
            if (++cards[ranks[i]-1] >= 3) // -1 是因為由0位開始做
                return true;
        }
        return false;
    }
    public static boolean isPair(int[] ranks) {
        int[] cards = new int[13];
        for (int i = 0; i < ranks.length; i++) {
            if (++cards[ranks[i]-1] >= 2) // 
                return true;
        }
        return false;
    }
}