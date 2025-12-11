//2. Write a program in C to find two maximum number in array?
#include <stdio.h>

void main() {
    int arr[] = {1, 2, 3, 4, 5};
    int brr[] = {1, 6, 7, 3, 2};
    int n1 = 5, n2 = 5;

    printf("Common elements: ");

    for (int i = 0; i < n1; i++) {
        for (int j = 0; j < n2; j++) {
            if (arr[i] == brr[j]) {
                printf("%d ", arr[i]);
                break;
            }
        }
    }
}