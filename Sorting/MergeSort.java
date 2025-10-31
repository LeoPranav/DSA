import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
       
        ArrayList<Integer> arr  = new ArrayList<>(List.of(6,3,1,4,7,5));
        int n = arr.size();
        mergeSort(0,n-1,arr);

        for(int x: arr) System.out.print(x+" ");
        

    }

    public static void mergeSort(int start,int end,ArrayList<Integer> arr){

        //base case: single element is sorted
        if(start==end) 
            return;
        
        int mid = (start+end)/2;

        //sort the left half
        mergeSort(start,mid,arr);
        //sort the right half
        mergeSort(mid+1,end,arr);

        //merge
        ArrayList<Integer> tmp1 = new ArrayList<>();
        ArrayList<Integer> tmp2 = new ArrayList<>();

        for(int i=start;i<=end;i++){
            if(i<=mid) tmp1.add(arr.get(i));
            else tmp2.add(arr.get(i));
        }

        int l1 = tmp1.size() ,l2 = tmp2.size();
        int ptr1 =0,ptr2=0,ptr3=start;

        while(ptr1<l1 && ptr2<l2){

            if(tmp1.get(ptr1)<tmp2.get(ptr2)){
                arr.set(ptr3,tmp1.get(ptr1));
                ptr1++;
                ptr3++;
            }
            else{
                arr.set(ptr3,tmp2.get(ptr2));
                ptr2++;
                ptr3++;
            }
        }

        while(ptr1<l1){
            arr.set(ptr3,tmp1.get(ptr1));
            ptr1++;
            ptr3++;
        }

        while(ptr2<l2){
            arr.set(ptr3,tmp2.get(ptr2));
            ptr2++;
            ptr3++;           
        }
    }

}