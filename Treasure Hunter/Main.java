#include<iostream>
using namespace std;
int main()
{
  int a,b,c,p,q,r;
  std::cin>>a>>b>>c;
  p=a*b/100;
  std::cout<<p<<"\n";
  q=(a-p)*c/100;
    std::cout<<q<<"\n";
  r=(a-p-q)/3;
    std::cout<<r<<"\n";
}