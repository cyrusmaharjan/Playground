#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int byear,cyear;
  std::cin>>byear>>cyear;
  if (byear>cyear)
    std::cout<<((cyear+100)-byear);
  else if(cyear>byear)
    std::cout<<cyear-byear;
  
  
}