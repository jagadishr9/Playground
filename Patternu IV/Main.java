#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,a=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
      if(i%2!=0 && j==n || i%2==0 && j==1 )
        cout<<a+1;
      else
        cout<<a;
    }
    a++;
  cout<<"\n";
  }
    return 0;
}