#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  int vow=0,cons=0,whisp=0,dig=0,symb=0;
  for(int i=0;str[i]!='\0';i++)
  {
    if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
      vow++;
    else if(str[i]>=65 && str[i]<=90 || str[i]>=97 && str[i]<=122)
      cons++;
    else if(str[i]==32)
      whisp++;
    else if(str[i]>=48 && str[i]<=58)
      dig++;
    else
      symb++;
  }
  cout<<"Vowels:"<<vow<<"\n"<<"Consonants:"<<cons<<"\n"<<"White Spaces:"<<whisp<<"\n"<<"Digits:"<<dig<<"\n"<<"Symbols:"<<symb;
      
}