#include<iostream>
int fact(int x)
{
  if(x==0)
    return 1;
  else
  return x*fact(x-1);
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
}