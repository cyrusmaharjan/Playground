#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int ffinal=fa-((fa*fd)/100)+fs;
  int sfinal=sa-((sa*sd)/100)+ss;
  int afinal=aa-((aa*ad)/100)+as;
  std::cout<<"In Flipkart Rs."<<ffinal<<"\n"<<"In Snapdeal Rs."<<sfinal<<"\n"<<"In Amazon Rs."<<afinal<<"\n";
  if(ffinal<=sfinal&&ffinal<=afinal)
    std::cout<<"He will prefer Flipkart";
    else if(sfinal<=ffinal&&sfinal<=afinal)
      std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
    
}