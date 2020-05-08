#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int apetrol,dtcover;
  std::cin>>mileage>>apetrol>>dtcover;
  if(dtcover>mileage*apetrol)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
    
}