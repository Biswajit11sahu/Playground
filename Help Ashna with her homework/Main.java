#include<iostream>
int main()
{
int a,b,add,sub,mul,div,mod;
  std::cin>>a>>b;
  add=a+b;
  sub=a-b;
  mul=a*b;
  div=a/b;
  mod=a%b;
  std::cout<<"a+b="<<add;
  std::cout<<"\na-b="<<sub;
  std::cout<<"\na*b="<<mul;
  std::cout<<"\na/b="<<div;
  std::cout<<"\na%b="<<mod;
  return 0;
}