#include<iostream>
using namespace std;
int main()
{
  int n,i;
  float a=95;
  std::cin>>n;
  for(i=0;i<n;i++){
    std::cout<<a<<" ";
  a=a+2*i+20.5;
  }
}