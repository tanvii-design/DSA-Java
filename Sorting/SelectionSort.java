package DS;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array:");
        displayArray(arr);

        // Creating object of SelectionSort class
        SelectionSort obj = new SelectionSort();

        // Calling sort method
        obj.sort(arr);

        System.out.println("\nSorted Array:");
        displayArray(arr);

        sc.close();
    }

    static void displayArray(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}


class SelectionSort {

    void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap elements
            if (minIndex != i) {

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
