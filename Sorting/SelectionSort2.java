import java.util.*;

public class SelectionSort2{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(5,3,6,2,4,1));
        int n = arr.size();
        selectionSort(0,n-1,arr);

        for(int x: arr) System.out.print(x+" ");

    }

    public static void selectionSort(int start,int end,ArrayList<Integer> arr){

        //base case
        if(start==end)
            return;
        
        //update the min
        int mini = start;
        
        for(int i=start;i<=end;i++){
            if(arr.get(i)<arr.get(mini)){
                mini = i;
            }
        }

        int temp = arr.get(start);
        arr.set(start,arr.get(mini));
        arr.set(mini,temp);

        //recursive call
        selectionSort(start+1,end,arr);

    }
}