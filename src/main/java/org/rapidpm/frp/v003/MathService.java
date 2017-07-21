package org.rapidpm.frp.v003;

import java.util.Random;


/**
 *
 */
public class MathService {

  public MathTask nextMathTask(int paramBoundFirst , int paramBoundSecond) {
    final Random random = new Random(System.nanoTime());
    int first = random.nextInt(paramBoundFirst);
    int second = random.nextInt(paramBoundSecond);
    return new MathTask(first , second , (first + second));
  }

  public boolean validate(MathTaskResult mathTaskResult){
    return mathTaskResult.getHumanResult() ==
           mathTaskResult.getMathTask().getResult();
  }
}
