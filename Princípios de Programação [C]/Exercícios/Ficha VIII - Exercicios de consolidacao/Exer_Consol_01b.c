#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr01 & Eduardo S. Come>
/*
1 - Quais as saídas para os seguintes programas?
*/

int main() {
    int a=5; 
    int b=12; 
    int c=ceil(b% a);
    
    switch (c){
        case 3: 
            printf("B = %d",b);
            break;
        case 6: 
            printf("A = %d",a);
            break;
        default:
            printf("C = %d",c);
    } 
    return 0;
}