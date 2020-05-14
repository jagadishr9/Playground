#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int sum=0;
  int store=n;
  int r=1,c=0;
  while(n/r)
  {	
    c++;
    r=r*10;
  }
    
  	while(n)
    {
      sum=sum+power(n%10,c);
        n=n/10;
    }
  if(sum==store)
  return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}