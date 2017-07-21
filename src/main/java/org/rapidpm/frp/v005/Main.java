package org.rapidpm.frp.v005;


import static org.rapidpm.frp.v005.MathService.nextMathTask;
import static org.rapidpm.frp.v005.MathService.validate;

/**
 *
 */
public class Main {
  public static void main(String[] args) {
    final MathTask mathTask =
        nextMathTask(10);

    int humanResult = 0;
    MathTaskResult mathTaskResult = new MathTaskResult(mathTask , humanResult);

    boolean validate = validate(mathTaskResult);

    System.out.println("mathTask = " + mathTask);
    System.out.println("mathTaskResult = " + mathTaskResult);
    System.out.println("validate = " + validate);
  }
}
