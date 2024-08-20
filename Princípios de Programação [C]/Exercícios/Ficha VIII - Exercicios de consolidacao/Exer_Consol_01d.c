#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr01 & Eduardo S. Come>
/*
1 - Quais as saídas para os seguintes programas?
*/

int main() {
    int i, m=0, j=3, k=0;

    for(k=1;k<j;k++){
        m=2*k-m;
    }
    i=pow(2,j)-abs(2*m);
    printf("\n m = : %d",m);
    printf("\n I = : %d",i);
    return 0;
}