#include<iostream>
using namespace std;
int main()
{
  int n,a=11;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<a*a<<" ";
    a=a+4;
  }
}