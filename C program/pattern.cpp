#include<stdio.h>
#include<stdlib.h>
int main(){
	
	int term;
	printf("please enter the term");
	scanf("%d",&term);
	
	for(int i=1;i<=term;i++){
		for(int j = 1;j<=i;j++){
			printf("%d",i);
		}
		printf("\n");
		
	}
return 0;	
}