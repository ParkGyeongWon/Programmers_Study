#include<stdio.h>

int main(void)
{
    int A, B,C;

    scanf("%d %d %d", &A, &B, &C);

    if (A >= 1 && B <= 10000 && C<=10000)
    {
        printf("%d\n",(A+B)%C);
        printf("%d\n",((A%C)+(B%C))%C);
        printf("%d\n",(A*B)%C);
        printf("%d\n",((A%C)*(B%C))%C);
       
    }
    
    return 0;
}