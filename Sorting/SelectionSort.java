public class SelectionSort {
    public static void main(String[] args) {
        
        int []arr = {10,2,8,5,1,4};
        int n = arr.length;

        for(int i=0;i<n;i++){
            int mi = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mi])
                    mi=j;
            }
            int temp = arr[mi];
            arr[mi] = arr[i];
            arr[i] = temp;
        }

        for(int x: arr){
            System.out.print(x+" ");
        }

    }

}