#include <stdio.h>

int main(void){
	int a,b,c;
	
	printf("Please Enter the First number: ");
	scanf("%d", &a);

	printf("Please Enter the Second Number: ");
	scanf("%d", &b);

	printf("Please Enter the Third Number: ");
	scanf("%d", &c);

	if(a > b && a > c)
		printf("The greater number is : %d\n", a);
	else if(b > a && b > c)
		printf("The greater number is : %d\n", b);

	else 
		printf("The greater number is : %d\n", c);

	return 0;
}
