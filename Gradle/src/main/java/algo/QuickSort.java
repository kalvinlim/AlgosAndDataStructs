package algo;

import java.util.Arrays;

/**
 * Created by Kalvin on 8/17/2015.
 */
public class QuickSort implements SortAlgorithm{


    @Override
    public int[] sort(int[] input){
        if(input == null || input.length == 0){
            return null;
        }
        quickSort(input, 0, input.length - 1);

        return input;
    }
    private void quickSort(int[] input, int low, int high){
        int leftIndex = low, rightIndex = high;
        int pivot = input[leftIndex + (rightIndex - leftIndex ) / 2];

        while(input[leftIndex] < pivot){
            leftIndex++;
        }
        while(input[rightIndex] > pivot){
            rightIndex--;
        }
        if(leftIndex <= rightIndex){
            swap(input, leftIndex, rightIndex);

            leftIndex++;
            rightIndex--;
        }

        if(low < rightIndex){
            quickSort(input, low, rightIndex);
        }
        if(leftIndex < high){
            quickSort(input, leftIndex, high);
        }

    }

    private void swap(int[] input, int low, int high){
        int temp = input[low];
        input[low] = input[high];
        input[high] = temp;
    }
}
