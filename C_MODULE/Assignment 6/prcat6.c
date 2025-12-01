//6. printf a half pyramid using numbers  input: n=5
#include<stdio.h>
void main()
{
	int n=5;
	for(int i=1; i<=n; i++){
	for(int j=1; j<=i; j++){
		printf("%d",j);
	}
    printf("\n");
  }
}