#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;;
  if(n>=1 && n<=r+1){
  std::cout<<"Yes";
  }
  else if(n%r==1){
  std::cout<<"Yes";
  }
 else if(n>=r*(c-1) && n<=c*c){
  std::cout<<"Yes";
  }
 else{
 std::cout<<"No";}
}