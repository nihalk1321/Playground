#include<iostream>
using namespace std;
int main()
{
  int r,h,lit,hrs,vol,a;
  std::cin>>r>>h>>lit>>hrs;
  vol=3.14*r*r*h;
  a=lit*hrs;
  if(a>=vol){
  std::cout<<"The tank can be filled within "<<hrs<<" hours";
  }
  else {
  std::cout<<"The tank cannot be filled within "<<hrs<<" hours";
  }
}