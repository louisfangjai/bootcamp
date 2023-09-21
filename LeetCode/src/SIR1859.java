// LeetCode: 1859
class Solution {
    public String sortSentence(String s) {
       // split() -> " " -> String[]
       // Step1: split to String[]
       String[] strings = s.split(" "); // slow
       // Step2: New String[] to store result
       String[] words = new String[strings.length];
       int idx;
       for (int i = 0; i < strings.length; i++) {
           // '2' - '0' -> ASCII -> 2 (int)
           idx = strings[i].charAt(strings[i].length()-1) - '0' - 1; //char -'0逼個integer出黎，之後-1 係因為idx 是由0123開始數
           // idx -> 1,3,0,2
           words[idx] = strings[i].substring(0, strings[i].length()-1);// 想去到最尾個位停唔拎埋個數字
           //System.out.println(words[idx]);
        
       }
       StringBuilder sb = new StringBuilder();
       for (String str : words) {
           sb.append(str).append(" ");
       }
       return sb.toString().trim(); // cut leading or trailing space
    }
}
