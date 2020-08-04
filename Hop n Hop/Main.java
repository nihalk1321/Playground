#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int x,y,a,hop;
  std::cin>>x>>y;
  a=(x-3)*(x-3)+(y-4)*(y-4);
  hop = sqrt(a);
  std::cout<<hop;
}