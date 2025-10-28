#include <bits/stdc++.h>
using namespace std;

int main() {
    
    int n =5;
    vector<int>arr = {1,5,4,3,2};

    //process the array for n-1 times
    for(int i=1;i<=n-1;i++){

        //iterate adjacent pair of elements
        for(int j=0;j<=n-i-1;j++){

            //update
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
            }

        }

    }

    for(auto&it: arr) cout<<it<<" ";
    cout<<endl;

    return 0;
}