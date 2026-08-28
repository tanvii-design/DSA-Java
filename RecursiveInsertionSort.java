package DS;

import java.util.Scanner;

class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking elements from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting:");
        printArray(arr);

        // Calling recursive insertion sort
        RecursiveInsertionSort obj = new RecursiveInsertionSort();
        obj.sort(arr, n);

        System.out.println("\nArray after sorting:");
        printArray(arr);

        sc.close();
    }

    // Displays array elements
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


class RecursiveInsertionSort {

    void sort(int[] arr, int n) {

        // Base condition
        if (n <= 1) {
            return;
        }

        // First sort the previous n-1 elements
        sort(arr, n - 1);

        // Store the last element
        int key = arr[n - 1];

        int position = n - 2;

        // Move bigger elements one position ahead
        while (position >= 0 && arr[position] > key) {
            arr[position + 1] = arr[position];
            position--;
        }

        // Put key at its correct position
        arr[position + 1] = key;
    }
}