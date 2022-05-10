import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SelectorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   @Test public void min1() {
      Collection<T> coll = {2, 8, 7, 3, 4};
      int expected = 2;
      int actual = Selector.min(coll, 2);
      Assert.assertEquals(expected, actual);
   }


      
   
}
