
#include<stdio.h>
#include<conio.h>
void main()
{
    int a[100],n,visited=-1;
    printf("enter the size of array: ");
    scanf("%d",&n);
    printf("enter the elements in the array: ");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int freq[n];
    for(int i=0;i<n;i++)
    {   int count=1;
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                count++;
            freq[j]=visited;
            }
            if(freq[i]!=visited)
            {
                freq[i]=count;
            }
        }

    }
    for(int i=0;i<n;i++)
    {
        if(freq[i]!=visited)
        {
            printf("element | frequency: \n");
            printf("%d - %d\n",a[i],freq[i]);
        }
    }
    getch();
}




