package com.company;

import java.lang.reflect.Array;

import static com.company.Arrays.*;
import static java.util.Arrays.sort;

/**
 * Created by Tom on 5/15/2022.
 */
public class Sorting_Arrays {

    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        sort(intArray);

        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]);
            System.out.print(" ");
        }
    }
}
