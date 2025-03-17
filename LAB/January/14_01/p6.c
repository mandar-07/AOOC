#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE    10

int main(void){
    int arr[SIZE];

    srand(time(0));
    for(int i = 0; i < SIZE; i++)
        arr[i] = rand() / 1000000;

    puts("Array elements");
    for(int i = 0; i < SIZE; i++)
        printf("arr[%d]: %d\n", i , arr[i]);
    
    int i, j, key;
    for(j = 1; j < SIZE; j++){
        key = arr[j];
        i = j - 1;
        while(i >= 0 && arr[i] > key){
            arr[i + 1] = arr[i];
            i = i - 1;
        }
        arr[i + 1] = key;
    }
    
    printf("Minimum no: %d and Maximum number: %d\n", arr[0], arr[SIZE - 1]);
    return 0;
}