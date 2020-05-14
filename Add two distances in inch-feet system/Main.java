#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float i1,f1,i2,f2,i;
  cin>>f1>>i1>>f2>>i2;
  i=i1+i2;
  if(i1+i2>12)
  {
    i=12-(i1+i2);
    f1+=1;
  }
  if(i1+i2>12)
  cout<<f1+f2<<"'"<<i<<"\"";
  else
   cout<<f1+f2<<"'-"<<i<<"\"";
  
}