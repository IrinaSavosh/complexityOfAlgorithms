import java.util.Arrays;

public class Program {
   public static void main(String[] args) {
      int[] array = new int[] { 5, 6, 8, 3, 8, 1, 0, 5, 8, 9 };
      System.out.println(Arrays.toString(array));
      // HeapSort sortedArr = new HeapSort();
      HeapSort.sort(array);
      System.out.println("--------------------");

      System.out.println(Arrays.toString(array));

   }

}
