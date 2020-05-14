#include<iostream>
using namespace std;
int main()
{
  int n;
  float a=0.5,b=1.5;
  cin>>n;
  if(n==1)
    cout<<a;
  else if(n==2)
    cout<<a<<" "<<b;
  else
  {
   cout<<a<<" "<<b<<" ";
      n=n-2;
    while(n)
    {
	cout<<b*3<<" ";
      b=b*3;
      n--;
    }
  }
}
  
  