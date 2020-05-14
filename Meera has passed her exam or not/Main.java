#include<iostream>
using namespace std;
int main()
{
   // Type your code here
  int n,arr[100],f,i;
  cin>>n;
  for(i=0;i<n;i++)
    cin>>arr[i];
  cin>>f;
  for(i=0;i<n;i++)
    if(f==arr[i])
      break;
  if(f==arr[i])
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}
   