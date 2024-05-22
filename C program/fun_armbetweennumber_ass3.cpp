#include <stdio.h>
#include <math.h>

int digit(int n);

int digit(int n) {
    int a;
    double i = 0;
    do {
        a = n % (int)(pow(10, i));
        i++;
    } while (a != n);
    return i;
}

void is_armstrong(int n);

void is_armstrong(int n) {
    int a, b;
    double sum;
    for (int i = 0; i < digit(n); i++) {
        a = n / (int)pow(10, (double)i);
        b = a % 10;
        sum += pow((double)b, 3);
    }
    if ((int)sum == n) {
        printf("%d is an armstrong number.\n", n);
    }
}

int main() {
    int a, b;
    printf("Please input the left hand limit of range : \n");
    scanf(" %d", &a);
    printf("Please input the right hand limit of range : \n");
    scanf(" %d", &b);
    for (int i = a; i <= b; i++) {
        is_armstrong(i);
    }
    is_armstrong(153);
    return 0;
}