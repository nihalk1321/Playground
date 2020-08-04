#include <iostream>
int main() {
	int n,s;
  std::cin>>n;
  if(n<=2){
    s=1;
  std::cout<<s;
  }
  else if (n>3){
    s=5;
  std::cout<<s;
  }
  else{
    s=2;
  std::cout<<s;
  }
}