#include<iostream>
using namespace std;
int main()
{
  int bw,a,c,w;
std::cin>>bw>>a>>c;
  w=(a*75)+(c*30);
  if(w>bw){
  std::cout<<"Boat will sink";
  }
  else{
  std::cout<<"Boat is stable ";
  }
}