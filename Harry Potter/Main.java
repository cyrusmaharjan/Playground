#include<iostream>
using namespace std;
int main()
{
  int x;
  std::cin>>x;
  int a=x/1000;
  int b=x %10;
  int c=a+b;
  std::cout<<c;
}