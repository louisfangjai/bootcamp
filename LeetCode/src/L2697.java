//2697
class Solution {
    public String makeSmallestPalindrome(String s) {
        // egcfa
        //agcfa
        //afcfa //smallest唔洗計出黎
        // review睇有無重覆性
    char [] chs =s.toCharArray();//
    int j;
    int n = chs.length/2;
    for ( int i =0; i< chs.length/2;i++){ //
        //if(chs[i] != chs[chs.length-1-i]){ // 唔等如即係細過，remember
            j = chs.length-1-i;
            if(chs[i] < chs[j]) // a,f
                chs[j]=chs[i]; // a,a
            else  // 等如唔換位 f,a//else can use elseif
                chs[i] =chs[j]; // a,a 細D換落大位
    }
         return String.valueOf(chs);

      // egcfe //單數觀察左右野，回文>頭尾的事
      // result -> efcfe or egcge
      // abcd
      // result -> abba or dccd
      // seven
      // result -> seves-> neven  
    }
}