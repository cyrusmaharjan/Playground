#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  int a=3,b=4;
  std::cin>>x>>y;
  int l=(x-a);
  int m=(y-b);
  int j=l*l;
  int n=m*m;
  int o=j+n;
  int p=sqrt(o);
  std::cout<<p;
}