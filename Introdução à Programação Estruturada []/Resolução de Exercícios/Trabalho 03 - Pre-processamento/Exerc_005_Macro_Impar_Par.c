#include <stdio.h>
#define SIM 1
#define NAO 0

/*5. Tendo em conta o código abaixo crie um macro que permite definir o resultado
correcto.*/

int parImpar (int num){
    int resposta;
    if(num % 2 == 0)
        resposta = SIM;
    else
        resposta = NAO;
    return resposta;
}

int main(void){
    int parImpar (int num);

    if(parImpar (17) == SIM)
        printf("Par ");
    else
        printf ("Impar ");

    if(parImpar (20) == SIM)
        printf("Par \n");
    else
        printf ("impar \n");    

    return 0;
}