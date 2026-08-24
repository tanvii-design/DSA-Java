package DS;

import java.util.Scanner;

class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("\nEnter array elements:");
        for (int index = 0; index < size; index++) {
            System.out.print("Element at index " + index + ": ");
            arr[index] = sc.nextInt();
        }

        // Printing array before sorting
        System.out.println("\nArray before Bubble Sort:");
        display(arr);

        // Creating BubbleSort object and sorting the array
        BubbleSort bubble = new BubbleSort();
        bubble.sort(arr);

        // Printing sorted array
        System.out.println("\nArray after Bubble Sort:");
        display(arr);

        sc.close();
    }

    // Method to print all elements of the array
    static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


class BubbleSort {

    // This method arranges the array elements in ascending order
    void sort(int[] arr) {

        // Each pass places the largest unsorted element
        // at its correct position
        for (int pass = 0; pass < arr.length - 1; pass++) {

            boolean swapped = false;

            // Compare adjacent elements
            for (int index = 0; index < arr.length - 1 - pass; index++) {

                // Swap when the left element is greater
                if (arr[index] > arr[index + 1]) {

                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping happened, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}