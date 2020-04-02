#include<iostream>
using namespace std;
int main()
{
int p,r,t,amt;
float intrest,dis,set;
  std::cin>>p>>r>>t;
  intrest=(p*r*t)/100;
  amt=p+intrest;
  dis=(intrest/100)*2;
  set=amt-dis;
  std::cout<<intrest<<"\n";
  std::cout<<amt<<"\n";
  std::cout<<dis<<"\n";
  std::cout<<set;
  
}