#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;  
  std::cin.getline(str,100);

  for(int i=0;str[i]!='\0';i++)
  end=i;
  for(int i=end;i>=0;i--)
    rev[count++]=str[i];
  rev[count]=NULL;
//Your code goes here               
std::cout<<rev;
}