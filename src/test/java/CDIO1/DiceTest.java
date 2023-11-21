package CDIO1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DiceTest {
  private static RaffleCup cup; 
  private static int runCount;
  @BeforeAll
  public static void runCount(){
    runCount = 1000;
    cup = new RaffleCup(2, 6);
  }
  @Test
  public void isFair() {
    
    int[] sides = new int[6];
    for (int i = 0; i < runCount; i++) {
      cup.roll();
      for (int j : cup.getSides()) {
        sides[j-1]++;
      }
    }
    double mean = 0;
    for (int i = 0; i < sides.length; i++) {
      mean += sides[i] * (i+1);
    }
    mean /= (double)(runCount*2);
    double deviation = 0;
    for (int i = 0; i < sides.length; i++) {
      deviation += Math.pow((i+1)-mean,2)*sides[i];
    }
    deviation = Math.sqrt(deviation / (double)(runCount * 2));
    double fairMean = (double)(1 + 2 + 3 + 4 + 5 + 6) / 6d;
    double fairDeviation = Math.sqrt(
      Math.pow(1 - mean, 2) * (1d / 6d)+
      Math.pow(2 - mean, 2) * (1d / 6d)+
      Math.pow(3 - mean, 2) * (1d / 6d)+
      Math.pow(4 - mean, 2) * (1d / 6d)+
      Math.pow(5 - mean, 2) * (1d / 6d)+
      Math.pow(6 - mean, 2) * (1d / 6d)
    );
    String out = "dice fairness\n\tmean: " + mean + "\n\tdeviation: " + deviation;
    assertTrue(
      deviation < (fairDeviation * 1.1d) &&
      deviation > (fairDeviation / 1.1d) && 
      mean < (fairMean) * 1.1d && 
      mean > (fairMean) / 1.1d,
      out
    );
  }
  @Test
  public void isFast() {
    int i = 0;
    long end = 0;
    long start = System.currentTimeMillis();
    while (i < runCount) {
      DiceTestCalls.Turn();
      i++;
    }
    end = System.currentTimeMillis();
    System.out.print("\n".repeat(10));
    String out = "dice speed\n\ttime taken " + (double)(end-start) + "ms\n\tallowed: " + ((333d+1d/3d)*runCount) + "ms";
    assertTrue(
      (end-start)/runCount < (333f + 1f/3f),
      out
    );
  }
}
