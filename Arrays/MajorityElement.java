import java.util.Scanner;

class Main15{
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
        //Finding the majority element
        MajorityElement obj=new MajorityElement();
        System.out.println("Majority Element is "+obj.majorityElement(arr));
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class MajorityElement {
    int majorityElement(int arr[]){
        int el=0;
        int cut=0;
        for (int i = 0; i < arr.length ; i++) {
            if (cut==0){
                el=arr[i];
                cut++;
            } else if (arr[i]==el) {
                cut++;
            }
            else {
                cut--;
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==el){
                count++;
            }
        }
        if (count> arr.length/2){
            return el;
        }
        else {
            return -1;
        }
    }
}
