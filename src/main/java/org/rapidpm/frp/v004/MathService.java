package org.rapidpm.frp.v004;

import java.util.Random;


/**
 *
 */
public interface MathService {

  public static MathTask nextMathTask(int paramBoundFirst , int paramBoundSecond) {
    final Random random = new Random(System.nanoTime());
    int first = random.nextInt(paramBoundFirst);
    int second = random.nextInt(paramBoundSecond);
    return new MathTask(first , second , (first + second));
  }

  public static boolean validate(MathTaskResult mathTaskResult){
    return mathTaskResult.getHumanResult() ==
           mathTaskResult.getMathTask().getResult();
  }
}
