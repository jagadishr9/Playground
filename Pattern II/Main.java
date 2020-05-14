#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int m=0;
  for(int i=1;i<=n;i++)
  {
        m=m+i;
    for(int j=0;j<i;j++)
    {
		if(i%2==0)
      cout<<m--;
      else
        cout<<m++;
      if(j+1<i)
        cout<<"*";
    }
    if(i%2!=0)
      m--;
    cout<<"\n";
  }
}