package algo;

import algo.QuickSort;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Kalvin on 8/17/2015.
 */
public class QuickSortTest extends SortTestUtils {

    @Test
    public void sortTest(){

        QuickSort quickSort = new QuickSort();

        HashMap<int[], int[]> sortTests = generateTestMap();

        for(int[] array : sortTests.keySet()){
            assert array.equals(quickSort.sort(array));
        }

    }

}
