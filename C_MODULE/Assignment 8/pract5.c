#include<stdio.h>
void main(){
	int a =10;
	int* ptr=&a;
	printf("a ki value=%d\n",a);
	printf("ptr ki value = %u\n",ptr);
	printf("ptr ka address = %u\n",&ptr);
	printf("a ka address = %u\n",&a);
	printf("a ki value = %d\n",*ptr);
	printf("a ki value = %d\n",*(ptr+0));

}