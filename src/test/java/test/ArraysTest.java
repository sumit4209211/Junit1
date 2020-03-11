package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {
  @Test(expected = NullPointerException.class)
    public  void testArraySort_RandomArray(){
      int[] numbers={};
      int[] expected={1,4,3,12};
          Arrays.sort(numbers);
  }
  @Test
    public void testSort_Performance(){
      int array[]={12,23,4};
      for (int i=1;i<=10000;i++){
          array[0]=i;
          Arrays.sort(array);
      }
  }
}
