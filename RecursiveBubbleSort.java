package DS;

import java.util.Scanner;

class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Add elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.println("\nOriginal Array:");
        display(arr);

        // Recursive Bubble Sort
        RecursiveBubbleSort obj = new RecursiveBubbleSort();
        obj.recursiveBubbleSort(arr, arr.length);

        // Display sorted array
        System.out.println("\nSorted Array:");
        display(arr);

        sc.close();
    }

    static void display(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


class RecursiveBubbleSort {

    void recursiveBubbleSort(int[] arr, int size) {

        // Base condition
        if (size <= 1) {
            return;
        }

        // One pass of Bubble Sort
        for (int i = 0; i < size - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for remaining array
        recursiveBubbleSort(arr, size - 1);
    }
}
