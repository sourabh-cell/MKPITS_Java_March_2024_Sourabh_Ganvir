#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main(){
	
   
   int *arr1; 
   int arr[5]; 
   int size;  
   arr1 = (int*) malloc(size * sizeof(int));
   
   printf("please enter the 10 elements in array\n");
   
	for (int i=0;i<5;i++)
	{
	scanf("%d",&arr[i]);
	
	}
	
		for (int i=0;i<=5;i++){
			
		if(arr[i]==0)
		{
			continue;
			
		}
		
		    for(int j=i+1;j<5;j++)
			      {
			
		         	if(arr[i]==arr[j])
			           {
			            
			            arr[j]=0;
		  				
								}
		
							}
	
	
}
size=-1;
for (int i=0;i<5;i++)
	{
	if(arr[i]!=0)
	{
		
	 size++;
     arr1[i]=arr[i];		

	}
	
	
	
}
for(int i=0;i<=size;i++)

{

printf("%d ",arr1[i]);
}
}

