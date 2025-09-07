//check if the array is palindrome or not
#include<stdio.h>
void main()
 {
    int n, i, flag = 1;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];   // array of size n

    printf("Enter elements:\n");
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    for(i = 0; i < n/2; i++) {
        if(arr[i] != arr[n-i-1]) {
            flag = 0;
            break;
        }
    }
    
	if(flag == 1)
        printf("Array is Palindrome\n");
    else
        printf("Array is Not Palindrome\n");
}