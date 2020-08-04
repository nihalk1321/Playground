#include<iostream>
using namespace std;
int main()
{
  int m,l,vol;
  std::cin>>m>>l;
  vol=m*m*m*1000;
  if(l<=vol){
  std::cout<<"Can store";
  }
  else{
  std::cout<<"Cannot store";
  }
}