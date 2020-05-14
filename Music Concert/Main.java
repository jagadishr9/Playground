#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,m=0,f=0;
  cin>>n;
  int *p=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    cin>>*(p+i);
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      m++;
      else
        f++;
      }
    cout<<f<<"\n"<<m;
  return 0;
}