#include<iostream>
using namespace std;
int main()
{
  int n,a=6;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<a<<" ";
    a=a+5*i;
  }
}