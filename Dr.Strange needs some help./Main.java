#include<iostream>
using namespace std;
int exp(int a,int b)
{
  int p=1;
  while(b)
  {
    p=p*a;
    b--;
  }
  return p;
}
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  if(req<=exp(m,n))
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}