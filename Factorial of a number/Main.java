#include<iostream>
int main(){
  // Type your code here
 int i,fact=1,number;

 std::cin>>number;

 for(i=1;i<=number;i++){

   fact=fact*i;

 }

 std::cout<<fact;
  
}