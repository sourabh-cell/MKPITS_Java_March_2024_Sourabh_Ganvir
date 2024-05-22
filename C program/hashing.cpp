#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main(){
	
	int arr[10],index,value;
	printf("please enter the value of array\n");
	
	for(int i=0;i<=9;i++){
		
		
		scanf("%d",&value);
		index=value%10;
		arr[index]=value;
	
		
	}
    for(int i=0;i<=10;i++){
    	printf("%d\n",arr[i]);
    	
	}



}