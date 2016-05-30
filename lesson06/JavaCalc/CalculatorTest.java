import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }


  @Test
  public void test2Minus2() {
    Calculator calculator = new Calculator();
    int sum = calculator.sub(-2, -32);
    assertEquals(30, sum);
  }
}
