package DS;

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
        //Finding largest element
        LargestElement obj=new LargestElement();
        obj.largestElemnrt(arr);
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class LargestElement {
    void largestElemnrt(int arr[]){
        int largest=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>largest) {
                largest=arr[i];
            }
        }
        System.out.println("Largest element int the given array is "+largest);
    }
}
