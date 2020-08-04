#include<iostream>
using namespace std;
int main()
{
  int a,b,i,code,c,t,d;
  std::cin>>a>>b>>c;
  if(a>b && a>c){
      if(b>c){
      t=b;
      std::cout<<"The treasure is in box which has number "<<t<<"\n";
    	     }
      else{
      t=c;
      std::cout<<"The treasure is in box which has number "<<t<<"\n";
    	  }
  				}
 else if(b>a && b>c){
  	  if(a>c){
      t=a;
      std::cout<<"The treasure is in box which has number "<<t<<"\n";
    	     }
      else{
      t=c;
      std::cout<<"The treasure is in box which has number "<<t<<"\n";
    	  }
  	     			}
 else{
       if(a>b){
       t=a;
       std::cout<<"The treasure is in box which has number "<<t<<"\n";
    	      }
      else{
      t=b;
      std::cout<<"The treasure is in box which has number "<<t<<"\n";
    	  }
     }
  d=a*b*c;
 for(i=2;i<=d/2;i++)
 {
  if(a%i==0 && b%i==0 && c%i==0)
  {
    code=i;
   break;
  }
   else{
   code=1;
   }
 }          
 std::cout<<"The code to open the box is "<<code;  
}