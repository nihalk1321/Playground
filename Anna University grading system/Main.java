#include<iostream>
using namespace std;
int main()
{
  int m;
  std::cin>>m;
  if(m==100){
  std::cout<<"S";
  }
 else if(m>=90 & m<=99){
  std::cout<<"A";
  }
 else if(m>=80 & m<=89){
  std::cout<<"B";
  }
 else if(m>=70 & m<=79){
  std::cout<<"C";
  }
 else if(m>=60 & m<=69){
  std::cout<<"D";
  }
   else if(m<50){
  std::cout<<"F";
  }
  else {
  std::cout<<"Invalid Input";
  }
}