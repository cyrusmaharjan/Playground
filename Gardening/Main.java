#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,r;
  std::cin>>a>>b>>c;
  r=c%3;
  if(r!=0)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}