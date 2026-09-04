import java.util.Scanner;

class Main6{
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
        MoveZerotoEnd obj=new MoveZerotoEnd();
        obj.moveZerotoEnd(arr);
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
public class MoveZerotoEnd {
    void moveZerotoEnd(int arr[]){
        int j=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                j=i;
                break;
            }
        }
        if (j==-1){
            return;
        }
        else {
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i]!=0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    j++;
                }
            }
        }
    }
}
