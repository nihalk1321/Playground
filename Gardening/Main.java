#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  if((n>=r+1 && n<= r*2) || (n>r*(c-2) && n<=r*(c-1)) ){
  std::cout<<"It is an orange tree";
  }
  else {
  std::cout<<"It is not an orange tree";
  }
}