#include<iostream>
using namespace std;
int main()
{
  float m;
    int l,d,a;
  std::cin>>m>>l>>d;
  a=m*l;
  if(a>d){
  std::cout<<"Can reach";
  }
  else{
  std::cout<<"Cannot reach";
  } 
}