#include<iostream>
int main()
{
int x,y,c;
  std::cin>>x>>y>>c;
  std::cout<<"Enter first number : Enter second number : Menu "<<"\n";
    std::cout<<"1.Addition"<<"\n";
  std::cout<<"2.Subtraction"<<"\n";
  std::cout<<"3.Multiplication"<<"\n";
  std::cout<<"4.Division"<<"\n";
  std::cout<<"5.Remainder"<<"\n";
  switch(c)
  {
    case 1 : std::cout<<x+y;
      break;
    case 2: std::cout<<x-y;
      break;
        case 3 : std::cout<<x*y;
      break;
        case 4: std::cout<<x/y;
      break;
        case 5 : std::cout<<x%y;
      break;
      default : std::cout<<"Invalid operation";
      break;
  }
}