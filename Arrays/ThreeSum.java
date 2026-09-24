import java.util.*;

class ThreeSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the value of index " + i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Triplets whose sum is 0:");

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println(
                            arr[i] + " " + arr[left] + " " + arr[right]
                    );

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;

                } else {
                    right--;
                }
            }
        }

        sc.close();
    }
}
