#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  cin>>str;
  for(int i=0;i<str.length();i++)
    if(str[i]>=65 && str[i]<=90 || str[i]>=97 && str[i]<=122)
      cout<<str[i];
  
}