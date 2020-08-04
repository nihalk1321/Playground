#include<iostream>
using namespace std;
int main()
{
 char a[200];
  int i,v=0,c=0,w=0,d=0,s=0;
  std::cin.getline(a,200);
  for(i=0;a[i]!='\0';i++){
  if(a[i]>='a' && a[i]<='z' ||a[i]>='A' && a[i]<='Z' ){
          if(a[i] =='a' || a[i] =='e' || a[i] =='i' || a[i] =='o' || a[i]=='u'|| a[i] =='A' || a[i] =='E' || a[i] =='I' || a[i] =='O' || a[i]=='U'
          ){
          v=v+1;
          }
           else{
           c=c+1;
           }
  													}
  else if(a[i] >= '0' && a[i] <= '9' ){
  d=d+1;
  }
  else if(a[i] == ' '){
  w=w+1;
  }
  else{
  s=s+1;
  }}
 std::cout<<"Vowels:"<<v<<" "<<"\n";
   std::cout<<"Consonants:"<<c<<" "<<"\n";
   std::cout<<"White Spaces:"<<w<<" "<<"\n";
   std::cout<<"Digits:"<<d<<" "<<"\n";
   std::cout<<"Symbols:"<<s<<" "<<"\n";
}