#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

int array[100];
int size;

//Find the first repeating element in an array of integers
void first_reapeating_array()
{
		for (int i=0;i<size;i++)
		{
		
		    for(int j=i+1;j<size;j++)
			      {
			
		         	if(array[i]==array[j])
			           {
		  		        printf("\nThe first reapeating number is:%d",array[j]);
						   		
						}
		
							}	
        }
}
//Find the first non-repeating element in a given array of integers
void first_nonreapeating_array()
{
	for (int i=0;i<size;i++)
		{
		
		    for(int j=i+1;j<size;j++)
			      {
			
		         	if(array[i]==array[j])
			           {
		  		        continue;
						   		
						}
					
					else
					{
						printf("\nThe first non reapeating number is:%d",array[j]);
						break;
					}	
		
							}
			break;					
        }
	
}

void Minimum_and_maximum()
{
	int temp;

	for(int i=0;i<size;i++)
	{
   	        for(int j=0;j<size;j++)
			   {
   	        	
   	        	if(array[i]<array[j])
   	        	{
   	        		temp=array[j];
   	        		array[j]=array[i];
   	        		array[i]=temp;
					   
				}
			   
			   }
			   
			   
   }
    

    for(int i=0;i<size;i++)
			{
				printf("\n%d ",array[i]);
				
			}     
   
  // printf("The minimum no:%d And Maximum no:%d",array[4],array[0]);

}

void Largest_and_smallestk()
{
	
int temp;

	for(int i=0;i<size;i++)
	{
   	        for(int j=0;j<size;j++)
			   {
   	        	
   	        	if(array[i]<array[j])
   	        	{
   	        		temp=array[j];
   	        		array[j]=array[i];
   	        		array[i]=temp;
					   
				}
			   
			   }
			   
			   
   }
    

    for(int i=0;i<size;i++)
			{
				printf("\n%d ",array[i]);
				
			}     
   
   printf("The minimum no:%d And Maximum no:%d",array[4],array[0]);
	
	
}
int main(){
	
	int array[100];
	int size;
	int choice;
	
	printf("Enter the size of array");
	scanf("%d",&size);
	printf("\nEnter the element of array");
	
	for(int i=0;i<size;i++)
	{
	scanf("%d",&array[i]);	
		
	}

 printf("\n1.first repeating element in an array\n2.first non-repeating element\n3.minimum and maximum element in an array\n4.Kth largest and Kth smallest number in an array\n9.Exit\n");  
        printf("\nEnter your choice?\n");         
        scanf("\n%d",&choice);  
        switch(choice)  
        {  
            case 1:  
            first_reapeating_array();      
            break;  
            case 2:  
            first_nonreapeating_array();         
            break;  
            case 3:  
            Minimum_and_maximum();       
            break;  
            case 4:  
            Largest_and_smallestk();       
            break;  
            //case 5:  
            //last_delete();        
            //break;  
           // case 6:  
            //random_delete();          
            //break;  
            //case 7:  
           // search();         
            //break;  
            //case 8:  
            //display();        
            //break;  
            case 9:  
            exit(0);  
            break;  
            default:  
            printf("Please enter valid choice..");  
        }  
    }  


