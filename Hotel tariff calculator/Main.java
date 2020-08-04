#include<iostream>
using namespace std;
int main()
{
  int n,r,d,rent;
  std::cin>>n>>r>>d;
  if(n<=12){
        if(n>=4 && n<=6 || n>=11 && n<=12){
          r=r+(r*20)/100;
        rent=r*d;
                std::cout<<rent;
        }
    else {
    rent =r*d;
      std::cout<<rent;
    }
  
  		 }
  else {
  std::cout<<"Invalid Input";
  }
}