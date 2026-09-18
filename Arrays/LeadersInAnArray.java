import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main30{
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
        LeadersInAnArray obj=new LeadersInAnArray();//Finding Leaders
        ArrayList<Integer> a1 =obj.leadersInAnArray(arr);
        System.out.println("Leaders are ");
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i)+" ");
        }
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class LeadersInAnArray {
    ArrayList<Integer> leadersInAnArray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                a1.add(arr[i]);
                maxi = arr[i];
            }
        }

        Collections.reverse(a1);
        return a1;
    }
}
