#include <stdio.h>

int main(void){
	int x = 0;
	int y = 0;
	int ans = 1;

	printf("Please Enter the X for X ^ y : ");
	scanf("%d", &x);

	printf("Please Enter the Y for X ^ Y: ");
	scanf("%d", &y);


	for(int i = 1; i <= y; i++)
		ans = ans * x; 		
	

	printf("x = %d y = %d ans for x ^ y is : %d\n", x, y, ans);
	return 0;
}

