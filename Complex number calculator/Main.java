#include<iostream>
int main(){
int x,a,b,c,d,p,q;
  std::cin>>x>>a>>b>>c>>d;
 
  if(x==1){
  p=a+c;
  q=b+d;
    std::cout<<p<<q<<"i";
  }
  else if(x==2){
    p=a-c;
  q=b-d;
    std::cout<<p<<"+"<<q<<"i";}
  else if(x==3){
  p=a*c-b*d;
  q=a*d+b*c;
    std::cout<<p<<q<<"i";}
  else{
  std::cout<<"Invalid choice";}
}