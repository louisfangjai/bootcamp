class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // 2個方向> String method
        // indexof> check exists or not
        int[] counts = new int[58]; // 26+26+6 65(A)-122(z)
        // int[128]都OK，128: ASCII 長度
        // Check which char is Jewel
        for(int i=0; i< jewels.length();i++){
            counts[jewels.charAt(i)-'A']++;
        }
        // loop stones
        int sum=0;
        for(int i=0; i< stones.length();i++){
            if(counts[stones.charAt(i)-'A']>0) // important
            sum++;
        }
        return sum;
    }
}