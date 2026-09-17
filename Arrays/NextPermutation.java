import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an ArrayList:");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        // Data entry loop
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of index " + i);
            arr.add(sc.nextInt());
        }

        // Display original elements
        System.out.println("Original ArrayList:");
        display(arr);

        // Finding next permutation
        NextPermutation obj = new NextPermutation();
        ArrayList<Integer> ans = obj.nextPermutation(arr);

        // Display next permutation
        System.out.println("After arranging:");
        display(ans);

        sc.close();
    }

    static void display(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}

class NextPermutation {

    ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) {
        int n = arr.size();
        int index = -1;

        // Find the first smaller element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                index = i;
                break;
            }
        }

        // If the ArrayList is in descending order
        if (index == -1) {
            Collections.reverse(arr);
            return arr;
        }

        // Find the just-greater element from the right and swap it
        for (int i = n - 1; i > index; i--) {
            if (arr.get(i) > arr.get(index)) {
                Collections.swap(arr, i, index);
                break;
            }
        }

        // Reverse the remaining right side
        reverse(arr, index + 1, n - 1);

        return arr;
    }

    void reverse(ArrayList<Integer> arr, int left, int right) {
        while (left < right) {
            Collections.swap(arr, left, right);
            left++;
            right--;
        }
    }
}
