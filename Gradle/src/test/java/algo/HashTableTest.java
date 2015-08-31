package algo;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Kalvin on 8/17/2015.
 */
public class HashTableTest{

    //@Test
    public void sortTest(){
        int hashCode = 2;
        System.out.println(31*hashCode%100);
        int[] result = new int[100];
        for(int i = 0; i < 100; i++){
            System.out.print(31*i%100 + ", ");
            result[i] = 31*i%100;
        }
        System.out.println();
        QuickSort foo = new QuickSort();
        System.out.println(Arrays.toString(foo.sort(result)));
    }

    @Test
    public void calculateHashTest(){
        HashTable table = new HashTable(100);

        System.out.println(table.calculateHash("apple"));
        System.out.println(table.calculateHash("banana"));
        System.out.println(table.calculateHash("orange"));
        System.out.println(table.calculateHash("watermelon"));
        System.out.println(table.calculateHash("grape"));


    }


}
