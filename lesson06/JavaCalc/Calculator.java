public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }

  public int add(Integer a, Integer b) {
    return a+b;
  }


  public int sub(Integer a, Integer b) {
    return a-b;
  }
}
