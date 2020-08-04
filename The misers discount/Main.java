#include<iostream>
using namespace std;
int main()
{
  float a,b,c,p,q,r;
  std::cin>>a>>b>>c;
  p=a+b;
  r=p*c/100;
  q=p-r;
  std::cout<<p<<"\n"<<q<<"\n"<<r;
}