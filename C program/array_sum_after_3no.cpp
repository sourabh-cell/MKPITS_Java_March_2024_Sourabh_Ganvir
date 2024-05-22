#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main(){
	
   int i=0,sum;
   int arr[10]={11,22,33,44,55,66,66,77,77,77};
   for(i=0;i<=9;i++){
   	if(i%3==0){
   		if(i==0){
   			continue;
		   }
		   else{
		   
   		sum=arr[i]+sum;
   		printf("%d",arr[i]);
   	}
	   }
   	
   }
   printf("%d",sum);
}