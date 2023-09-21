class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1 == null){ //有問題的case return 防守用
        }
        int word1Len = word1.length();
        int word2Len = word2.length();
        int n =word1Len > word2Len ? word1Len : word2Len; // 如果 w1>w2 reurn true:word1len
        //如果之後有else if 就唔好咁做了
        //for loop
        StringBuilder s = new StringBuilder(); //defaul: "" but not null
        System.out.println("s = "+s);
        for( int i = 0;i<n;i++){
            if(i<word1.length())
                s.append(word1.charAt(i));
            if(i<word2.length())
                s.append(word2.charAt(i));
        // 諗可能性
        // Scenario 1:
        //word1:aaaa -> word1[3]
        //word2:bbb -> word2[2]..最多行到2
        //寫2個if 因為你唔知邊個長D

        //Sceenario 2:
        //word1:aaa
        //word2:bbb b

        }
        return s.toString();
    }
}