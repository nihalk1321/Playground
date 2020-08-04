#include<iostream>
using namespace std;
int main()
{
  int n,sum=0;
  std::cin>>n;
  for(int i=1;i<=n/2;i++){
  if(n%i==0){
  sum=sum+i;
  			}
  }
  if(sum>n){
  std::cout<<"Abundant Number";
  }
  else {
  std::cout<<"Not Abundant Number";
  }
}