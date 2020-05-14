#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
  int len=0;
  char str[100];
 gets(str);
for(int i=0;str[i]!=NULL;i++)
  if(str[i]==32)
    len++;
  if(len>10)
    std::cout<<"Caption not eligible for the contest";
  else
    std::cout<<"Caption eligible for the contest";
   
}