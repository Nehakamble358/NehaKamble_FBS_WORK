//Que 1. Convert the time entered in hh,min and sec into total seconds.
#include<stdio.h>
#include<conio.h>
void main() {
    int h, m, s, total;

    printf("Enter hours: ");
    scanf("%d", &h);
    printf("Enter minutes: ");
    scanf("%d", &m);
    printf("Enter seconds: ");
    scanf("%d", &s);

    total = h*3600 + m*60 + s;

    printf("Total Seconds = %d", total);

}