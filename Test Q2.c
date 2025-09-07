//2 Write a program in C to find two maximum number in array?
#include <stdio.h>

int main() {
    int n, i;
    printf("Enter the size of array: ");
    scanf("%d",&n);

    int arr[n];
	printf("Enter elements:");
	scanf("%d",&n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int max1, max2;
	if (arr[0] > arr[1]) {
        max1 = arr[0];
        max2 = arr[1];
    } else {
        max1 = arr[1];
        max2 = arr[0];
    }
    for (i = 2; i < n; i++) {
        if (arr[i] > max1) {
            max2 = max1;
            max1 = arr[i];
        } else if (arr[i] > max2 && arr[i] != max1) {
            max2 = arr[i];
        }
    }
	printf("First maximum = %d\n", max1);
    printf("Second maximum = %d\n", max2);
}

