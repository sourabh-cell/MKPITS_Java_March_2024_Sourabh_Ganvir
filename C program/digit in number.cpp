#include<stdio.h>
#include<stdlib.h>

int main(){
	int a , count=0;
	printf("please enter the number");
	scanf("%d",&a);
	while(a>1){
		a=a/10;
		count++;
		
	}
printf("%d",count);
return 0;	
	
}