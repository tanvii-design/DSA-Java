import java.util.Scanner;

class SpiralMatrix {

    int[][] spiralMatrix(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        int ans[][] = new int[n][m];

        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while (top <= bottom && left <= right) {

            // Right
            for (int i = left; i <= right; i++) {
                ans[top][i] = arr[top][i];
            }
            top++;

            // Bottom
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = arr[i][right];
            }
            right--;

            // Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = arr[bottom][i];
                }
                bottom--;
            }

            // Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = arr[i][left];
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        // Input matrix
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Create object
        SpiralMatrix obj = new SpiralMatrix();

        // Call method
        int ans[][] = obj.spiralMatrix(arr);

        // Print result
        System.out.println("Spiral Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
