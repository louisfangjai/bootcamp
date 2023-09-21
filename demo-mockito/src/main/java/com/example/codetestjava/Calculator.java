package com.example.codetestjava;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
  
 private int weight =2;
  

  public int substract(int x, int y){ // instance method
    return y-x-this.weight;// 你中意點改都得
  }


  public int multiply( int x, int y){

    return x*y;
  }
}