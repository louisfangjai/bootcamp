package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false) //default false 無call到super
// @AllArgsConstructor <-- 不考慮parent class, 無用
public class Staff extends Human { //苦human無noargs constructor會紅
  private double salary;

  // You have to manually code the constructor with Parent's attribute
  public Staff(String name, double salary){ //平時咁寫
    super(name);
    this.salary=salary;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("John",3000.0);
    Staff staff2 = new Staff("Peter",3000.0);
    Staff staff3 = new Staff("John",24);
    System.out.println(staff.equals(staff2)); // true, 因為佢當左你salary一樣就同一個人
  }
}
