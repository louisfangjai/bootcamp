// LeetCode:557
class Solution {
    public String reverseWords(String s) {
         // Split()，if唔用Split都OK，Split>好慢，stack都好慢
        //  word -> Stack , toCharArray()
        //  StringBuilder,reverse()
       // for loop
       // Deque(比Stack快好多!)
        // char [] arr1 = s.toCharArray;

       Deque<Character> deque = new LinkedList<>();
       StringBuilder reversed = new StringBuilder();
       for(int i =0; i< s.length();i++){
           // Space
           if(s.charAt(i) == ' '){
               reversed = reversed.append(reverse(deque)).append(" ");
               //deque.clear(); //
               continue;
           }
           //Not space
           deque.addLast(s.charAt(i));// auto-box
       }
       //Ending 或者 if 果度  i == s.length()-1 ,<< 最尾再做多次

       return reversed.append(reverse(deque)).toString();
        }

        public static String reverse(Deque<Character> dq){
            StringBuilder res = new StringBuilder();
            while(!dq.isEmpty()){
                res.append(dq.pollLast());
            }
            return res.toString();
        }
    }
