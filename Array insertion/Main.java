#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n+1];
  cout<<"Enter the elements in the array\n";
   for(int i=0;i<n;i++)
   cin>>a[i];
int loc,val;
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>loc;
  if(loc<n)
  {
  cout<<"Enter the value to insert\n";
  cin>>val;
  for(int i=n;i>=loc-1;i--)
    a[i+1]=a[i];
  a[loc-1]=val;
  cout<<"Array after insertion is\n";
  
  for(int i=0;i<n+1;i++)
    cout<<a[i]<<"\n";
  }
  else
    cout<<"Invalid Input";
  
}