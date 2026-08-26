package DS;

import java.util.Scanner;
import java.util.ArrayList;

class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size from the user
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Accepting array elements
        System.out.println("\nEnter the array elements:");

        for (int index = 0; index < size; index++) {
            System.out.print("Element at index " + index + ": ");
            arr[index] = sc.nextInt();
        }

        // Display original array
        System.out.println("\nArray before Merge Sort:");
        display(arr);

        // Create MergeSort object and start sorting
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);

        // Display sorted array
        System.out.println("\nArray after Merge Sort:");
        display(arr);

        sc.close();
    }

    // Method to print the array
    static void display(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}


class MergeSort {

    // Divides the array into smaller parts
    void sort(int[] arr, int start, int end) {

        // Stop dividing when only one element remains
        if (start >= end) {
            return;
        }

        int middle = start + (end - start) / 2;

        // Sort the left half
        sort(arr, start, middle);

        // Sort the right half
        sort(arr, middle + 1, end);

        // Combine both sorted halves
        merge(arr, start, middle, end);
    }


    // Merges two sorted parts of the array
    void merge(int[] arr, int start, int middle, int end) {

        ArrayList<Integer> temporary = new ArrayList<>();

        int first = start;
        int second = middle + 1;

        // Compare elements from both halves
        while (first <= middle && second <= end) {

            if (arr[first] <= arr[second]) {
                temporary.add(arr[first]);
                first++;
            } else {
                temporary.add(arr[second]);
                second++;
            }
        }

        // Add remaining elements from the left half
        while (first <= middle) {
            temporary.add(arr[first]);
            first++;
        }

        // Add remaining elements from the right half
        while (second <= end) {
            temporary.add(arr[second]);
            second++;
        }

        // Copy sorted elements back into the original array
        for (int i = start; i <= end; i++) {
            arr[i] = temporary.get(i - start);
        }
    }
}
