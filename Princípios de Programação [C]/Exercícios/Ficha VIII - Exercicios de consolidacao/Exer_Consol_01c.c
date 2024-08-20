#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr01 & Eduardo S. Come>
/*
1 - Quais as saídas para os seguintes programas?
*/

int main() {
    int x = 10;

    do{
        x *= 20-x;
    }while(x < 5);    
    printf("X = %d",x);
    return 0;
}