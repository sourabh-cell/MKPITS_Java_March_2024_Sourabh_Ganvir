#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main(){
	
   int i=0,ptr=4,temp,temp2;
   int arr[10]={11,22,33,44,55};
   for(i=0;i<=4;i++){
   	        for(int j=0;j<=4;j++){
   	        	
   	        	if(arr[i]>arr[j])
   	        	{
   	        		temp=arr[j];
   	        		arr[j]=arr[i];
   	        		arr[i]=temp;
				   }
			   }
			   
			   
   }
   
   for(i=0;i<=4;i++){
   
   printf("%d ",arr[i]);
   
}
   for(i=0;i<=3;i++)
   {
    printf("\n%d +",arr[i]);	   
    temp = arr[i]+temp; 
   }

for(int i=1;i>=4;i++)
{

printf("%d+ ",arr[i]);
temp2 = arr[i]+temp2;
   }
   printf("\nsum of four large number is %d\n",temp);
   printf("sum of four lowest number is %d\n",temp2);
}