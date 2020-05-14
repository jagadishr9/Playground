#include<iostream>
using namespace std;
int main()
{
  int n,a=1;
  cin>>n;
  int b=(n*n+1);
  int c=b;
  int p=n;
  for(int i=n;i>=1;i--)
  {
        for(int k=n;k>i;k--)
          for(int s=0;s<2;s++)
        cout<<"-";
    for(int j=0;j<i;j++)
    {
      cout<<a++<<"*";
    }
    for(int t=i;t>=1;t--)
    {
      cout<<b++;
      	if (t!=1)
        cout<<"*";
    }
	b=b-i-(--p);
    
    cout<<"\n";
  }
  
}