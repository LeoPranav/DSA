import java.util.*;

public class QuickSort{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(4,5,3,2,1,6,9,8));
        int n = arr.size();
        quickSort(0,n-1,arr);

        for(int x: arr){
            System.out.print(x+" ");
        }

    }

    public static int partition(int start,int end,ArrayList<Integer> arr){

        int p1 = start,p2=start;

        while(p2<end){

            if(arr.get(p2)<arr.get(end)){

                int temp = arr.get(p1);
                arr.set(p1,arr.get(p2));
                arr.set(p2,temp);
                p1++;
            }
            p2++;
        }

        int temp = arr.get(p1);
        arr.set(p1,arr.get(end));
        arr.set(end,temp);

        return p1;
    }

    public static void quickSort(int start,int end, ArrayList<Integer> arr){

        //base case
        if(start>=end)
            return;

        int pivot = partition(start,end,arr);
        quickSort(start,pivot-1,arr);
        quickSort(pivot+1,end,arr);
    }

   

    
}