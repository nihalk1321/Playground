#include<iostream>
using namespace std;
int main()
{
  int a,b,p,q,x,y,wall,i,j;
  std::cin>>a>>b>>p>>q>>x>>y;
  wall=a*b;
  i=p*q;
  j=x*y;
  if(wall>=(i+j)){
  std::cout<<"Leonardo can fix both painting";
  }
  else{
  std::cout<<"Leonardo cannot fix both painting";
  }
}