package com.huyouxiao.taomp.exercise.chapter1;

public enum ChopstickStatusEnum {
  FREE(0,"FREE"), HOLD(1, "HOLD");
  private int status;
  private String label;
  private ChopstickStatusEnum(int status, String label) {
    this.status = status;
    this.label = label;
  }
}
