#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  int sum=0;
for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      if(i==0 || i==m-1 || i==j )
      sum=sum+a[i][j];
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum<<"\n";
}