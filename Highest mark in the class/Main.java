#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,large=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  for(int i=0;i<n;i++)
    if(arr[i]>large)
      large=arr[i];
  cout<<large;
}