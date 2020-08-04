#include<iostream>
using namespace std;
int main()
{
  int n,a,i,b=0,m=0;
  std::cin>>n;
    do{
  std::cin>>a;
   b=b+a;
    m=m+1;
    }while(b<n);
   std::cout<<"The number of turns is "<<m;
}