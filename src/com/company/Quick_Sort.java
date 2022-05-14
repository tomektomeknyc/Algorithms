package com.company;

/**
 * Created by Tom on 5/14/2022.
 */
public class Quick_Sort {

    public static void main(String[]args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
quickSort(intArray,0,intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            System.out.print(" ");

        }
    }
    public static void quickSort(int[] input, int start, int end){

        if ( end - start < 2){

            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }
    public static int partition(int [] input, int start, int end){
        //This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        while(i < j){
            // empty loop body
            while (i < j && input [--j] >= pivot);
            // we use j to find the first element less than a pivot and we want to put those
            // elements to the left of the pivot.
            if(i < j){
                input[i] = input[j];
            }
            // looking for first element greater than a pivot
            // empty loop body
            while ( i < j && input[++i] <= pivot);
            if( i < j){
                input[j] = input[i];
            }
        }
       input[j]= pivot;
        return j;

    }
}
