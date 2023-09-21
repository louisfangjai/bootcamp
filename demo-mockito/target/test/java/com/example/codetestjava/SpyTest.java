package com.example.codetestjava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class SpyTest {
  //SpyTest  無遇過就出default 是有實體object去行，有implementation, mock無
  // **用spy : 有D method係想穿過佢 有D想係constant >> no unit test
  // 防止
  @Spy // 真係new左個 Calculator咁
  Calculator calculator;

  @InjectMocks
  Checkout checkout;

  @Test
  void testAdd1(){
    when(calculator.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4); // x>1 :
    // return y+ this.calculator.substract(x, y);
    //return y+ 100
    assertEquals(104,result); // y(4)+100
    verify(calculator,times(1)).substract(3,4);
  }
  /////////// NO When ////////////////////<< spy會出default->
  //當有Object implements.... 
  //mock this.calculator.substract 出0, compare to TestAdd3 in Mock
  @Test
  void testAdd2(){
    when(calculator.substract(5, 4)).thenReturn(-2000);
    int result = checkout.add(3,4); // x>1->
    //return y+ this.calculator.substract(x, y);
    //return y-x-this.weight i.e y+y-x-2
    assertEquals(3,result); // 4 +(4-3-2)->3
    //佢this.calculator.substract(x,y)果舊野唔係出0
    verify(calculator, never()).substract(5, 4);
  }
//////////////// when 唔曬D條件//////////////////
    @Test
  void test3(){
    when(calculator.multiply(-2, 4)).thenReturn(100);
    int result = checkout.multiply(-2, 4); // x<0
    //return this.calculator.multiply(x, y)--->100
    //+this.calculator.substract(x, y) ----> y-x-this.weight->4-(-2)-2
    assertEquals(104, result); // 100+4
  }

  @Test
  void test3b(){
    when(calculator.multiply(-2,4)).thenReturn(100);
    when(calculator.substract(-2, 4)).thenReturn(200);
    int result = checkout.multiply(-2, 4);
    assertEquals(300,result);

    int result2 = checkout.add(-2, 4);
    assertEquals(2, result2);
  }
}
