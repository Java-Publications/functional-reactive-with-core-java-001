package org.rapidpm.frp.v006;


import static org.rapidpm.frp.v006.MathService.mathTaskFunction;
import static org.rapidpm.frp.v006.MathService.validate;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.rapidpm.frp.model.Pair;

/**
 *
 */
public class Main {
  public static void main(String[] args) {

    int maxResultValue = 10;
    int humanResult = 0;

    //v001
//    final MathTask mathTask = nextMathTask(10);
//    final MathTask mathTask = MathService.mathTask.apply(maxResultValue);
//    MathTaskResult mathTaskResult = new MathTaskResult(mathTask , humanResult);
//
//    boolean validate = validate(mathTaskResult);


    //v002
//    final Function<Integer, MathTask> mathTaskFunction = MathService.mathTaskFunction();
//    final MathTask mathTask = mathTaskFunction.apply(maxResultValue);
//
//    final BiFunction<Integer, MathTask, MathTaskResult> resultBiFkt
//        = (humanResult , task) -> new MathTaskResult(task , humanResult);
//
//    final MathTaskResult mathTaskResult = resultBiFkt.apply(humanResult , mathTask);
//
//    final Function<MathTaskResult, Boolean> validate = MathService.validate();
//    Boolean apply = validate.apply(mathTaskResult);
//


    //v003
//    final BiFunction<Integer, MathTask, MathTaskResult> resultBiFkt
//        = (result , task) -> new MathTaskResult(task , result);
//    BiFunction<Integer, MathTask, Boolean> andThen = resultBiFkt.andThen(validate());
//    MathTask mathTask = MathService.mathTaskFunction().apply(maxResultValue);
//    Boolean aBoolean = andThen.apply(humanResult , mathTask);


    //v004
//    final BiFunction<Integer, MathTask, MathTaskResult> resultBiFkt
//        = (result , task) -> new MathTaskResult(task , result);
//
//    Boolean result = resultBiFkt
//        .andThen(validate())
//        .apply(humanResult , mathTaskFunction().apply(maxResultValue));
//

    //v005 - A
//    final Function<Integer, MathTask> mathTaskFunction = mathTaskFunction();
//    final Function<MathTaskResult, Boolean> validateFunction = validate();
//    final Function<Pair<MathTask,Integer>, MathTaskResult> mapToMathTaskResult = (resultPair) -> new MathTaskResult(resultPair.getT1() , resultPair.getT2());
//
//    Function<Integer, Pair<MathTask, Integer>> integerPairFunction = mathTaskFunction.andThen(new Function<MathTask, Pair<MathTask, Integer>>() {
//      @Override
//      public Pair<MathTask, Integer> apply(MathTask mathTask) {
//        return new Pair<>(mathTask , humanResult);
//      }
//    });
//    Function<Integer, Boolean> finalFkt = integerPairFunction.andThen(mapToMathTaskResult).andThen(validateFunction);
//    //Input MaxResult - OutPut HumanResult is Valid ?
//    Boolean aBoolean = finalFkt.apply(maxResultValue);

    //v005 - B
//    final Function<Integer, Pair<MathTask, Integer>> integerPairFunction = mathTaskFunction()
//        .andThen(mathTask -> new Pair<>(mathTask , humanResult));
//
//    final Function<Pair<MathTask, Integer>, MathTaskResult> mapToMathTaskResult
//        = (resultPair) -> new MathTaskResult(resultPair.getT1() , resultPair.getT2());
//
//    Boolean aBoolean = integerPairFunction
//        .andThen(mapToMathTaskResult)
//        .andThen(validate())
//        .apply(maxResultValue);

    // Here : how to print Values on screen?
    // here : humanResult is available later !

    // target: mapToMathTaskResult humanResult into an input param of thew last fkt.

//    Function<HumanResult, Boolean> finalFunktion


    final MathTask mathTask = mathTaskFunction().apply(maxResultValue); //t1 - show the values on Screen

    final Function<Pair<MathTask, Integer>, MathTaskResult> mapToMathTaskResult
        = (resultPair) -> new MathTaskResult(resultPair.getT1() , resultPair.getT2());

    final Boolean aBoolean = mapToMathTaskResult //t2 - button was pressed
        .andThen(validate())
        .apply(new Pair<>(mathTask , humanResult));



  }
}
