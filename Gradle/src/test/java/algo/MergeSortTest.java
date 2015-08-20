package algo;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Kalvin on 8/17/2015.
 */
public class MergeSortTest extends SortTestUtils{

    //@Test
    public void sortTest(){

        MergeSort mergeSort = new MergeSort();

        HashMap<int[], int[]> sortTests = generateTestMap();

        for(int[] array : sortTests.keySet()){
            assert array.equals(mergeSort.sort(array));
        }
    }

    @Test
    public void sortTestFoo(){

        MergeSort mergeSort = new MergeSort();

        HashMap<int[], int[]> sortTests = generateTestMap();

        int[] test = new int[]{22, 63, 42, 23, 1, 42, 51, 36};

        System.out.println(Arrays.toString(test));

        System.out.println(Arrays.toString(mergeSort.sort(test)));

    }
}
