#include<iostream>
int s(int n){
  int sum=0;
for(int i=0;i<=n;i++)
   sum=sum+i;
std::cout<<sum;
}
using namespace std;
int main()
{
 int n;
  std::cin>>n;
  s(n);
  return 0;
}