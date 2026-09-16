import java.util.Scanner;

class Main24{
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
        //Rearrange the elements
        RearrangeArray obj=new RearrangeArray();
        int ans[]=obj.rearrangeArray(arr);
        System.out.println("After Arranging ");
        display(ans);
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class RearrangeArray {
    int[] rearrangeArray(int arr[]){
        int posIndex=0;
        int negIndex=1;
        int ans[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
            else {
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
        }
        return ans;
    }
}
