package com.huyouxiao.taomp.exercise.chapter1;


public class PhilosopherImpl implements Philosopher{

  private PhilosopherStatusEnum status = PhilosopherStatusEnum.THINKING;
  private Integer seatNumber;
  private Chopstick leftChopstick;
  private Chopstick rightChopstick;

  public PhilosopherImpl(Integer seatNumber, Chopstick left, Chopstick right) {
    this.seatNumber = seatNumber;
    this.leftChopstick = left;
    this.rightChopstick = right;
  }


  @Override
  public boolean think() {
     if( this == leftChopstick.getHolder() && this == rightChopstick.getHolder()) {
       leftChopstick.free(this);
       rightChopstick.free(this);
       status = PhilosopherStatusEnum.THINKING;
       return true;
     }
     return false;
  }

  @Override
  public boolean eat() {
    if(this == leftChopstick.getHolder() || this == rightChopstick.getHolder()) {
      return false;
    }

    leftChopstick.hold(this);
    rightChopstick.hold(this);
    status = PhilosopherStatusEnum.EATING;
    return true;
  }

  @Override
  public PhilosopherStatusEnum status() {
    return status;
  }

  @Override
  public Integer getSeatNumber() {
    return seatNumber;
  }

  @Override
  public Chopstick getLeftChopstick() {
    return leftChopstick;
  }

  @Override
  public Chopstick getRightChopstick() {
    return rightChopstick;
  }

}
