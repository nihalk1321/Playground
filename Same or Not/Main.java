#include<iostream>
using namespace std;
int main()
{
 int m,n,a[10],b[10],i,j,sum1=0,sum2=0;
  std::cin>>m>>n;
  for(i=0;i<m;i++){
  std::cin>>a[i];
  }
  for(j=0;j<n;j++){
  std::cin>>b[j];
  }
 for(i=0;i<m;i++){
 sum1=sum1+a[i];
  }
   for(j=0;j<n;j++){
 sum2=sum2+b[j];
  }
  if( sum1==sum2){
  std::cout<<"Same";
  }
else{
  std::cout<<"Not Same";
  }
}