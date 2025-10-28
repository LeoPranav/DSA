public class InsertionSort{
    public static void main(String[] args) {
        
        int []arr = {12,11,13,5,10,4,1,2,6};
        int n = arr.length;

        //iterate from 2nd element to last element
        for(int i=1;i<=n-1;i++){
            //store the copy of current element
            int tmp = arr[i];
            int idx = i;

            //find the correct position to insert
            while(idx!=0 && arr[idx-1]>tmp){
                arr[idx] = arr[idx-1];
                idx--;
            }

            //insert the current element
            arr[idx] = tmp;

        }

        for(int x: arr){
            System.out.print(x+" ");
        }

    }
}