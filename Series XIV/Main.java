#include<iostream>
using namespace std;
int main()
{
  int n,i,a=2;
  std::cin>>n;
  for(i=1;i<=n;i++){
  std::cout<<a<<" ";
  a=a*2+1;
  }
}