package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double[] sumSimple(int x, int y) {
    double[] sumAndAve;
    sumAndAve = new double[2];
    sumAndAve[0] = x + y;
    sumAndAve[1] = sumAndAve[0] / 2;
    return sumAndAve;
  }

  public double[] sumRange(int x, int y) {
    double[] sumAndAve;
    sumAndAve = new double[2];
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = sum + i;
    }
    sumAndAve[0] = sum;
    sumAndAve[1] = sumAndAve[0] / (y - x + 1);
    return sumAndAve;
  }

  public int[] sumSeparate(int x, int y) {
    int even = 0, odd = 0;
    int[] sum;
    sum = new int[2];
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        even = even + i;
      } else {
        odd = odd + i;
      }
    }
    sum[0] = odd;
    sum[1] = even;
    return sum;
  }
}
