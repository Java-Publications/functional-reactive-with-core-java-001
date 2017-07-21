package org.rapidpm.frp.v005;

import org.rapidpm.frp.model.Tripel;

/**
 *
 */
public class MathTask extends Tripel<Integer, Integer, Integer> {

  public MathTask(Integer integer , Integer integer2 , Integer integer3) {
    super(integer , integer2 , integer3);
  }
  public int getFirst() {
    return getT1();
  }

  public int getSecond() {
    return getT2();
  }

  public int getResult() {
    return getT3();
  }


  @Override
  public String toString() {
    return "MathTask{" +
           "first=" + getT1() +
           ", second=" + getT2() +
           ", result=" + getT3() +
           '}';
  }
}
