#include<iostream>
using namespace std;
int hcf(int n1, int n2) 
{
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b <<" = "<<hcf(a,b);
}