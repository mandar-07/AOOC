#include <stdio.h>

#define LIMIT	10

int main(void){
	
	int i;
	int sum = 0;

	for(i = 1; i <= LIMIT; i++)
		sum += i;
	
	printf("Addition of 1 to 10 number is : %d\n", sum);
	return 0;
}
