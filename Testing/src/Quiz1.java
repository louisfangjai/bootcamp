import java.util.Arrays;

public class Quiz1 {
    public static void main(String[] args)  {
        
        // //Q1
        // int price =150;
        // int quantity =10;
        // int discount = 0.9;
        // System.out.println(price*quantity*discount);

        //Q5
        String str ="";
        byte b1 =127;
        byte b2 =(byte)128;
System.out.println("Q5 = "+str+b1+b2);
        //Q8
        String [] strings = new String[3];
        System.out.println(Arrays.toString(strings)); // [null, null, null]
        String sum = "";
        for ( int i = 0; i < 3; i++){
            strings[i] = String.valueOf(i);
            sum += strings[i];
        }
        System.out.println(sum);

        //Q9
        int x =10;
        String a = Integer.toString(x);
        System.out.println("a = "+a);
        String b="";
        b+=123;
        System.out.println(b);
        
        String strr = "abc";
        char strr1 ='b';
        if(strr.charAt(1)== strr1){
        System.out.println("it is equal");

        }

    }
}
