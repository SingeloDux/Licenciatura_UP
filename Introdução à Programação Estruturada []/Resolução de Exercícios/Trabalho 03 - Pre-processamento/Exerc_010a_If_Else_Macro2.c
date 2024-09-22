#include <stdio.h>
#define Y 7

#if !Y
    #define RESULT "PJA"
#else
    #define RESULT "PJA & C"
#endif

int main(){
    printf("%s", RESULT);
    return 0;
}

/* 10. **Qual será o resultado da execução do seguinte código.**

a) Reformule o cabeçalho de modo a dar um resultado pretendido

*/