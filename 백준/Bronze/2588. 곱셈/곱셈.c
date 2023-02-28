#include<stdio.h>

int main(void)
{
    int A, B;

    scanf("%d", &A);
    scanf("%d", &B);

    if (A < 1000 && B < 1000)
    {
        printf("%d\n", (A % 1000)*(B%10));
        printf("%d\n", (A % 1000)*((B%100)/10));
        printf("%d\n", (A % 1000) * ((B % 1000) / 100));
        printf("%d\n", (A % 1000) * (B % 10) + ((A % 1000) * ((B % 100) / 10)) * 10 + ((A % 1000) * ((B % 1000) / 100)) * 100);
    }

    
    return 0;
}