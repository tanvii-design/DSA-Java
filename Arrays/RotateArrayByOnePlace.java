import java.util.Scanner;

class Main5{
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
        //Finding largest element
        RotateArrayByOnePlace obj=new RotateArrayByOnePlace();
        obj.rotateArrayByOnePlace(arr);
        // Display after rotation
        display(arr);
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class RotateArrayByOnePlace {
    void rotateArrayByOnePlace(int arr[]){
        int temp=arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
