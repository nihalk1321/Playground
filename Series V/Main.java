#include<iostream>
using namespace std;
int main()
{
 int n,a=11,i;
  std::cin>>n;
  for(i=1;i<=n;i++){
  std::cout<<a*a<<" ";
    a=a+4;
  }
}