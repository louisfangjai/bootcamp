package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Laptop {
  private String os;
  @Setter // 按入去睇知道佢可以放係type, field, but AllArgsConstructor type only
  private int memory;

  public static void main(String[] args) {
    Laptop laptop = new Laptop("windows", 32);
    System.out.println(laptop.getMemory());
    System.out.println(laptop.getOs());
    laptop.setMemory(64);
    System.out.println(laptop.getMemory());
    //laptop.setOs("Mac"); // error
  }

}
