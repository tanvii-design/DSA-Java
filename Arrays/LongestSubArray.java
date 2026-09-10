import java.util.Scanner;

class Main12{
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
        //Finding the  Number which Appears Onces
        System.out.println("Enter the value of sum You needed");
        int k= sc.nextInt();
        LongestSubArray obj=new LongestSubArray();
        System.out.println("The  Longest sub array with sum k is "+obj.longestSubArray(arr,k));
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class LongestSubArray {
    int longestSubArray(int arr[], int k){
        int left=0;
        int right=0;
        int sum=arr[0];
        int maxlen=0;
        while (right<arr.length){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if (sum==k) {
               maxlen= Math.max(maxlen, right - left + 1);
            }
                right++;
                if(right<arr.length){
                    sum+=arr[right];
                }
            }
        return maxlen;
    }
}
