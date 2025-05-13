#include <stdio.h>

int main(void){
	int N = 0;
	int remainder = 0;
	int sum = 0;

	printf("Please Enter the Number : ");
	scanf("%d", &N);
	
	while(N > 0){
		remainder = N % 10;
		sum += remainder;
		N /= 10;
	}

	printf("Sum of digits  is : %d\n",sum);
	return 0;
}
