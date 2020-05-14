#include<iostream>
using namespace std;
int printresult(int a[100],int n,int s)
{
  int sum=0;
  for(int i=0;i<n;i++)
    sum=sum+a[i];
  if(sum<=s)
    return 1;
  else
    return 0;
}
int main()
{
  //Type your code here.
  int n,s,a[100],r;
  cin>>n>>s;
  for(int i=0;i<n;i++)
    cin>>a[i];
  r=printresult(a,n,s);
  if(r==1)
  cout<<"YES";
  else
    cout<<"NO";
  
}