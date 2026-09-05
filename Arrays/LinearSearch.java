import java.util.Scanner;

class Main7{
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
        // find first occurence
        System.out.println("Enter the number you have to search");
        int num=sc.nextInt();
        LinearSearch obj=new LinearSearch();
       int occurrence = obj.linearSearch(arr, num);
        System.out.println("first occurrence of "+num+ " is "+occurrence);
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
public class LinearSearch {
    int linearSearch(int arr[], int num){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==num) {
                return i;
            }
        }
        return -1;
    }

}
