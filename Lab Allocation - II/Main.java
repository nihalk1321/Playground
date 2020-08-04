#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int a,b,c;
  char ch[2];
  std::cin>>a>>b>>c>>ch;
  if(strcmp(ch,"L1")==0){
        if(b<c){
        std::cout<<"L2";
              }
         else {
          std::cout<<"L3";
         }
  }
  else if(strcmp(ch,"L2")==0){
        if(a<c){
        std::cout<<"L1";
              }
         else {
          std::cout<<"L3";
         }
  }
  else{
        if(a<b){
        std::cout<<"L1";
              }
         else {
          std::cout<<"L2";
         }
  }
  
}