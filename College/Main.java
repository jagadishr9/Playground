#include<iostream>
using namespace std;
struct College { char name[100]; char city[100]; int establishmentYear; float passPercentage; };
int main()
{
  //Type your code here.
  struct College num[3];
  cout<<"Enter the number of colleges\n";
  int n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<"Enter the details of college "<<i<<"\n";
  	cout<<"Enter name";
    cin>>num[i].name;
    cout<<"\nEnter city";
    cin>>num[i].city;
    cout<<"\nEnter year of establishment";
    cin>>num[i].establishmentYear;
    cout<<"\nEnter pass percentage\n";
    cin>>num[i].passPercentage;
  }
  cout<<"Details of colleges\n";
    for(int i=1;i<=n;i++)
  {
    cout<<"College:"<<i<<"\n";
  	cout<<"Name:";
    cout<<num[i].name;
    cout<<"\nCity:";
    cout<<num[i].city;
    cout<<"\nYear of establishment:";
    cout<<num[i].establishmentYear;
    cout<<"\nPass percentage:";
    cout<<num[i].passPercentage<<"\n";
  }
  
}