#include<iostream>
using namespace std;
int main()
{
  int n,i,m;
  std::cin>>n;
  m=n;
  while(n!=0){
  n=n/10;
    ++i;
          }
  if(i==3){
        m=m/10;
    	m=m%10;
        if(m%3==0){
 	    std::cout<<"Trendy Number";
        }
        else{ 
  		std::cout<<"Not a Trendy Number";
  		}
         }
  else{ 
  std::cout<<"Invalid Number";
      }
}