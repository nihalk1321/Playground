#include <iostream>
using namespace std;
int main()
{
    char str[100], rev[100];
    int i, j, count = 0;
    std::cin.getline(str,100);
    while (str[count] != '\0')
    {
        count++;
    }
    j = count-1;
    for (i = 0; i < count+1; i++) 
    {
        rev[i] = str[j];
        j--;
    }
    std::cout << rev;
}