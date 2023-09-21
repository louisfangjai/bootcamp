package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // annotation
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString(onlyExplicitlyIncluded = true) // 改變佢的功能，但正常係show曬
public class PersonLombok {
  private String name;
 @ToString.Include
  private int age;
// 寫program.. import
// VSCODE係你compile前幫你compile
// gen左allargs係個class
public void setName(String name){
this.name= name;
}
public String getName(){
  return this.name;
}
  public static void main(String[] args) {
    PersonLombok personLombok = new PersonLombok("Peter", 30);
    PersonLombok p2 = new PersonLombok();
    p2.setAge(13);
    p2.setName("Andy");
    System.out.println(p2.getAge());
    System.out.println(p2.getName());
    p2.getName();
    System.out.println(p2.toString()); // PersonLombok(name=Andy, age=13)
  }
}

//person 底層program: C++
//framewordk 
// <dep