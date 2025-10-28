public class BubbleSort {
    public static void main(String[] args) {
        
        int n =5;
        int []arr = {1,5,4,3,2}; 

        // process the array for n-1 times
        for(int i=1;i<=n-1;i++){
            //iterate the over the adjacent pair of elements
            for(int j=0;j<=n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }

            }
        }

        for(int x: arr){
            System.out.print(x+" ");
        }

    }
}