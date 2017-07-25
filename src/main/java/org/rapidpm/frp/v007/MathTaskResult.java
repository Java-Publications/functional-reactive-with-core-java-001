package org.rapidpm.frp.v007;

import org.rapidpm.frp.model.Pair;

/**
 *
 */
public class MathTaskResult extends Pair<MathTask, Integer> {

  public MathTaskResult(MathTask mathTask , Integer integer) {
    super(mathTask , integer);
  }

  public MathTask getMathTask() {
    return getT1();
  }

  public int getHumanResult() {
    return getT2();
  }

  @Override
  public String toString() {
    return "MathTaskResult{" +
           "mathTask=" + getT1() +
           ", humanResult=" + getT2() +
           '}';
  }
}
