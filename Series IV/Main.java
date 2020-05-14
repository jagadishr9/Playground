#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=0,b=2,c=6;
  cin>>n;
  if(n>=1)
    cout<<a<<" ";
  if(n>=2)
    cout<<b<<" ";
  if(n>2)
  {
    for(int i=3;i<=n;i++)
    {
        cout<<b+c<<" ";
          b=b+c;
      if(i%2==0)
      {
      c=c+4;
      }
    }
  }
}

  