//2. Write a user define function to reverse string.
#include <stdio.h>
#include <string.h>

void reverse(char str[]) {
    int i, j;
    char temp;

    for (i = 0, j = strlen(str) - 1; i < j; i++, j--) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

void main() {
    char s[50];

    printf("Enter string: ");
    scanf("%s", s);

    reverse(s);

    printf("Reversed string = %s", s);

}