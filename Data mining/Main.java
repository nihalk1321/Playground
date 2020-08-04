#include<iostream>
int main() {
    int a, se = 0, sd = 0, r;
    std::cin>>a;
    while (a > 0) {
        r = a % 10;
        if (r % 2 == 0) {
            se = se + r;
        } else {
            sd = sd + r;
        }
        a = a / 10;
    }
	if(se==sd){
    std::cout << "Yes";}
    else{
    std::cout << "No";}

}