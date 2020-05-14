#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int found=0;
  string s1;
getline(cin,s1);
string s2="the ";
found=s1.find(s2);
int k=0;


while(found!=-1)
{
found=s1.find("the",found+1,1);
k++;
}
  k--;

s1.replace(s1.find(s2),s2.length(),"");
  s1.replace(s1.find(s2),s2.length(),"");

cout<<s1;
}