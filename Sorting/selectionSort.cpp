#include <bits/stdc++.h>
using namespace std;

int main() {

    vector<int> arr = {10,2,8,5,1,4};
    int n=arr.size();

    for(int i=0;i<n;i++){

        int mi = i;

        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[mi])
                mi=j;
        }
        swap(arr[mi],arr[i]);
    }
    
    for(auto&it: arr) cout<<it<<" ";
    cout<<endl;

    return 0;
}