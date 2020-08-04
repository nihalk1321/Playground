#include<iostream>
using namespace std;
int main()
{
  int x,y,cp,sp,pro,loss;
  std::cin>>x>>y;
  cp=x;
  sp=y*12;
  pro=sp-cp;
  loss=cp-sp;
  if(sp<cp){
  std::cout<<"Loss : Rs."<<loss;
  }
else if(cp<sp) {
  std::cout<<"Profit : Rs."<<pro;
  }
  else {
  std::cout<<"No profit nor loss";
  }

}