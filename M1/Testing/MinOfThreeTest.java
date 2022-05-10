import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MinOfThreeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   //@Before public void setUp() {
   //}
   
   @Test public void test_1min1() {
   //boundary in
      int expected = Integer.MIN_VALUE;
      int actual = MinOfThree.min1(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      Assert.assertEquals(expected, actual);
   
   }
   
   @Test public void test_2min1() {
   //random int
   //typical test
      int actual = MinOfThree.min1(2, 3, 5);
      int expected = 2;
      Assert.assertEquals(expected, actual);
   }
   
   @Test public void test_3min1() {
   //typical test
      int actual = MinOfThree.min1(8, 3, 5);
      int expected = 3;
      Assert.assertEquals(expected, actual);
   }
   
   @Test public void test_4min1() {
   //typical test
      int actual = MinOfThree.min1(10, 11, 93);
      int expected = 10;
      Assert.assertEquals(expected, actual);
   }
   
   //duplicate
   @Test public void test_5min1() {
      int actual = MinOfThree.min1(2, 2, 2);
      int expected = 2;
      Assert.assertEquals(expected, actual);
   }
   
   @Test public void test_6min1() {
      int actual = MinOfThree.min1(3, 3, 8);
      int expected = 3;
      Assert.assertEquals(expected, actual);
   }
      
   @Test public void test_7min1() {
      int actual = MinOfThree.min1(4, 2, 2);
      int expected = 2;
      Assert.assertEquals(expected, actual);
   }
   
   //order
   @Test public void test_8min1() {
      int actual = MinOfThree.min1(2, 4, 6);
      int expected = 2;
      Assert.assertEquals(expected, actual);
   }
   
   @Test public void test_9min1() {
      int actual = MinOfThree.min1(1, 2, 3);
      int expected = 1;
      Assert.assertEquals(expected, actual);
   }
   
   
   


}
