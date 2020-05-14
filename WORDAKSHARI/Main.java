#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str1,str2;
  char a,b;
  cin>>str1;
  cout<<str1<<"\n";
  while(1)
  {
  cin>>str2;
  a=str1.back();
  b=str2.front();
  if(a==b)
  {
    cout<<str2<<"\n";
  str1=str2;
  }
  else
    break;
  }
}