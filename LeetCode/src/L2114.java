class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            // if( a> max)
            // max= a >same use Math
            max = Math.max(s.split(" ").length,max); //split() slow
        }
        return max;
    }
}