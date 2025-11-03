import  java.util.*;

public class BubbleSort2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(4,5,3,2,1,6));
        int n = arr.size();
        bubbleSort(0,n-1,arr);

        for(int x: arr) System.out.print(x+" ");

    }

    public static void bubbleSort(int start,int end,ArrayList<Integer> arr){
        //base case : single element is sorted
        if(start==end){
            return;
        }

        // push the max element to the end
        for(int i=start;i<=end-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                int temp = arr.get(i);
                arr.set(i,arr.get(i+1));
                arr.set(i+1,temp);
            }
        }

        //recursive call
        bubbleSort(start, end-1, arr);
    }
}