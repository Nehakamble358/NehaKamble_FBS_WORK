// write a program to accept array and exchange the data of Xth position to Yth position. Eg.Arr[]={11,13,30,4,21,45,50}
//Xth position =3  Yth position = 5  o/p : 11 23 21 4 30 45 50
#include <stdio.h>
void main() {
    int arr[] = {11, 13, 30, 4, 21, 45, 50};
    int n = sizeof(arr) / sizeof(arr[0]);  // find size of array
    int x, y, temp, i;

    printf("Original Array:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    printf("Enter position X: ");
    scanf("%d", &x);
    printf("Enter position Y: ");
    scanf("%d", &y);
    
    if (x < 1 || x > n || y < 1 || y > n) {
        printf("Invalid positions! Must be between 1 and %d.\n", n);
    } else {
        // Swap elements
        temp = arr[x - 1];
        arr[x - 1] = arr[y - 1];
        arr[y - 1] = temp;
        
        printf("Array after exchanging positions %d and %d:\n", x, y);
        for (i = 0; i < n; i++) {
            printf("%d ", arr[i]);
        }
        printf("\n");
    }
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
