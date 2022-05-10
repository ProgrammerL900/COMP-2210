import java.util.Arrays;

/**
* Defines a library of selection methods
* on arrays of ints.
*
* @author   Laura Wilson (LGW0020@auburn.edu)
* @author   Dean Hendrix (dh@auburn.edu)
* @version  TODAY
*
*/
public final class Selector {

   /**
    * Can't instantiate this class.
    *
    * D O   N O T   C H A N G E   T H I S   C O N S T R U C T O R
    *
    */
   private Selector() { }
   
  /**
   public static void main(String[] args) {
      int[] a = {-3, 3, 9, 7, 0};
      System.out.println(ceiling(a, 11));
   
   }
*/
   


   /**
    * Selects the minimum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int min(int[] a) {
   
      if (a == null|| a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      int m = a[0];
      
      for (int i = 1; i < a.length; i++) {
         if (a[i] < m) {
            m = a[i];
         }
         
      }
      return m;
   }


   /**
    * Selects the maximum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int max(int[] a) {
      if (a == null|| a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      int mx = a[0];
      for (int i = 1; i < a.length; i++) {
         if (a[i] > mx) {
            mx = a[i];
         }
         
      }
      return mx;
   }


   /**
    * Selects the kth minimum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth minimum value. Note that there is no kth
    * minimum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmin(int[] a, int k) {
      if (a == null|| a.length == 0 || k < 1 || k > a.length){
         throw new IllegalArgumentException();
      }
      
      int min = 0;
      
      
      
      int[] b = Arrays.copyOf(a, a.length);
      Arrays.sort(b);
      int[] c = new int[b.length];
      c[0] = b[0];
      int dup = 1;
      for (int i = 1; i < b.length; i++) {
         if (b[i] != b[i - 1]) {
            c[dup] = b[i];
            dup++;
         }
      }
      if (k < 1 || k > c.length) {
         throw new IllegalArgumentException();
      }
      else {
         int i = c.length - 1;
         int num = c.length;
         while (c[i] == 0) {
            num--;
            i--;
         }
         int[] d = Arrays.copyOf(c, num);
         if (k > d.length) {
            throw new IllegalArgumentException();
         }
         else {
            min = d[k - 1];  
         } 
      }
      return min;      
                       
      
     
      
      
   }


   /**
    * Selects the kth maximum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth maximum value. Note that there is no kth
    * maximum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmax(int[] a, int k) {
      if (a == null|| a.length == 0 || k < 1 || k > a.length) {
         throw new IllegalArgumentException();
      }
      
      int max = 0;
      
      int[] b = Arrays.copyOf(a, a.length);
      Arrays.sort(b);
      int[] c = new int[b.length];
      c[0] = b[0];
      int dup = 1;
      for (int i = 1; i < b.length; i++) {
         if (b[i] != b[i - 1]) {
            c[dup] = b[i];
            dup++;
         }
      }
      if (k < 1 || k > c.length) {
         throw new IllegalArgumentException();
      }
      else {
         int i = c.length - 1;
         int num = c.length;
         while (c[i] == 0) {
            num--;
            i--;
         }
         int[] d = Arrays.copyOf(c, num);
         if (k > d.length) {
            throw new IllegalArgumentException();
         }
         else {
            max = d[d.length - k];  
         } 
      }
      return max;
      
      
   }


   /**
    * Returns an array containing all the values in a in the
    * range [low..high]; that is, all the values that are greater
    * than or equal to low and less than or equal to high,
    * including duplicate values. The length of the returned array
    * is the same as the number of values in the range [low..high].
    * If there are no qualifying values, this method returns a
    * zero-length array. Note that low and high do not have
    * to be actual values in a. This method throws an
    * IllegalArgumentException if a is null or has zero length.
    * The array a is not changed by this method.
    */
   public static int[] range(int[] a, int low, int high) {
      if (a == null|| a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      int n = 0;
         
      for (int i = 0; i < a.length; i++) {
         if ((a[i] >= low) && ( a[i] <= high)) {
            n++;
         }
      }
      
      int rg[] = new int[n];
      n = 0;
      
      for (int i = 0; i < a.length; i++) {
         if ((a[i] >= low) && ( a[i] <= high)) {
            rg[n] = a[i]; 
            n++;
         }
      }
      
      Arrays.toString(rg);
      
      return rg;
      
   
      
              
   
   }
          
   


   /**
    * Returns the smallest value in a that is greater than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int ceiling(int[] a, int key) {
      if (a == null|| a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      int t = -99;
      
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= key) {
            t = a[i];
            continue;
         }
      }
      
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= key && a[i] < t) {
            t = a[i];
         }
      }
      
      if (t == -99) {
         throw new IllegalArgumentException();
      }
   
   
      return t;
   }


   /**
    * Returns the largest value in a that is less than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int floor(int[] a, int key) {
      if (a == null|| a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      
      int t = -99;
      
      for (int i = 0; i < a.length; i++) {
         if(a[i] <= key) {
            t = a[i];
            continue;
         }
      }
      
      for (int i = 0; i < a.length; i++) {
         if (a[i] <= key && a[i] > t) {
            t = a[i];
         }
      }
      
      if (t == -99) {
         throw new IllegalArgumentException();
      }
   
     
           
      return t;
   }

}
