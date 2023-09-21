package com.example.codetestjava;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class) //無呢句行唔到，同Junit5配合(POMM)
@MockitoSettings(strictness = Strictness.LENIENT) // 降低嚴格度When verfy
public class MockTest {
// Mock---<unit test

    //試兩層->mock一層 鎖定constrant

    @Mock // 模擬  假，無遇過就出0，最底objject
    Calculator calculator;

    //你想test which class入面用另一類class的attributes//
    @InjectMocks // 背後睇你點new Checkout 自己搵野(相應constructor)
    Checkout checkout; // Checkout checkout = new Checkout(calculator);

    @Test
    void testSubstract(){
        Calculator selfNew = new Calculator(3);
    assertEquals(-7,selfNew.substract(10,6)); // 6-10-3 =-7
    assertEquals(6, selfNew.multiply(2,3)); // 3*2 =6
    }

    @Test
    void testAdd1(){
        // when 果下先 @Mock Checkout
         when(calculator.substract(3,4)).thenReturn(100); //當人地放3,4 點都return 100
        assertEquals(0, calculator.substract(9,4));
        // Mock唔meet when個條件，出0//
        // Checkout checkout = new Checkout(calculator);
///////// Testing Start
        int result = checkout.add(3,4); // Scenario : x>1 /return y+ this.calculator.substract(x, y);~100
        assertEquals(104, result); // y(4) +100
        verify(calculator, times(1)).substract(3, 4); //幫你verify，以防你用其他方法撞到104，一定要用佢個method
    }
/////////////// for checkout:add
// x>1 先return this.calculator......
// Therefore, in testAdd2 即使1,4same 唔僧去到

    @Test
    void testAdd2(){
        when(calculator.substract(1, 4)).thenReturn(1000);
        // Checkout checkout = new Checkout(calculator);
///////// Testing Start
        int result = checkout.add(1,4); // Scenario : x<=1 , return x+y，唔行
        assertEquals(5, result);
        verify(calculator, never()).substract(1, 4); // never means no touch substract(1,4)
    }
//////////////////同樣無touch到，但x>1 因為你add出黎0, can referto test multiply2 also
    @Test
    void testAdd2b(){
        when(calculator.substract(2, 12)).thenReturn(200);
        int result = checkout.add(22,12);
        assertEquals(12,result);
        verify(calculator, never()).substract(2, 12);
    }

    @Test
    void testAdd3(){
        int result = checkout.add(3,4);
        assertEquals(4,result);// return y+0
        
    }
    @Test
    void testMultiply(){
        when(calculator.substract(7, 9)).thenReturn(10000);
        when(calculator.multiply(7, 9)).thenReturn(10000);
        int result = checkout.multiply(7, 9);// Scneairo: x>1
        // return y+this.....
        assertEquals(10009, result); // 9+10000
    }
    //////////// when唔曬D條件//////////////////
    // 佢就算meet中左都出唔到
    @Test //出0例子!
    void testMultiply2(){
        when(calculator.substract(-1,8)).thenReturn(10000);
        int result = checkout.multiply(-1, 8); //x=-1,出default0
        //return this...multiply..>0(你無when到)..+this.subtract...>10000
        assertEquals(10000, result); // 10000 + 0
    }

    @Test
    void testMultiply2b(){
        when(calculator.substract(0, 8)).thenReturn(1000);
        int result = checkout.multiply(0, 8);
        assertEquals(1008,result);
    }
    @Test
    void testMultiply2c(){
        when(calculator.multiply(2, 2)).thenReturn(88);
        int result = checkout.multiply(2, 3);
        assertEquals(3,result);
    }
    }
