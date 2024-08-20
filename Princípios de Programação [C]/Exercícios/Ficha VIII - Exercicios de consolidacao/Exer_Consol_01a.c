#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr01 & Eduardo S. Come>
/*
1 - Quais as saídas para os seguintes programas?
*/

int main() {
    int i = 0, x = 5, y = 8, z = x % y;
    int v = y / x;
    
    do {
        printf("V = %d\n", v);
        i++;
    }while (i < v);
        if (z < v) {
            printf("Z = %d\n", z);
    } 
    return 0;
}