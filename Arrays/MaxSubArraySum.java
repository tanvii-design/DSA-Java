import java.util.Scanner;

class Main20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the value of index "+i);
            arr[i]= sc.nextInt();
        }
        display(arr);
        //Finding max in sub array
        MaxSubArraySum obj=new MaxSubArraySum();
        System.out.println("Maximum in a sub array "+obj.maxSubArraySum(arr));
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class MaxSubArraySum {
    int maxSubArraySum(int arr[]){
        int maxi=0;
        int sum=0;
        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for (int i = 0; i < arr.length; i++) {
            if(sum==0){
                start=i;
            }
            sum=sum+arr[i];
            if (sum>maxi){
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        if (maxi<0){
            return 0;
        }
        else{
            return maxi;
        }
    }
}
