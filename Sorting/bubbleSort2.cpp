#include <bits/stdc++.h>
using namespace std;

void bubbleSort(int start,int end,vector<int>& arr){

    //base case: single element is sorted
    if(start==end){
        return;
    }

    //push the max element to end
    for(int i=start;i<=end-1;i++){
        if(arr[i]>arr[i+1]){
            swap(arr[i],arr[i+1]);
        }
    }
    bubbleSort(start,end-1,arr);

}

int main() {
    
    vector<int> arr = {4,5,3,2,1,6};
    int n = arr.size();
    bubbleSort(0,n-1,arr);

    for(auto&it: arr) cout<<it<<" ";

    return 0;
}