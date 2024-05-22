//Find the largest of two numbers using a function
#include<stdio.h>
#include<conio.h>
int findLarge(int, int);
int findLarge3(int , int ,int );
int main()
{
    int num1, num2, num3, larg2, larg3;
    printf("Enter any three numbers: ");
    scanf("%d%d%d", &num1, &num2, &num3);
    larg3 = findLarge3(num1, num2, num3);
    larg2 = findLarge(num1, num2);
    printf("Largest 0f two number= %d", larg2);
    printf("Largest 0f three number= %d", larg3);
    getch();
    return 0;
}
int findLarge(int a, int b)
{
    if(a<b)
        return b;
    else
        return a;
}

int findLarge3(int a, int b,int c)
{
     if (a >= b && a >= c)
    printf("the largest number.", a);

  // if n2 is greater than both n1 and n3, n2 is the largest
  if (b >= a && b >= c)
    printf("the largest number.", b);

  // if n3 is greater than both n1 and n2, n3 is the largest
  if (c >= a && c >= b)
    printf("the largest number.", c);
}