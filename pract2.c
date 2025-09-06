//2. Search the given number in array.
#include<stdio.h>
void main()
{
	int arr[]={10,20,30,40,50};
	int n = sizeof(arr) / sizeof(arr[0]);
	int searchNum = 30;
	int found = 
	0;
	int i;
	
	for(i=0; i<n; i++){
		if(arr[i]==searchNum){
			found = 1;
			break;
		}
			
	}

	if(found){
		printf("Number %d found in the array at index %d.\n",searchNum,i);
	}else{
		printf("Number %d not found in the array.\n",searchNum);
	}
}