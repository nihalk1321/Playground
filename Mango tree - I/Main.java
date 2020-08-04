#include<iostream>

using namespace std;
int main()
{
        int m,n,x;
        cin>>m;
        cin>>n;
        cin>>x;
       if(x<=n){
       std::cout<<"Yes";
       }
  else if( x%n==1 || x%n==0 ){
   std::cout<<"Yes";
  }
  else{
   std::cout<<"No";
  }
}