#include<iostream>
int main()
{
    int r, c;
    std::cin>>r>>c;
    int a1[r][c],a2[r][c];

    // Type your code here
      for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a1[i][j];
        }
      }
        for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a2[i][j];
        }
      }

    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cout<<a1[i][j]+a2[i][j]<<" ";
        }
        std::cout<<"\n";
    }
}