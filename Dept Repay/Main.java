#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  std::cin>>p>>t>>r;
  float i,a,d,f;
  i=(p*t*r)/100;
    a=i+p;
 d= 0.02*i;
  f=a-d;
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
}