package org.rapidpm.frp.v001;

/**
 *
 */
public class MathService {
  public MathTask nextMathTask() {
    int first = 0;
    int second = 0;
    int result = 0;
    // create task...

    return new MathTask(first , second , (first + second));
  }


  public boolean validate(MathTaskResult mathTaskResult){
    return mathTaskResult.getHumanResult() ==
           mathTaskResult.getMathTask().getResult();
  }



}
