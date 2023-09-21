public class Primitives {
    public static void main(String[] args){

        // Correct Syntax
        // Upcasting (Implicit conversion.Promotion)(隱藏地做)
        // byte->short->int->long->float->double (upcaste)
        // char -> int
        byte b = 2; // byte 128 not ok
        short s = b; // byte -> short, upcasting (promotion)
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        byte b2 = (byte)i;
        System.out.println("b2 = " + b2);
        // char -> int
        char c ='A';
        int j = c;
        System.out.println("j= "+j); //j=65

        // Downcasting
        double d2 = 10.3d;
        //float f2 = d2; // cannot convert, reason? why error? double precision(晶度損失，upcast無損失比做) is larger than float
        float f2 = (float) d2;// developer take responsibility for the risky of downcasting，強行咁做

        short s2 =128;
        // byte b2 =  s2; error
        byte b2 = (byte) s2;
        System.out.println("b2= "+ b2); //-128 (成個數變左，data lost)
       
        // for( byte k = 127; k < 129; k++){
        //     System.out.println("hello"); >無限LOOP 因為唔會去到128 (-128,-127,-126,-125loop....127再返去-128)
        // // }
        // int[] arr = new int[Integer.MAX_VALUE]; // 
        // for (int n = 0; n < arr.length; n++){
        // }

        char c2 = 'B'; //66 , ASCII Code
        if(c2 == 'B'){
            System.out.println("c2 is B");
        }
        if(c2 == 66){
            System.out.println("c2 is 66");
        }
        char c3 =67;
        if( c3 == 'C'){
            System.out.println("c3 is C");  
        }
        // ASCII (int) to char
        int g = 'a';
        System.out.println("g= "+g); // g=97
        int g2 = 66;
        char k = (char) g2; //Explicit  onversion/downcasting 強行做，char k = g2 ->唔得
        char k2 = 66;// why? downcast. char同數字相同，默認 66 is ASCII code, 無做conversion
        System.out.println("k= "+k); // k=B
        System.out.println("k2= "+k2); //k2 =B
        

        //
        int n = (int)1000L; // downcasting, Explicit conversion 強行做
        System.out.println("n= "+n); //n=1000
        short s10 = 128;
        byte o =(byte)s10;
        //byte o2 = 128; error //-> not ok
        System.out.println("o= "+o); //o=-128

        // 可以做加減數,compare，等如數字
        char character ='a'+ 1;
        if (character == 'b' ){
            System.out.println("character="+character);
        }
        if (character == 98){
            System.out.println("character="+character);
        }
        if ( character > 'a'){
            System.out.println("character > a");
        }
    }
}
