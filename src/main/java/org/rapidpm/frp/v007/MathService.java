package org.rapidpm.frp.v007;

import java.util.Random;
import java.util.function.Function;

import org.rapidpm.frp.model.Pair;


/**
 *
 */
public interface MathService {

  static Function<Integer, MathTask> mathTaskFunction() {
    return (maxResultValue) -> {
      final Random random = new Random(System.nanoTime());
      int bound = maxResultValue / 2;
      int first = random.nextInt(bound);
      int second = random.nextInt(bound);
      return new MathTask(first , second , (first + second));
    };
  }

  static Function<MathTaskResult, Boolean> validate(){
    return (mathTaskResult) -> mathTaskResult.getHumanResult() ==
                             mathTaskResult.getMathTask().getResult();
  }

  static Function<Pair<MathTask, Integer>, MathTaskResult> mapToMathTaskResult(){
    return (resultPair) -> new MathTaskResult(resultPair.getT1() , resultPair.getT2());
  }



}
