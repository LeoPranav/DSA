#include <bits/stdc++.h>
using namespace std;

void selectionSort(int start,int end,vector<int>& arr){

    //base case
    if(start==end){
        return;
    }

    //update the minimum
    int mini = start;
    for(int i =start;i<=end;i++){
        if(arr[i]<arr[mini]){
            mini = i;
        }
    }
    swap(arr[start],arr[mini]);

    //recursive call
    selectionSort(start+1,end,arr);

}

int main() {
    
    vector<int> arr ={5,3,6,2,4,1};
    int n = arr.size();

    selectionSort(0,n-1,arr);

    for(auto&it: arr) cout<<it<<" ";
    cout<<endl;

    return 0;
}