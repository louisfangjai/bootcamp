package com.hkjava.bootcamp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int add(int x, int y){ //App.add(1,2) // 試app method唔洗test anotherMethod,assume constant(e.g100)
        // in this case, you only concern when x=1, is it return x?
        // anotherMethod自然會有佢ge test, unit TEst
        if(x>1){
            // let anotherMedthod(x+y)->1
            return y + anotherMethod(x+y); 
        }
        return x+y;
        // 若保留method,不斷call 會好heavy(method中method,for loop, if)
        // 唔理佢return咩你只係想test你自己logic
    }

    public static int anotherMethod(int z){
        return(z+2)/100;
    }

    public static int divide(int x, int y){
        return x/y;
    }
}
