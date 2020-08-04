#include<iostream>
using namespace std;
int main()
{
  int n,i,a=5;
  std::cin>>n;
  for(i=1;i<=2*n;i++){
  if(i%2==0){
  		std::cout<<" ";
  			}
  else{
        std::cout<<a;
        a=a+11*i;
       }
  
  					}
}