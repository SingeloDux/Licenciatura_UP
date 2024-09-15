# 📚 Funções e Macros em C

## 1. Função `imprimir`

A função `imprimir` simplesmente exibe uma mensagem na tela:

```c
void imprimir(void) {
    printf("Calculadora da hipotenusa!\n");
}
```

## 2. Função `hipotenusa`

A função `hipotenusa` calcula o valor da hipotenusa, usando os catetos `a` e `b`:

```c
#include <math.h>

float hipotenusa(float a, float b) {
    return sqrt(pow(a, 2) + pow(b, 2));
}
```

## 3. Função `main`

No `main`, a função `imprimir` é chamada para exibir a mensagem. Em seguida, são lidos os valores dos catetos, e a função `hipotenusa` calcula o valor da hipotenusa. 

Além disso, temos a chamada de outra função que calcula o fatorial de um número.

```c
int main(int argc, char *argv[]) {

    // Exibe mensagem de boas-vindas
    imprimir();

    // Calculando a hipotenusa
    float cat1, cat2;

    // Leitura dos valores dos catetos
    printf("Digite o valor do primeiro cateto: ");
    scanf("%f", &cat1);
    printf("Digite o valor do segundo cateto: ");
    scanf("%f", &cat2);

    // Calcula a hipotenusa
    float result = hipotenusa(cat1, cat2);
    printf("O valor da hipotenusa é: %.2f\n", result);

    // Cálculo do fatorial
    int num, res;
    printf("Digite um número para calcular o fatorial: ");
    scanf("%d", &num);
    
    res = factorial(num); // Chama a função recursiva factorial
    printf("O fatorial de %d é: %d\n", num, res);

    return 0;
}
```

## 4. Função Recursiva `factorial`

A função recursiva para calcular o fatorial de um número:

```c
int factorial(int n) {
    if (n < 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

---

## 5. Definição de Macros

Macros são formas de simplificar o código usando o pré-processador. Aqui estão alguns exemplos de macros definidas:

```c
#define quad(n) ((n) * (n))     // Calcula o quadrado de n
#define abs(n) ((n) < 0 ? -(n) : (n)) // Valor absoluto de n
#define max(x, y) ((x) > (y) ? (x) : (y)) // Máximo entre x e y
```

Uso das macros:

```c
#include <stdio.h>
#include "macros.h"

int main() {
    int z = quad(8);
    printf("O quadrado de 8 é: %d\n", z);
    
    printf("O valor absoluto de -5 é: %d\n", abs(-5));
    printf("O maior entre 10 e 20 é: %d\n", max(10, 20));

    return 0;
}
```

---

## 6. Macros Pré-definidas

O compilador define algumas macros úteis que você pode usar para depuração e exibição de informações sobre o código.

Exemplo de uso das macros pré-definidas:

```c
int main() {
    printf("Arquivo: %s\n", __FILE__);
    printf("Data: %s\n", __DATE__);
    printf("Hora: %s\n", __TIME__);
    printf("Linha: %d\n", __LINE__);
    printf("Padrão ANSI: %d\n", __STDC__);

    return 0;
}
```

Essas macros exibirão informações como o nome do arquivo, a data e hora da compilação, o número da linha atual e se o compilador segue o padrão ANSI.

---

## 7. Uso de `#define` com Funções

Você pode usar `#define` para simplificar chamadas de funções. Um exemplo seria:

```c
#define say printf
#define hi "Olá, tudo bem?"

int main() {
    say(hi);  // Equivalente a: printf("Olá, tudo bem?");
    return 0;
}
```

---

### Referências

- [Funções](http://sgeraldoc.blogspot.com/2019/04/funcoes.html)
- [Directiva ou Pré-Processador](http://sgeraldoc.blogspot.com/2019/04/directiva-ou-pre-processor.html)
- [Pré-Processamento & Macros Pré-definidas](http://sgeraldoc.blogspot.com/2020/05/pre-processamento.html)

---
