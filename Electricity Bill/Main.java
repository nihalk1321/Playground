#include<iostream>
using namespace std;
int main()
{
  int u,bill;
  std::cin>>u;
  if(u<=200){
  bill=u*0.5;
    std::cout<<"Rs."<<bill;
  }
   else if(u<=400){
  bill=u*0.65+100;
    std::cout<<"Rs."<<bill;
  }
  else if(u<=600){
  bill=u*0.80+200;
    std::cout<<"Rs."<<bill;
  }
  else {
  bill=u*1.25+425;
    std::cout<<"Rs."<<bill;
  }

}