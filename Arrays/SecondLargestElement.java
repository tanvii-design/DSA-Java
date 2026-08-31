import java.util.Scanner;

class Main2{
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
        SecondLargestElement obj=new SecondLargestElement();
        obj.secondLargestElement(arr);
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class SecondLargestElement {
    void secondLargestElement(int arr[]){
        int largest=arr[0];
        int slargest=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                slargest=largest;
                largest=arr[i];
            } else if (arr[i]<largest&&arr[i]>slargest) {
                slargest=arr[i];
            }
        }
        System.out.println("Second largest element is "+slargest);
    }
}
