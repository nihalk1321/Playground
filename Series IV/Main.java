#include<iostream>
using namespace std;
int main()
{
  int  n,i;
  float a=0.5;
  std::cin>>n;
  for(i=1;i<=n;i++){
  std::cout<<a<<" ";
    a=a*3;
  }
}