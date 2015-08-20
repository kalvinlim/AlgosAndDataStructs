package algo;

import java.util.Arrays;

/**
 * Created by Kalvin on 8/18/2015.
 */
public class MergeSort implements SortAlgorithm {
    private int[] numbers;
    private int[] temp;


    @Override
    public int[] sort(int[] input) {
        numbers = input;
        temp = new int[input.length];
        doMergeSort(0, input.length - 1);
        return numbers;
    }

    private void doMergeSort(int low, int high){
        if(low < high) {
            int mid = low + (high - low) / 2;
            doMergeSort(low, mid); //Recurse until smallest case- 2 elements.
            doMergeSort(mid + 1, high);
            merge(low, mid, high);
        }

    }
    private void merge(int low, int mid, int high){
        for(int i = low; i <= high ; i++){
            temp[i] = numbers[i];
        }
        int i = low;
        int j = mid+1;
        int index = low;

        while(i <= mid && j <= high){
            if(temp[i] < temp[j]){
                numbers[index] = temp[i];
                i++;
            }
            else {
                numbers[index] = temp[j];
                j++;
            }
            index++;
        }

        while (i <= mid) {
            numbers[index] = temp[i];
            index++;
            i++;
        }

    }
}
