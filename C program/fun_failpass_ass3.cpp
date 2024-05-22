//WAF to accept a marks as an argument and if it is >=50 the display "Pass" otherwise display "Fail"
#include<stdio.h>  
int even_odd(int);  
int main()  
{  
 int n,flag=0;  
 printf("\nEnter the marks: ");  
 scanf("%d",&n);  
 flag = even_odd(n);  
 if(flag == 1)  
 {  
    printf("\npass");  
 }  
 else   
 {  
    printf("\nFail");  
 }  
}  
int even_odd(int n)  
{  
    if(n>=50)  
    {  
        return 1;  
    }  
    else   
    {  
        return 0;  
    }  
}  