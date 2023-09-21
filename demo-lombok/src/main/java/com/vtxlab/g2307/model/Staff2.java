package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true) //default false 無call到super
// @AllArgsConstructor <-- 不考慮parent class, 無用
@SuperBuilder //Human果邊都要有 >> superbuilder>有extends
public class Staff2 extends Human { //苦human無noargs constructor會紅
  private double salary;

  // You have to manually code the constructor with Parent's attribute
  public Staff2(String name, double salary){ //平時咁寫
    super(name);
    this.salary=salary;
  }

  public static void main(String[] args) {
    Staff2 s1 = new Staff2("John",3000.0);
    Staff2 s2 = new Staff2("Peter",3000.0);
    Staff2 s3 = new Staff2("John",24);
    System.out.println(s1.equals(s2)); // false, call左super

    Staff2 s4 =Staff2.builder()
      .name("andy")
      .salary(1.9)
      .build();
  }
}
