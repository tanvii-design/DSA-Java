import java.util.Scanner;

class Main30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row number");
        int r = sc.nextInt();

        System.out.println("Enter Column number");
        int c = sc.nextInt();

        PascalTriangle obj = new PascalTriangle();

        if (r <= 0 || c <= 0 || c > r) {
            System.out.println("Invalid row or column");
        } else {
            System.out.println("Element at the given place is "
                    + obj.findElement(r - 1, c - 1));
        }
    }
}

public class PascalTriangle {

    int findElement(int row, int col) {

        int n = row;
        int r = col;

        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);

        return numerator / denominator;
    }

    int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
