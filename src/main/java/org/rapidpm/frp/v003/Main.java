package org.rapidpm.frp.v003;


/**
 *
 */
public class Main {
  public static void main(String[] args) {
    final MathService mathService = new MathService();
    final MathTask mathTask = mathService
        .nextMathTask(5,5);

    int humanResult = 0;
    MathTaskResult mathTaskResult = new MathTaskResult(mathTask , humanResult);

    boolean validate = mathService.validate(mathTaskResult);

    System.out.println("mathTask = " + mathTask);
    System.out.println("mathTaskResult = " + mathTaskResult);
    System.out.println("validate = " + validate);

  }

}
