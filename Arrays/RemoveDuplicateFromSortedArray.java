import java.util.Scanner;

class Main4{
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
        RemoveDuplicateFromSortedArray obj=new RemoveDuplicateFromSortedArray();
        int num=obj.removeDuplicateFromSortedArray(arr);
        System.out.println("Number of unique elements "+num);
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class RemoveDuplicateFromSortedArray {
    int removeDuplicateFromSortedArray(int arr[]){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
