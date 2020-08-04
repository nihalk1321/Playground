#include<iostream>
using namespace std;
struct time{
int hours,minutes,seconds;
}t1,t2,d;
int main()
{
  std::cin>>t1.hours>>t1.minutes>>t1.seconds;
  std::cin>>t2.hours>>t2.minutes>>t2.seconds;
   if(t2.seconds > t1.seconds)
    {
        --t1.minutes;
        t1.seconds += 60;
    }
    d.seconds = t1.seconds - t2.seconds;
    if(t2.minutes > t1.minutes)
    {
        --t1.hours;
        t1.minutes += 60;
    d.hours=t1.hours-t2.hours;
   d.minutes=t1.minutes-t2.minutes;
  
}
else{
 d.hours=t1.hours-t2.hours;
   d.minutes=t1.minutes-t2.minutes;
   d.seconds=t1.seconds-t2.seconds;
}
  std::cout<<d.hours<<":"<<d.minutes<<":"<<d.seconds;
}
 