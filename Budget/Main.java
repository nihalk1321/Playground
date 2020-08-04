#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
  float p,q,r,s,t,sum;
  std::cin>>a>>b>>c>>d>>e;
  p=a*350.34;
  q=b*230.90;
  r=c*190.55;
  s=d*125.30;
  t=e*180.90;
  sum=p+q+r+s+t;
if(sum>15000){
std::cout<<"No";
}
  else{
  std::cout<<"Yes";
  }
}