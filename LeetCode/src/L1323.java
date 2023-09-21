public class L1323 {
  public static void main(String[] args){
    int num = 9699;
    System.out.println(maximum69Number(num));
  }
    public static int maximum69Number (int num) {
        //  int -> String
        //String str = String.valueOf(num);
        char[] chars = String.valueOf(num).toCharArray();
        //System.out.println(str);
        for(int i = 0; i < chars.length; i++){
            // 1. 6->9,9->?
            if(chars[i] == '6'){
                chars[i] = '9';
                break;
            }
            // 2. at most 1 time, break?
            // 3. 9999?  
        }
        return Integer.valueOf(String.valueOf(chars)); //slow
    }
    public static int maximum69Number2(int num){

    
         int i = num;
         int divide =1;
         while(i>10){// 如果得單位便唔洗郁
             i/=10; // 9699>969>96>9.6
             divide *=10;
         }// 9969, divide =1000, 第一個step決定輸入的數字係有幾多個位
        //6669/1000 -> 9, 1000-> 100,9669 -> 669
        //669/100->6,669
        System.out.println(divide);
        i = num;
        while(divide > 0){
            if(i/divide ==6 ){
                num += divide*3;
                return num;
            }
            i = i -divide*(i/divide); //9969>669>69>9
            divide /= 10;
        }
        return num;
    }
}

