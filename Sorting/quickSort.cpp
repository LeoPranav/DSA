#include <bits/stdc++.h>
using namespace std;

int partition(int start,int end,vector<int>& arr){

    int p1 =start,p2=start;

    while(p2<end){

        if(arr[p2]<arr[end]){
            swap(arr[p1],arr[p2]);
            p1++;
        }
        p2++;
    }

    swap(arr[p1],arr[end]);
    return p1;

}

void quickSort(int start,int end,vector<int>& arr){

    //base case: single element and empty segment is sorted 
    if(start>=end)
        return;
    
    int pivot = partition(start,end,arr);
    quickSort(start,pivot-1,arr);
    quickSort(pivot+1,end,arr);    
}

int main() {
    
    vector<int> arr = {5,7,6,1,3,4,2};
    int n = arr.size();
    quickSort(0,n-1,arr);

    for(auto&it: arr) cout<<it<<" ";
    

    return 0;
}