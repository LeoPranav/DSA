#include <bits/stdc++.h>
using namespace std;

int main() {
    
    vector<int> arr = {12,11,13,5,10,4,1,2,6};
    int n = arr.size();

    //iterate from 2nd element to last element
    for(int i=1;i<=n-1;i++){

        //store the copy of current element
        int tmp = arr[i];
        int idx = i;

        //find the correct position to insert the current element
        while(idx!=0 && arr[idx-1]>tmp){
            arr[idx] =arr[idx-1];
            idx--;
        }
        //insert the current element
        arr[idx] =tmp;
    }

    for(auto&it: arr) cout<<it<<" ";
    cout<<endl;
    

    return 0;
}