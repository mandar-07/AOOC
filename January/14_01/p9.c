#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 	100

int main(void){
	char msg[SIZE]; 
	char reversed[SIZE];

	fgets(msg, sizeof(msg), stdin);
	int length = strlen(msg);

	for(int i = 0, j = length - 1 ; j>= 0; i++, j--)
		reversed[i] = msg[j];

	reversed[length] = '\0';

	puts(reversed); 

}