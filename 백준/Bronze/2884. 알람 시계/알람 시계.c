#include<stdio.h>

int main(void)
{
    int H, M;

    int time_minus = 45; //45분 일찍 일어나기
    scanf("%d %d", &H, &M);

    if (M >= 45)
    {
        printf("%d %d", H, M - time_minus);
    }
    else if (M < 45)
    {
        if (H >0)
        {
            printf("%d %d", H - 1, M + 60 - time_minus);
        }
        else
        {
            printf("%d %d", 23, M + 60 - time_minus);
        }
     }


    return 0;
}