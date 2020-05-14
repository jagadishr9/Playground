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
    int maxsum=0;
  int sum=0;
  int row;
  cout<<"Sum of rows is ";
   for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      sum=sum+a[i][j];
    cout<<sum<<" ";
  	if(maxsum<sum)
            {
       maxsum=sum;
              row=i+1;
            }
    sum=0;
  }
  cout<<"\n"<<"Row "<<row<<" has maximum sum"<<"\n";
  maxsum=0;
  sum=0;
  int column;
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
      sum=sum+a[j][i];
    cout<<sum<<" ";
  	if(maxsum<sum)
            {
       maxsum=sum;
              column=i+1;
            }
    sum=0;
  }
  cout<<"\n"<<"Column "<<column<<" has maximum sum";
  return 0;
}