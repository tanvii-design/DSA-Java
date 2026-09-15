import java.util.Scanner;

class Main21{
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
        //Finding max profit
        StockProfit obj=new StockProfit();
        System.out.println("Maximum profit is "+obj.stockProfit(arr));
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class StockProfit {
    int stockProfit(int arr[]){
        int mini=arr[0];
        int profit=0;
        int cost=0;
        for (int i = 0; i < arr.length; i++) {
            cost= arr[i]-mini;
            if(cost>profit){
                profit=cost;
            }
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return profit;
    }
}
