#include <iostream>
struct Distance{
int inch;
float feet;
}
d1 , d2, sum;
int main()
{
std::cin >> d1.inch;
std::cin >> d1.feet;
std::cin >> d2.inch;
std::cin >> d2.feet;
  sum.inch = d1.inch+d2.inch;
sum.feet = d1.feet+d2.feet;

  if(sum.feet >12){
  sum.inch++;
    sum.feet=sum.feet-12;
  }
std::cout << sum.inch << "'"<<"-"<< sum.feet << '"';
}