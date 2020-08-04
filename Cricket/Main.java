#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
 int a,c,d,p;
   float b,q,r,s;
  std::cin>>a>>b>>c>>d;
  p=a/6;
  q=(d/6)+((float (d%6)/10));
  r=c/q;
  s=b/p;
  std::cout<<std::fixed<<std::setprecision(1);
  std::cout<<p<<"\n";
  std::cout<<q<<"\n";
  std::cout<<r<<"\n";
  std::cout<<s<<"\n";
  if(r>s){
  std::cout<<"Eligible to Win";}
else {
  std::cout<<"Not Eligible to Win";}
}
