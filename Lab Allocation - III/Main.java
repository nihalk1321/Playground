#include<iostream>
using namespace std;
int main()
{
 int a,b,c,n,x;
  std::cin>>a>>b>>c>>n;
  if(n<a){
  x++;
  }
  if(n<b){
  x++;
  }
 if(n<c){
  x++;
  }
  std::cout<<x;
}