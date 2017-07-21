package org.rapidpm.frp.v001;

/**
 *
 */
public class MathTaskResult {

  private MathTask mathTask;
  private int humanResult;

  public MathTaskResult(MathTask mathTask , int humanResult) {
    this.mathTask = mathTask;
    this.humanResult = humanResult;
  }

  public MathTask getMathTask() {
    return mathTask;
  }

  public int getHumanResult() {
    return humanResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (! (o instanceof MathTaskResult)) return false;

    MathTaskResult that = (MathTaskResult) o;

    if (humanResult != that.humanResult) return false;
    return mathTask != null ? mathTask.equals(that.mathTask) : that.mathTask == null;
  }

  @Override
  public int hashCode() {
    int result = mathTask != null ? mathTask.hashCode() : 0;
    result = 31 * result + humanResult;
    return result;
  }

  @Override
  public String toString() {
    return "MathTaskResult{" +
           "mathTask=" + mathTask +
           ", humanResult=" + humanResult +
           '}';
  }
}
