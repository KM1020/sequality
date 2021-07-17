package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest{
  @Test
  public void testSum(){
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2,3));

  }

  @Test
  public void testAve(){
    Calculate calculate = new Calculate();
    double exp = 2.5;
    assertEquals(exp, calculate.ave(2,3), 0.0);

  }

  @Test
  public void testLoop_sum(){
    Calculate calculate = new Calculate();
    int expected = 55;
    int x = 1, y = 10;
    assertEquals(expected, calculate.loop_sum(x,y));

  }

  @Test
  public void testLoop_ave(){
    Calculate calculate = new Calculate();
    double expected = 5.5;
    int x = 1, y = 10;
    assertEquals(expected, calculate.loop_ave(x,y), 0.0);

  }

  @Test
  public void testOdd(){
    Calculate calculate = new Calculate();
    int expected = 25;
    int x=1, y=10;
    assertEquals(expected, calculate.odd_even(x,y,1));

  }

  @Test
  public void testEven(){
    Calculate calculate = new Calculate();
    int expected = 30;
    int x=1, y=10;
    assertEquals(expected, calculate.odd_even(x,y,0));

  }

}
