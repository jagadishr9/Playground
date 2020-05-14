#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n],e=0,o=0;
  for(int i=0;i<n;i++)
    cin>>a[i];
    for(int i=0;i<n;i++)
    {if(a[i]%2==0)
        e=e+a[i];
  else
    o=o+a[i];}
  cout<<"The sum of the even numbers in the array is "<<e<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<o;
}