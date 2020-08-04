#include<iostream>
using namespace std;
int main()
{
int n,a=9,b=11,i;
  std::cin>>n;
  if(n%2==0){
  for(i=1;i<=n/2;i++){
  std::cout<<a<<" "<<b<<" ";
    a=a+b;
    b=a+b;
  }}
  else{
  for(i=1;i<=n/2;i++){
  std::cout<<a<<" "<<b<<" ";
    a=a+b;
    b=a+b;
  }
  std::cout<<a;}
}