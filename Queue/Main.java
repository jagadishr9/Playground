#include<iostream>
using namespace std;
void queue(int n,int m,int* a)
{
  int sum=0;
  for(int i=0;i<n;i++)
  {
    if(n<=m)
    {
          if(n<m)
    {
	if(a[i]<=m)
      sum++;
  	else
    { sum++;
  		a[i+1]+=a[i]-m;
    }
    }
    }
    else
    {
    sum=sum+a[i];
    }
}
  if(n>m)
  {
  if(sum%m==0)
     cout<<sum/m;
   else
     cout<<sum/m+1;
  }
  else
    cout<<n;
 }
int main()
{
  //Type your code here.
  int n,m,a[100];
  cin>>n>>m;
  for(int i=0;i<n;i++)
    cin>>a[i];
  queue(n,m,a);
    
}