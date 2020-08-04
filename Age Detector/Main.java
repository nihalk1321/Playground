#include<iostream>
using namespace std;
int main()
{
  int b,c,age;
  std::cin>>b>>c;
  if(b>c){
  age=(100-b)+c;
    std::cout<<age;
  }
  else {
  age=c-b;
      std::cout<<age;
  }
}