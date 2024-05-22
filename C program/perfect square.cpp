#include <stdio.h>
int main() {
   int a,b=0;
   printf("enter the number");
   scanf("%d",&a);
   
   if (a==1 || a==0)
   {
   	printf("the number is perfect square");
   	b=1;
   }
   for(int i= 2;i<=a/2;i++){
   	if (a == i*i){
   		printf("the number is perfect square");
   		b=1;
   		break;
	   }
   }
   if(b == 0){
   	printf("the number is not perfect square");
   }

   return 0;
}