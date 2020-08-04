#include<iostream>
using namespace std;
int main()
{
 int n,v,sum=0,i;
  std::cin>>n>>v;
  int a[10];
  for(i=0;i<n;i++){
  std::cin>>a[i];
  }
  for(i=0;i<n;i++){
  sum=sum+a[i];
  }
  if(sum <= v){
    std::cout<<"YES";
  }
  else {
    std::cout<<"NO";
  }
}