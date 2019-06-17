package com.huyouxiao.taomp.exercise.chapter1;

public enum PhilosopherStatusEnum {
  THINKING(0,"THINKING"), EATING(1, "EATING");
  private int status;
  private String label;
  private PhilosopherStatusEnum(int status, String label) {
    this.status = status;
    this.label = label;
  }
}
