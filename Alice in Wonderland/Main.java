#include<iostream>
using namespace std;
int main()
{
 int n,sum=0;
  std::cin>>n;
  while(n!=0){
  sum=sum+n%10;
    n=n/10;
  }
  std::cout<<"Alice must go in path-"<<sum;
}