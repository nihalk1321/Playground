#include<iostream>
using namespace std;
int main()
{
 char a[50],b[50];
  int i,j;
  std::cin.getline(a,50);
  
  for(i=0;a[i]!='\0';i++){
  if(a[i]>= 'a' && a[i] <= 'z' ||a[i]>= 'A' && a[i] <= 'Z' ){
  b[j++]=a[i];
  }
  }
  b[j]='\0';
  std::cout<<b;
}