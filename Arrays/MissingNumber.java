import java.util.Scanner;

class Main9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // data entry loop
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the value of index "+i);
            arr[i]= sc.nextInt();
        }
        // display elements
        display(arr);
        //Finding missing element
        MissingNumber obj=new MissingNumber();
        System.out.println("Missing Element is "+obj.missingNumber(arr));
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class MissingNumber {
    int missingNumber(int arr[]){
        int n= arr.length+1;
        int sum= (n*(n+1))/2;
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            sum2+=arr[i];
        }
        return sum-sum2;
    }
}
