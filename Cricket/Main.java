#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int TB,TR,SR,BB;
  std::cin>>TB>>TR>>SR>>BB;
  float m= TB/6;
  int n= BB/6;
  int p= BB%6;
  float k= ((float)n + (float)p/10);
  float d= SR/k;
  float f= TR/m;
 std::cout<<m<<"\n";
  std::cout<<std::fixed<<std::setprecision(1)<<k<<"\n";
  std::cout<<d<<"\n"<<f<<"\n";
  if(d>f)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
 }