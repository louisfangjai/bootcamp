package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor // 代表住 Final, Non null field
public class Car {
  
  @NonNull
  private Integer capacity; // Integer default:null
  private final double weight=2.0; // final 一定要比佢，不可以default
  private String color;

  // public Car(){ //empty constructor duplicated -> compile error(重覆左)

  // }

    public Car(String color){ // 唔成立，因為要有個weight
      this.color=color;
     // this.weight=0.0;
    }

    // public Car(Integer capacity){
    //   this.capacity=capacity;
    // }

    public static void main(String[] args) {
      Car car = new Car(1); //capacity is marked non-null but is null
      // Car car2 = new Car();
      
    }
}
