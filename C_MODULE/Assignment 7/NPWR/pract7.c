#include<stdio.h>
int greatestNumber();
void main()
{
	greatestNumber();
}
int greatestNumber()
{
	int a,b,c;
	printf("\nEnter a number:");
	scanf("%d %d %d",&a,&b,&c);
	if(a>b){
		if(a>c){
	  printf("\n%d is greatest number",a);
	}else{
	printf("\n%d is greatest number",c);
   }
    }else if(b>a){
    if(b>c){
	printf("\n% is greatest number",b);
   }else{
   	printf("\n%d is greatest number",c);
   } 
}else{
	printf("\n%d is a greatest number",a);
	return greatestNumber();
}

}
