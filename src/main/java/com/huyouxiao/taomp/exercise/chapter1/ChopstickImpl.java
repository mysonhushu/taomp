package com.huyouxiao.taomp.exercise.chapter1;

public class ChopstickImpl implements Chopstick {
  private ChopstickStatusEnum status = ChopstickStatusEnum.FREE;
  private int id;
  private Philosopher holder;

  public ChopstickImpl(int id) {
    this.id = id;
  }

  @Override
  public boolean free(Philosopher user) {
    if(null == holder) {
      return false;
    }
    if(null == user) {
      return false;
    }
    if(holder != user) {
      return false;
    }
    status = ChopstickStatusEnum.FREE;
    return true;
  }

  @Override
  public boolean hold(Philosopher philosopher) {
    if(null == philosopher) {
      return false;
    }
    if(null != holder && philosopher != holder) {
      return false;
    }
    holder = philosopher;
    status = ChopstickStatusEnum.HOLD;
    return true;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public Philosopher getHolder() {
    return holder;
  }
}
