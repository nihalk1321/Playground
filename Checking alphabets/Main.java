#include<iostream>
using namespace std;
int main()
{
  char alph;
  std::cin>>alph;
  if(( alph >= 'A' && alph <= 'Z')||(alph >= 'a' && alph <= 'z')){
      if( alph == 'a'||alph == 'e'||alph == 'i'||alph == 'o'||alph == 'u' ){
      std::cout<<"Vowel";
      }
      else  if( alph == 'A'||alph == 'E'||alph == 'I'||alph == 'O'||alph == 'U' ){
      std::cout<<"Vowel";
      }
      else{
      std::cout<<"Consonant";
      }
}
  else {
  std::cout<<"Not an alphabet";
  }
}