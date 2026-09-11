import java.util.Arrays;
import java.util.Scanner;

class Main16{
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
        //Finding target
        System.out.println("Enter the Target");
        int target= sc.nextInt();
        TwoSum obj=new TwoSum();
        if (obj.twoSum(arr,target)){
            System.out.println("Two sum exist");
        }
        else {
            System.out.println("Two sum not exist");
        }
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class TwoSum {
    boolean twoSum(int arr[], int target){
        int left=0;
        int right= arr.length-1;
        Arrays.sort(arr);
        while (left<right){
            int sum=arr[left]+arr[right];
            if (sum==target){
                return true;
            } else if (sum<target) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}
