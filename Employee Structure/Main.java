#include<iostream>
using namespace std;
struct student
{
  char name[10];
  char designation[15];
  int ID;
  int Age;
  int salary;
};
int main()
{
  //Type your code here.
  student s;
    cout<<"Enter name:\n";
    cin.getline(s.name, 10);
  	cout<<"Enter ID:\n";
  	cin>>s.ID;
  cout<<"Enter age:\n";
  cin>>s.Age;
  	cout<<"Enter designation:";
  cin>>s.designation;
  	cout<<"\nEnter Salary:\n";
  	cin>>s.salary;
  cout<<"Employee Details";
     cout<<"\nName of the Employee : "<<s.name;
  cout<<"\nID of the Employee : "<<s.ID;
  cout<<"\nAge of the Employee : "<<s.Age;
  cout<<"\nDesignation of the Employee : "<<s.designation;
  cout<<"\nSalary of the Employee : "<<s.salary;
  

}