#include<iostream>
using namespace std;
int main()
{
  int n,a,b,c,d;
  cin>>n;
  cin>>a>>b>>c>>d;
  switch(n)
  {
    case 1:
      if(b+d>0)
        cout<<a+c<<"+"<<b+d<<"i";
      else
        cout<<a+c<<b+d<<"i";
    break;
    case 2:
      if(b-d>0)
        cout<<a-c<<"+"<<b-d<<"i";
      else
        cout<<a-c<<b-d<<"i";
      break;
    case 3:
      if(a*d+c*b>0)
      cout<<a*c-b*d<<"+"<<b*c+b*d<<"i";
      else
        cout<<a*c-b*d<<a*d+c*b<<"i";
      break;
    default:cout<<"Invalid choice";
  }
}