#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  float res=0;
  do{
  std::cin>>n;
    if(n>=0){
            if(n%2==0){
            res=res-0.5;
                      }
            else      {
            res=res+1;
            i++;
                      }
          }
    else { 
       res=res-1;
      break;
         }
    }while(i<3);
   std::cout<<res<<"\n";
}