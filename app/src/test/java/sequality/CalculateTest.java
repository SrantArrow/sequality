package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testsumSimple() {
    Calculate calculate = new Calculate();
    double[] expected = { 5.0, 2.5 };
    assertArrayEquals(expected, calculate.sumSimple(2, 3), 0.1);
  }

  @Test
  public void testsumRange() {
    Calculate calculate = new Calculate();
    double[] expected = { 55.0, 5.5 };
    assertArrayEquals(expected, calculate.sumRange(1, 10), 0.1);
  }

  @Test
  public void testsumSeparate() {
    Calculate calculate = new Calculate();
    int[] expected = { 25, 30 };
    assertArrayEquals(expected, calculate.sumSeparate(1, 10));
  }
}
