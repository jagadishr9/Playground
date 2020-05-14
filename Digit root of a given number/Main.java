#include<iostream>
using namespace std;
int root(int x)
{
  int r=1;
  int sum=0;
  while(x/r)
  {
     
    sum=sum+(x/r)%10;
    r=r*10;
  }
  if(sum<10)
    return sum;
  else
    return root(sum);
}
int main()
{
  int n;
  cin>>n;
  cout<<root(n);
}