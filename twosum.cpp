#include <iostream>
#include <unordered_map>
using namespace std;

int main(){

  int arry[] = {2,4,3,9,6,5};
  int target = 12;
  
  unordered_map<int, int> mapp;

 
for(int i;i<=sizeof(arry);i++){
   int val = target - arry[i];
  if(mapp.find(val)!=mapp.end()){

    cout<<"give index is "<<val<<"+"<<arry[i]<<" =  "<<target<<endl;
    cout<<i<<" "<<mapp[val];
    break;

  }
  mapp[arry[i]]=i;

}
}
