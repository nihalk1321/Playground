#include<iostream>
using namespace std;
int Prime(int n)
{
  int a = 0;
  for(int i = 2; i <= n/2; ++i)
  {
      if(n%i == 0)
      {
          a=1;
          break;
      }
  }
  return a;
}
int main()
{
  int n;
  std::cin >> n;
  if( Prime(n) == 0)
    std::cout <<"Prime Number";
  else
    std::cout <<"Not a Prime Number";
  return 0;
}
