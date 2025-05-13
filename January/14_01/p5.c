#include <stdio.h>
#include <stdlib.h>

#define SIZE	10

void insert_sort(int arr[], int N);
void show_array(int arr[], char* msg);

int main(void){
	int arr[SIZE];
	int N = SIZE;

	for(int i = 0;i < SIZE; i++){
		printf("Enter the number for arr[%d]: ", i);
		scanf("%d",&arr[i]);
	}	
	
	show_array(arr, "Before Sorting");
	insert_sort(arr, N);
	show_array(arr, "After Sorting");

	return 0;	
}


void insert_sort(int arr[], int N){
	int i , j , key;

	for(j = 1; j <= SIZE; j++){
		i = j - 1;
		key = arr[j];
		while(i >= 0 && arr[i] > key){
			arr[i + 1] = arr[i];
			i = i - 1;
		}
		arr[i + 1] = key;
	}
}
	
void show_array(int arr[], char* msg){
	if(msg)
		puts(msg);

	for(int i = 0; i < SIZE; i++)
		printf("arr[%d]: %d\n", i, arr[i]);

}
