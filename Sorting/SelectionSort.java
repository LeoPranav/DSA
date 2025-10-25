public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {10,2,8,5,1,4};

        int n = 6;

        // Iterate every index
        for(int i=0;i<n;i++){

            //assume current index as mini index
            int mini =i;
            //Searching for minimum element
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

}