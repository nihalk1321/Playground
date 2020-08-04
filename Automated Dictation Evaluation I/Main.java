#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[50],sec[50];
  std::cin.getline(str,50);
  std::cin.getline(sec,50);
  if(strcmp(str,sec)){
    std::cout<<"It is wrong";
  }
  else {
    std::cout<<"It is correct";
}
}
 