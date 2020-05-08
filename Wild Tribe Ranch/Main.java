#include<iostream>
int main()
{
int mw,w;
  std::cin>>mw>>w;
  if(mw==w)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else if(mw>w)
   std::cout<<"Yes, you can enter."; 
  else
    std::cout<<"Sorry, you can't enter"; 
}