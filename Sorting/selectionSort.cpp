#include <bits/stdc++.h>
using namespace std;

int main() {

   vector<int> arr = {10,2,8,5,1,4};
   int n =6;

   //iterate every index
   for(int i=0;i<n;i++){
      int mini =i;
      //update minimum index
      for(int j=i;j<=n-1;j++){
         if(arr[j]<arr[mini]){
            mini=j;
         }
      }
      swap(arr[i],arr[mini]);
   }
   
   for(auto&it: arr)
      cout<<it<<" ";
   cout<<endl;
   
   return 0;
}