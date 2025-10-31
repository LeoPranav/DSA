#include <bits/stdc++.h>
using namespace std;

void mergeSort(int start,int end,vector<int>& arr){

    //base case: single element is sorted
    if(start==end){
        return;
    }

    int mid = (start+end)/2;

    //sort the left half
    mergeSort(start,mid,arr);
    //sort the right half
    mergeSort(mid+1,end,arr);
    
    //merge
    int l1 = (mid-start+1);
    int l2 = (end-(mid+1)+1);
    vector<int> tmp1,tmp2;

    for(int i=start;i<=end;i++){
        if(i<=mid) tmp1.push_back(arr[i]);
        else tmp2.push_back(arr[i]);
    }

    int ptr1=0,ptr2=0,ptr3=start;

    while(ptr1<l1 && ptr2<l2){

        if(tmp1[ptr1]<tmp2[ptr2]){
            arr[ptr3] = tmp1[ptr1];
            ptr3++;
            ptr1++;
        }
        else{
            arr[ptr3] = tmp2[ptr2];
            ptr3++;
            ptr2++;
        }
    }

    while(ptr1<l1){
        arr[ptr3] = tmp1[ptr1];
        ptr3++;
        ptr1++;
    }

    while(ptr2<l2){
        arr[ptr3] = tmp2[ptr2];
        ptr3++;
        ptr2++;
    }

}

int main() {
    
    vector<int> arr = {6,3,1,4,7,5};
    int n = arr.size();
    mergeSort(0,n-1,arr);

    for(auto&it: arr) cout<<it<<" ";
    cout<<endl;

    return 0;
}