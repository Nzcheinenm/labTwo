package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arrayOne = {1,4,2,6,3};
        int[] arrayTwo = {6,5,4,3,2,1,7};

        System.out.println("Bubble, test 1 - " + Arrays.toString(bubbleSort(arrayOne))); // 6 4 3 2 1
        System.out.println("Select, test 1 - " + Arrays.toString(selectionSort(arrayOne)));
        System.out.println("Combine, test 1 - " + Arrays.toString(combineSort(arrayOne)) + "\n");

        System.out.println("Bubble, test 2 - " + Arrays.toString(bubbleSort(arrayTwo))); // 1 2 3 4 5 6 7
        System.out.println("Selection, test 2 - " + Arrays.toString(selectionSort(arrayTwo)));
        System.out.println("Combine, test 2 - " + Arrays.toString(combineSort(arrayTwo)));
    }

    private static int[] bubbleSort(int[] arr) {  // Сортировка методом Пузырька
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    return arr;
   }


   private static int[] selectionSort(int[] arr) {   // Сортировка выборкой
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = i;
                }
                int swap = arr[max];
                arr[max] = arr[i];
                arr[i] = swap;
            }
        }
        return arr;
   }

   private static int[] combineSort (int[] arr) {
        int lenArr = arr.length;

        while (lenArr > 1) {
            if (lenArr > 1) {
                lenArr = (int) (lenArr / 1.2473309);
            }
            for (int i = 0, j = lenArr; j < arr.length; i++, j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j + i];
                    arr[j + i] = swap;
                }
            }
        }
        return arr;
   }

}
