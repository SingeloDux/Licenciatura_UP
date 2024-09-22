#include <stdio.h>

#if X == 3
    #define Y 3
#else
    #define Y 5
#endif

/*8. Diga qual é o valor do Y no código abaixo.*/

int main() {

    printf("%d", Y);

    return 0;
}