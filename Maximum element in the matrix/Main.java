#include<iostream>
using namespace std;
int main()
{
  int m,n,max;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  max=0;
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      if(a[i][j]>max)
  	   max=a[i][j];
    
  }
  cout<<"The maximum element is "<<max<<"\n";
  return 0;
}