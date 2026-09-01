import java.util.Scanner;

class Main3{
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
        SortedArray obj=new SortedArray();
        boolean flag=obj.sortedArray(arr);
        if (flag) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class SortedArray {
    boolean sortedArray(int arr[]){
        for (int i=1;i< arr.length;i++){
            if (arr[i]>=arr[i-1]) {

            }
            else {
                return false;
            }
        }
        return true;
    }
}
