class Solution {
    public int prefixCount(String[] words, String pref) {
        // startsWith() >> endsWith()
        int counter=0;
        for( int i = 0; i<words.length;i++){
            if( words[i].startsWith(pref) )
            counter++;
        }
        return counter;
    }
}