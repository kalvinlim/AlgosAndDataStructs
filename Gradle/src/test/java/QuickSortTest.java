import algo.QuickSort;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Kalvin on 8/17/2015.
 */
public class QuickSortTest {

    @Test
    public void sortTest(){
        HashMap<int[], int[]> sortTests = new HashMap<>();

        for(int[] array : sortTests.keySet()){
            sortTests.put(new int[]{63, 22, 42, 23, 1, 42, 51, 36}, new int[] {13, 20, 30, 31, 37, 43, 47, 76});
            sortTests.put(new int[]{10, 78,63, 20, 53, 6, 32, 83}, new int[] {1, 18, 23, 24, 33, 44, 52, 96});
            sortTests.put(new int[]{54, 4, 3, 96, 77, 3, 93, 9}, new int[] {1, 22, 23, 36, 42, 42, 51, 63});
            sortTests.put(new int[]{62, 44, 13, 76, 80, 17, 92, 6}, new int[] {1, 4, 17, 24, 32, 33, 92, 97});
            sortTests.put(new int[]{8, 19, 27, 86, 95, 18, 36, 22}, new int[] {1, 3, 12, 44, 51, 92, 93, 100});
            sortTests.put(new int[]{92, 17, 24, 32, 1, 97, 33, 4}, new int[] {6, 10, 20, 32, 53, 63, 78, 83});
            sortTests.put(new int[]{85, 91, 25, 93, 83, 91, 37, 19}, new int[] {3, 3, 4, 9, 54, 77, 93, 96});
            sortTests.put(new int[]{8, 56, 42, 21, 5, 22, 2, 47}, new int[] {6, 13, 17, 44, 62, 76, 80, 92});
            sortTests.put(new int[]{24, 1, 96 ,44 ,23, 52, 18, 33}, new int[] {19, 25, 37, 83, 85, 91, 91, 93});
            sortTests.put(new int[]{36, 69, 22, 89, 81, 87, 9, 3}, new int[] {2, 5, 8, 21, 22, 42, 47, 56});
            sortTests.put(new int[]{43, 47, 13, 37, 76, 30, 20, 31}, new int[] {8, 18, 19, 22, 27, 36, 86, 95});
            sortTests.put(new int[]{1, 92, 3, 12, 93, 100, 44, 51}, new int[]{3, 9, 22, 36, 69, 81, 87, 89});
            //System.out.println("Sorting:" + Arrays.toString(array) + ", result: " + Arrays.toString(QuickSort.sort(array)));
            assert array.equals(QuickSort.sort(array));
        }

    }

}
