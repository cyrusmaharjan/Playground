#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int u,p;
  std::cin>>u;
  if(u<=200)
    p=0.5*u;
  
  else if(u<=400)
    p=(0.65*u)+100;
   else if(u<=600)
    p=(0.80*u)+200;
  else
    p=(0.65*u)+100;
  
  
  std::cout<<"Rs."<<p;
  
    
}