#include<iostream>
using namespace std;
int main()
{
  int l,b,a,len;
  std::cin>>l>>b;
  a=l*b;
  len=2*(l+b);
  std::cout<<"Required length is "<<len<<" m"<<"\n";
    std::cout<<"Required area of carpet is "<<a<<" sqm";
}