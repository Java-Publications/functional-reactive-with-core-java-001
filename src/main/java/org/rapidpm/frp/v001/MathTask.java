package org.rapidpm.frp.v001;

/**
 *
 */
public class MathTask {

  private int first;
  private int second;
  private int result;

  public MathTask(int first , int second , int result) {
    this.first = first;
    this.second = second;
    this.result = result;
  }

  @Override
  public String toString() {
    return "MathTask{" +
           "first=" + first +
           ", second=" + second +
           ", result=" + result +
           '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (! (o instanceof MathTask)) return false;

    MathTask mathTask = (MathTask) o;

    if (first != mathTask.first) return false;
    if (second != mathTask.second) return false;
    return result == mathTask.result;
  }

  @Override
  public int hashCode() {
    int result1 = first;
    result1 = 31 * result1 + second;
    result1 = 31 * result1 + result;
    return result1;
  }

  public int getFirst() {
    return first;
  }

  public int getSecond() {
    return second;
  }

  public int getResult() {
    return result;
  }

}
