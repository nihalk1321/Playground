#include <iostream>
struct student
{
   int rn,sub1,sub2,sub3,sub4,sub5,avg,g,a,i;
};
int main() 
{
   int  rn,sub1,sub2,sub3,sub4,sub5,avg,g,a,i;
   std::cout<<"STUDENT MARKSHEET USING STRUCTURES"<<"\n";
  std::cout<<"Enter the no of students"<<"\n";
  std::cin>>a;
  struct student s[a];
  for(i=0;i<a;i++){
      std::cin>>s[i].rn;
      std::cin>>s[i].sub1;
      std::cin>>s[i].sub2;
      std::cin>>s[i].sub3;
      std::cin>>s[i].sub4;
      std::cin>>s[i].sub5;
  }
 std::cout<<"rn s1 s2 s3 s4 s5 avg grade"<<"\n";
    for(i=0;i<a;i++){
      std::cout<<s[i].rn<<" ";
      std::cout<<s[i].sub1<<" ";
      std::cout<<s[i].sub2<<" ";
      std::cout<<s[i].sub3<<" ";
      std::cout<<s[i].sub4<<" ";
      std::cout<<s[i].sub5<<" ";
      s[i].avg = (s[i].sub1+s[i].sub2+s[i].sub3+s[i].sub4+s[i].sub5)/5;
      if(s[i].avg > 70 ){
      s[i].g = 1;}
      else if(s[i].avg > 50 || avg < 70){
      s[i].g = 2;}
      else{
      s[i].g = 3;
      }
     std::cout<<s[i].avg<<" ";
      std::cout<<s[i].g<<" "<<"\n";
     
  }
  
  
}