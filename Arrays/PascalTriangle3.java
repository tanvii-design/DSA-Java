import java.util.Scanner;

class Main36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        PascalTriangle3 obj = new PascalTriangle3();
        obj.pascalTriangle3(n);
    }
}

class PascalTriangle3 {

    void pascalTriangle3(int n) {

        for (int row = 1; row <= n; row++) {

            int ans = 1;

            for (int i = 1; i <= row; i++) {

                System.out.print(ans + " ");

                ans = ans * (row - i) / i;
            }

            System.out.println();
        }
    }
}
