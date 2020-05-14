#include<iostream>
using namespace std;
int** createarray(int r1,int c1)
{
	int** arr=new int*[r1];
	int i,j;
	for(i=0;i<r1;i++)
	{
		arr[i]=new int[c1];
		for(j=0;j<c1;j++)
			cin>>arr[i][j];
	}
	return arr;
}
int** addMatrix(int** a1,int** a2,int r,int c)
{
  int i,j;
  int** sum=new int*[r];
  	for(i=0;i<r;i++)
	{
  		sum[i]=new int[c];
		for(j=0;j<c;j++)
			sum[i][j]=a1[i][j]+a2[i][j];
	}
  return sum;
}
  
int main()
{
	int** a1;
  	int** a2;
  	int** sum;
	int r,c,i,j;
	cin>>r>>c;
	a1=createarray(r,c);
  	a2=createarray(r,c);
	sum=addMatrix(a1,a2,r,c);
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
			cout<<sum[i][j]<<" ";
      cout<<"\n";
	}
	return 0;
}