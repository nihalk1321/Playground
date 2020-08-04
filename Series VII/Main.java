#include<iostream>
using namespace std;
int main()
{
 int n,i,a=1,b;
  std::cin>>n;
  if(n%2==0){
  for(i=1;i<=n/2;i++){
    std::cout<<a<<" ";
    a=a*2;
    std::cout<<a<<" ";
    a=a*1.5;
  }}
  else{for(i=1;i<=n/2;i++){
    std::cout<<a<<" ";
    a=a*2;
    std::cout<<a<<" ";
    a=a*1.5;
  }
    std::cout<<a<<" ";
   
      }
}