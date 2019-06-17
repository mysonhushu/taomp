package com.huyouxiao.taomp.exercise.chapter1;

public interface Philosopher {
  boolean think();
  boolean eat();
  PhilosopherStatusEnum status();
  Integer getSeatNumber();
  Chopstick getLeftChopstick();
  Chopstick getRightChopstick();
}
