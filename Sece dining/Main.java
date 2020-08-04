#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string d;
  int r;
  std::cin>>d;
  std::cin>>r;
  if(d=="front" || d=="FRONT"){
            if (r==1){
            std::cout<<"Left Handed";
            }
            else{
            std::cout<<"Right Handed";
            }
  	}
  else{
          if (r==1){
          std::cout<<"Right Handed";
          }
          else{
          std::cout<<"Left Handed";
          }
  	}
}