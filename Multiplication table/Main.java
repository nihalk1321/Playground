#include<iostream>
using namespace std;
int main()
{
  int n,m,a[m],i;
  std::cout<<"Enter n"<<"\n";
  std::cin>>n;
   std::cout<<"Enter m"<<"\n";
   std::cin>>m;
  std::cout<<"The multiplication table of "<<n<<" is"<<"\n";
  for(i=1;i<=m;i++){
  std::cout<<i<<"*"<<n<<"="<<n*i<<"\n";
  }
}