package com.huyouxiao.taomp.exercise.chapter1;


public interface Chopstick {
  boolean free(Philosopher user);
  boolean hold(Philosopher philosopher);
  int getId();
  Philosopher getHolder();
}
