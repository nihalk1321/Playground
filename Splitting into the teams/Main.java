#include<iostream>
using namespace std;
int main()
{
  int f,t,a,b;
  std::cin>>f>>t;
  a=f/t;
  b=f%t;
  std::cout<<"The number of friends in each team is "<<a<<" and left out is "<<b;
}