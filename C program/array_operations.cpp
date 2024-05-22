#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

int data,loc;

void insert(int *arr){
repeat:
printf("\nplease enter the data and location to enter\n");	
scanf("%d%d",&data,&loc);
if(loc<10)
{
arr[loc]=data;	
}

else
{
printf("please enter the valid location");	
goto repeat;
}

printf("\nThe number is stored on given location");
for(int i=0;i<10;i++){
	
	printf("%d\n",arr[i]);
}
}

void ldelete(int *arr){
	
repeat:
printf("\nplease enter location to delete\n");	
scanf("%d",&loc);
if(loc<10)
{
arr[loc]=NULL;	
}

else
{
printf("please enter the valid location");	
goto repeat;
}

printf("\nThe number is deleted from given location");
for(int i=0;i<10;i++){
	if(arr[i]==NULL){
	continue;
	}
    else{
	
	printf("%d\n",arr[i]);
}	
}
}
void search(int *arr){

printf("\nplease enter the data to search\n");	
scanf("%d",&data);
for(int i=0;i<10;i++){
if(arr[i]==data);
{
printf("\ndata is found on location:%d",i);	
break;
}
}


}

void display(int *arr){
	
printf("\nEnter the choice to display \n.1forward\n2.reverse\n");
scanf("%d",&data);

if(data==1){


for(int i=0;i<10;i++)
{
	
	printf("%d ",arr[i]);
}	
 
 	       }
 	       
else
{
for(int i=9;i>-1;i--)
{
	
	printf("%d ",arr[i]);
}	
 

} 	       
 	       
}
void sort(int *arr)
{
	
int temp;
for(int i=0;i<10;i++)
{
	
	printf("%d ",arr[i]);
}

for(int i=0;i<10;i++){
   	        for(int j=0;j<10;j++){
   	        	
   	        	if(arr[i]<arr[j])
   	        	{
   	        		temp=arr[j];
   	        		arr[j]=arr[i];
   	        		arr[i]=temp;
				   }
			   }
			   
			   
   }
   printf("\n");
      for(int i=0;i<10;i++)
	  {
	  	
          printf("%d ",arr[i]);
                      }
	
	
	
}

void palindrome()
{
	
	
}


int main ()  
{   int array[10]={23,34,65,22,45,15,78,98,46,87};
     
    int choice =0;  
    while(choice != 9)   
    {  
        printf("\n\n*********Main Menu*********\n");  
        printf("\nChoose one option from the following list ...\n");  
        printf("\n===============================================\n");  
        printf("\n1.Insert\n2.Deletet\n3.Search\n4.Show\n5.Sort\n6.Exit\n");  
        printf("\nEnter your choice?\n");         
        scanf("\n%d",&choice);  
        switch(choice)  
        {  
            case 1:  
            insert(array);      
            break;  
            case 2:   
            ldelete(array);       
            break;    
            case 3:  
            search(array);         
            break;  
            case 4:  
            display(array);        
            break;  
            case 5:
            sort(array);
            case 6:  
            exit(0);  
            break;  
            default:  
            printf("Please enter valid choice..");  
        }  
    }  
}  