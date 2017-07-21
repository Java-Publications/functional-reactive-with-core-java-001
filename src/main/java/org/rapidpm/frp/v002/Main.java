package org.rapidpm.frp.v002;

/**
 *
 */
public class Main {
  public static void main(String[] args) {
    final MathService mathService = new MathService();
    final MathTask mathTask = mathService.nextMathTask();

    int humanResult = 0;
    MathTaskResult mathTaskResult = new MathTaskResult(mathTask , humanResult);

    boolean validate = mathService.validate(mathTaskResult);
  }

}
