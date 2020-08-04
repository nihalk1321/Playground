#include<iostream>
using namespace std;
int main()
{
  int n,s,f,l ;
  std::cin>>n;
  f=n/1000;
  l=n%10;
  s=f+l;
  std::cout<<s;
}