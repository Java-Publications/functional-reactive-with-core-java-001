package org.rapidpm.frp.v006;

import java.util.Random;
import java.util.function.Function;


/**
 *
 */
public interface MathService {

//  public static Function<Integer, MathTask> mathTask = new Function<Integer, MathTask>() {
//    @Override
//    public MathTask apply(Integer maxResultValue) {
//      final Random random = new Random(System.nanoTime());
//      int bound = maxResultValue / 2;
//      int first = random.nextInt(bound);
//      int second = random.nextInt(bound);
//      return new MathTask(first , second , (first + second));
//    }
//  };

//  public static Function<Integer, MathTask> mathTask = (maxResultValue) -> {
//    final Random random = new Random(System.nanoTime());
//    int bound = maxResultValue / 2;
//    int first = random.nextInt(bound);
//    int second = random.nextInt(bound);
//    return new MathTask(first , second , (first + second));
//  };

  static Function<Integer, MathTask> mathTaskFunction() {
    return (maxResultValue) -> {
      final Random random = new Random(System.nanoTime());
      int bound = maxResultValue / 2;
      int first = random.nextInt(bound);
      int second = random.nextInt(bound);
      return new MathTask(first , second , (first + second));
    };
  }


//  static MathTask nextMathTask(int maxResultValue) {
//    final Random random = new Random(System.nanoTime());
//    int bound = maxResultValue / 2;
//    int first = random.nextInt(bound);
//    int second = random.nextInt(bound);
//    return new MathTask(first , second , (first + second));
//  }

//  static boolean validate(MathTaskResult mathTaskResult) {
//    return mathTaskResult.getHumanResult() ==
//           mathTaskResult.getMathTask().getResult();
//  }

  static Function<MathTaskResult, Boolean> validate(){
    return (mathTaskResult) -> mathTaskResult.getHumanResult() ==
                             mathTaskResult.getMathTask().getResult();
  }


}
