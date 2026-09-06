import java.util.*;

public class UnionArray {
   public  ArrayList<Integer> union(int arr1[], int arr2[]) {
        ArrayList<Integer> union = new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        int i =0;
        int j=0;
        while (i<n1&& j<n2){
            if (arr1[i]<=arr2[j]){
                if (union.size()==0|| union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if (union.size()==0|| union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i<n1){
            if (union.size()==0|| union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while (j<n2){
            if (union.size()==0|| union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
}
