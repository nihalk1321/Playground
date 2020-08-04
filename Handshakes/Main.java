#include<iostream>
using namespace std;
int main()
{
  int n,h=0;
  std::cin>>n;
  for(int i=n-1;i>0;i--){
  h=h+i;
  }
  std::cout<<h;
}