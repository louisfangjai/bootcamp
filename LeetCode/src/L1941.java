class Solution {
    public boolean areOccurrencesEqual(String s) {
        // Part 1:
        // arr[]
        int[] arr = new int[26]; // 'a' -> 97, 儲存數字

        for ( int i =0; i< s.length(); i++){ // read data > charAt, 改變先係toCharArray()
            arr[s.charAt(i)-'a']++; //a>97
        }
        //Part 2 : min max -> Check if all numbers are same
        int max =0;
        int min =1000; //條件佢話左s.length係1000
        for( int num: arr){
            if( num !=0){
                if(num>max)
                max = num;
                if(num<min)
                min = num;
                if(min !=max)
                return false;
            }   
        }
            return min==max;
    }
}