#include <cstring>
#include <iostream>
int main()
{
  char a[100];
  int i,w=0;
  std::cin.getline(a,100);
  for(i=0;a[i]!='\0';i++){
  if(a[i]==' '){
  w=w+1;
  }
  }
  if(w<=10){
  std::cout<<"Caption eligible for the contest";
  }
  else{
  std::cout<<"Caption not eligible for the contest";
  }
   
}