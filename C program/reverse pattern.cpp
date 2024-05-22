#include<stdio.h>
#include<stdlib.h>
int main(){
	
	int term, count=1;
	printf("please enter the term");
	scanf("%d",&term);
	
	
	
	for(int i=1;i<=term;i++){
		for(int j = 1;j<=i;j++){
			printf("*");
		}
		printf("\n");
		
	}



		for(int i=term-1;i!=0;i--){
		for(int j = 1;j<=i;j++){
			printf("*");
		}
		printf("\n");
		
	}
	

return 0;	
}