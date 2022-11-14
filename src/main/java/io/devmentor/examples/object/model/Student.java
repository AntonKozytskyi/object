/*
 * Copyright (C) 2022 DevMentor.IO. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package io.devmentor.examples.object.model;

public class Student {

  private String firstName;
  private String secondName;
  private String gender;

  public Student() {
  }

  public Student(String firstName, String secondName, String gender) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.gender = gender;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
