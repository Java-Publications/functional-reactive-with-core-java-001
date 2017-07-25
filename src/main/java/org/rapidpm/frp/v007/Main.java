package org.rapidpm.frp.v007;


import static org.rapidpm.frp.v007.MathService.mapToMathTaskResult;
import static org.rapidpm.frp.v007.MathService.mathTaskFunction;
import static org.rapidpm.frp.v007.MathService.validate;

import org.rapidpm.frp.model.Pair;

/**
 *
 */
public class Main {
  public static void main(String[] args) {

    int maxResultValue = 10;
    int humanResult = 0;

    final MathTask mathTask = mathTaskFunction().apply(maxResultValue); //t1 - show the values on Screen

    //t2 - button was pressed
    final Boolean aBoolean = validate().compose(mapToMathTaskResult()).apply(new Pair<>(mathTask , humanResult));

//    final Boolean aBoolean = mapToMathTaskResult().andThen(validate()).apply(new Pair<>(mathTask , humanResult)
  }
}
