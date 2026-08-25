package DS;

import java.util.Scanner;

class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Read array elements from the user
        System.out.println("\nEnter the array elements:");

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            arr[index] = sc.nextInt();
        }

        // Show the array before sorting
        System.out.println("\nArray before sorting:");
        display(arr);

        // Create object and perform Insertion Sort
        InsertionSort insertion = new InsertionSort();
        insertion.sort(arr);

        // Show the sorted array
        System.out.println("\nArray after Insertion Sort:");
        display(arr);

        sc.close();
    }

    // Method for displaying array elements
    static void display(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}


class InsertionSort {

    // Sorts the array in ascending order
    void sort(int[] arr) {

        // Start from the second element because
        // the first element is already considered sorted
        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            // Shift larger elements one position to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the current element at its correct position
            arr[j + 1] = current;
        }
    }
}