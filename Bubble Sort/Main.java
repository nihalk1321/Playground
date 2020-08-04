#include<iostream>
int main()
{
  int n,i,j,temp;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++){
  std::cin>>a[i];
  }
  for(i=0;i<n;i++){
 for(j=0;j<n-1;j++){
   if(a[j+1]<a[j]){
   temp = a[j];
   a[j]=a[j+1];
    a[j+1]=temp;
   				  }
  					}
  }
  for(i=0;i<n;i++){
  std::cout<<a[i]<<"\n";
  }
  return 0;
}