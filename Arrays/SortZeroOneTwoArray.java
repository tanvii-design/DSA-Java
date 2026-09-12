import java.util.Scanner;

class Main18{
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
        //Sorting array
        SortZeroOneTwoArray obj=new SortZeroOneTwoArray();
        obj.sortZeroOneTwoArray(arr);
        // display after sorting
        display(arr);
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class SortZeroOneTwoArray {
    void sortZeroOneTwoArray(int arr[]){
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while (mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp1=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp1;
                high--;
            }
        }
    }

}
