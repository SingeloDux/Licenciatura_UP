#include<stdio.h>
#define a 10
/* 11. Qual é o resultado de execução do presente programa.*/

int main(){
    printf("%d", a);    

    #define a 50
    
    printf("%d", a);
    return 0;
}