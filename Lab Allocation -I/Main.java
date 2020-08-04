#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if(a<b && a<c){
  std::cout<<"L1";
  }
 else if(b<a && b<c){
  std::cout<<"L2";
  }
    else{
  std::cout<<"L3";
  }


}