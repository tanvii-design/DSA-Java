import java.util.Scanner;
class Main10{
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
        //Finding maximum consecutive ones
        ConsecutiveOnes obj=new ConsecutiveOnes();
        System.out.println("Maximum ConsecutiveOnes are "+obj.consecutiveOnes(arr));
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ConsecutiveOnes {
    int consecutiveOnes(int arr[]){
        int count=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
                if (count>max){
                    max=count;
                }
            }
            else {
                count=0;
            }
        }
        return max;
    }

}
