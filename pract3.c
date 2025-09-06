//3.Find sum of all numbers.
#include<stdio.h>
void main()
{
	int arr[] ={10,20,30,40,50};
	int n =sizeof(arr)/ sizeof (arr[0]);
	int sum = 0;
	
	for(int i=0; i<n; i++){
	sum += arr[i];
    }
    printf("sum of all numbers:%d\n",sum);
}