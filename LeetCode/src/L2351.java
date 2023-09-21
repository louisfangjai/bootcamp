public class L2351 {
public static void main(String[] args) {
    
    String x= "asssdbc";
        System.out.println(repeatedCharacter(x));
}

    public static char repeatedCharacter(String s) {
        //睇題目feel到要統計>用array
        char ch = ' '; // '\u0000'//比empty or // '\u0000'
        int [] chs = new int[26]; // 得26個字母
        // int idx;
        for(int i =0; i< s.length(); i++){
            ch = s.charAt(i);
            //idx =ch-'a'; variable出現一次就無用
            //chs[idx]++; // 0 position儲幾多a， 1儲幾多b.......
            if(++chs[ch-'a']==2)
            return ch; //佢要搵第一個2 所以可以同一個loop到做,佢呢個有break method
        }

        return ch;
    }
}