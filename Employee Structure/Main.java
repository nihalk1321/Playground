#include <iostream>
struct employee
{
    char name[30];
 int id;
    int age;
  char designation[20];
int salary;  
};
int main() 
{
  
  char name[30];
 int id;
    int age;
  char designation[20];
int salary;  
  struct employee e;
  std::cout<<"Enter name:"<<"\n";
  std::cin>>e.name;
     std::cout<<"Enter ID:"<<"\n";
    std::cin>>e.id;
   std::cout<<"Enter age:"<<"\n";
    std::cin>>e.age;
  std::cout<<"Enter designation:"<<"\n";
  std::cin>>e.designation;
  std::cout<<"Enter Salary:"<<"\n";
  std::cin>>e.salary;
  std::cout<<"Employee Details"<<"\n";
  std::cout<<"Name of the Employee : "<<e.name<<"\n";
  std::cout<<"ID of the Employee : "<<e.id<<"\n";
  std::cout<<"Age of the Employee : "<<e.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e.designation<<"\n";
  std::cout<<"Salary of the Employee : "<<e.salary<<"\n";
  
}