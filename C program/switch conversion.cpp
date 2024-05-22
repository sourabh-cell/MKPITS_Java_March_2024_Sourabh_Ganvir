#include<stdio.h>
int main(){
	int var,celsius,far;
	printf("please select the conversion");
	printf("1.Celsius to Farhenite\n");
	printf("2. Farhenite to celsuis"\n);
	scanf("%d",&var)
	switch (var) {
        case 1:
        	printf("Enter celsius: ");
            scanf("%d",&cel);
            far = (5/9 * cel)+32;
            printf("Farhenite is %d", far)
            break;
             
 
        case 2:
            printf("Enter Fahrenheit: ");
            scanf("%d",&far);
            celsius = (far - 32)*5/9;
            printf("celsius is %d", celsius)
            break;
 
        case 3:
            printf("Case 3 is Matched.");
            break;






}