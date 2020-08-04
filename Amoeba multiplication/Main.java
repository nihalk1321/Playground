#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,i,c=0;
  std::cin>>n;
  for(i=2;i<=n;i++){
    c=a+b;
	a=b;
    b=c;
   
  }
      std::cout<<a<<" ";
}