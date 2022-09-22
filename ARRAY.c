#include<stdio.h>

int main()
{
    int a[5]={90,24,55,12,98};

    for(int i=0;i<5;i++)
    {
        for(int j =1;j<5;j++)
        {
            if(a[j]>a[i])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j]=temp;
            }
        }
    }

    printf("Printing sorted Array");

    for(int i=0;i<5;i++)
    {
        printf("%d\n",a[i]);
    }

    return 0;
}