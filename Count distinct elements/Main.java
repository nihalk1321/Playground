#include<iostream>
using namespace std;
int main()
{
  int n,m,i;
  std::cin>>n;
  int a[n];
  m=n;
  for(i=0;i<n;i++){
  std::cin>>a[i];  
  }
 for(i=0;i<n-1;i++){
     if(a[i]==a[i+1]){
     m--;
     }
  }
  std::cout<<"There are "<<m<<" distinct element in the array.";
}
