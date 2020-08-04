#include<iostream>
using namespace std;
int main()
{
  int n,i,sum=0,m;
  std::cin>>n;
  m=n;
 while(m>0){
  sum=sum+m%10;
    m=m/10;
  }
  if(n%sum==0){
  std::cout<<"Harshad Number";
  }
  else{
  std::cout<<"Not Harshad Number";
  }
}