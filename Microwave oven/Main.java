#include<iostream>
using namespace std;
int main()
{
 int n;
  float t,d;
  std::cin>>n>>t;
  if(n==2){
  t=t+t/2;
    std::cout<<t;
  }
else if(n==3){
  t=t*2;
  std::cout<<t;
  }  
  else{
  std::cout<<"Number of items is more";
  }
}