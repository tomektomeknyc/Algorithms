package com.company;

/**
 * Created by Tom on 5/11/2022.
 */
public class Insertion_Sort
{

    public static void main(String[] args){
        int[] intArray = {20, 35,-15, 7, 55, 1, -22};

        for (int firstUnsortedIndex=1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]);
            System.out.print(" ");

        }
    }
}
