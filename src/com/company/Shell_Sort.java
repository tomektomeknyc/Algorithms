package com.company;

/**
 * Created by Tom on 5/12/2022.
 */
public class Shell_Sort {
    public static void main(String[] args){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
int array = intArray.length;
System.out.print("The array length is: " + array);
System.out.println("");
        for(int gap = intArray.length/2; gap >0; gap /=2){
System.out.println("Gap: " + gap);
            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j = i;
                while (j >= gap &&  intArray[j - gap] > newElement){
                    intArray[j] = intArray[j - gap];
                    j -= gap;

                }
                intArray[j] = newElement;

            }
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]);
            System.out.print(" ");


        }

    }
}
