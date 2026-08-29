package DS;

import java.util.Scanner;

class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size from the user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Reading array elements
        System.out.println("\nEnter the array elements:");

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element at index " + index + ": ");
            arr[index] = sc.nextInt();
        }

        // Display array before sorting
        System.out.println("\nArray before Quick Sort:");
        display(arr);

        // Perform Quick Sort
        QuickSort sorter = new QuickSort();
        sorter.sort(arr, 0, arr.length - 1);

        // Display array after sorting
        System.out.println("\nArray after Quick Sort:");
        display(arr);

        sc.close();
    }

    // Method to print array elements
    static void display(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}


class QuickSort {

    // Recursively divides and sorts the array
    void sort(int[] arr, int low, int high) {

        if (low < high) {

            // Find the correct position of the pivot
            int pivotIndex = partition(arr, low, high);

            // Sort elements before the pivot
            sort(arr, low, pivotIndex - 1);

            // Sort elements after the pivot
            sort(arr, pivotIndex + 1, high);
        }
    }


    // Places the pivot element in its correct position
    int partition(int[] arr, int low, int high) {

        // Choosing the first element as pivot
        int pivot = arr[low];

        int left = low;
        int right = high;

        while (left < right) {

            // Find an element greater than pivot from the left
            while (left <= high - 1 && arr[left] <= pivot) {
                left++;
            }

            // Find an element smaller than or equal to pivot from the right
            while (right >= low + 1 && arr[right] > pivot) {
                right--;
            }

            // Swap incorrect elements
            if (left < right) {
                swap(arr, left, right);
            }
        }

        // Put pivot into its correct position
        swap(arr, low, right);

        return right;
    }


    // Helper method for swapping two elements
    void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}