#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,gcd=1;
cin>>a>>b>>c>>d;
  int small;
if(a<b && a<c)
  small=a;
  else if(b<a && b<c)
    small=b;
  else
    small=c;
  for(int i=small;i<=a && i<=b && i<=c;i--)
    if(a%i==0 && b%i==0 && c%i==0)
    {
      gcd=i;
      break;
    }
  if(d==gcd)
  cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}