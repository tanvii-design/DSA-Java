import java.util.Scanner;


class Main11{
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
        //Finding the  Number which Appears Onces
        NumberAppearsOnces obj=new NumberAppearsOnces();
        System.out.println("The  Number which Appears Onces is "+obj.numberAppearsOnces(arr));
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class NumberAppearsOnces {
    int numberAppearsOnces(int arr[]){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
        }
        return xor;
    }
}
