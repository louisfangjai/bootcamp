package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor 同requried會撞
@RequiredArgsConstructor // The minimal args to create Student Object
@AllArgsConstructor
public class Student {
  // No final and no @NonNull attribute in this class
  private int age;

  public static void main(String[] args) {
    Student student = new Student(); // come from RequiredArgsConstgructor
    // Required...
    Student s2 = new Student(10); //args
  }
}
