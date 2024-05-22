#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main(){
	
   int count;
   int arr[10]={11,22,33,44,55,66,66,77,77,77};
	for (int i=0;i<=9;i++){
		count = 1;
		if(arr[i]==-1)
		{
			continue;
			
		}
		
		    for(int j=i+1;j<=9;j++)
			      {
			
		         	if(arr[i]==arr[j])
			           {
			            count++;
			            arr[j]=-1;
		  				
								}
		
							}
		
            	printf("%d is %d times\n",arr[i],count);
            	
																}
       
	          															} 
	          
		

	
	
