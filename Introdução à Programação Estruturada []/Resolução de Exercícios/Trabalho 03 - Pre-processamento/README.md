# 📝 Trabalho III - Pre-processamento

## 📌 Objetivo
Nesta ficha, você encontrará uma série de exercícios práticos focados em **diretivas de pré-processamento** usando a linguagem C.

## Recursos 📚
- [Directiva ou Pré-Processador](http://sgeraldoc.blogspot.com/2019/04/directiva-ou-pre-processor.html)
- [Pré-Processamento & Macros Pré-definidas](http://sgeraldoc.blogspot.com/2020/05/pre-processamento.html)
- [Exercícios - Pré Processamento](https://sgeraldoc.blogspot.com/2021/05/exercicios-pre-processamento.html)

## 📚 Exercícios

### 1. **Qual é a diferença entre **
   - const MAX = 100; e #define MAX 100.

### 2. **Descreve o significado do seguinte código:**
```
     	#include <stdio.h>
	#define y 10
	#define DIE \
	fprintf(stderr, "Erro fatal :Abortar \n"); exit(0);

	int main() {
	   int valor;
	   const x = 12;

	   printf("O valor de y e: %d e de x e: %d", y,x);
	    valor = 1;
	    if (valor<0)
	    DIE;

	    printf("N terminou a execucao \n");

	    return (0);
	}
```

### 3. **Define o macro e o cabeçalho necessario para a execução adequada do seguinte programa. **
``` 
int main() {
    int indice, i;


    for (indice = 0; indice < TAMANHO; indice++) {
        vetor[indice] = indice;
        dobro[indice] = indice * 2;
    }  

    for (i = 0; i < TAMANHO; i++) {
        printf("%d %d \n", vetor[i], dobro[i]);
    }

    return 0;
}

```

### 4. **Digite o código abaixo e descreve o resultado obtido.**
```
#include <stdio.h>
#define x 7
#define y 5
#define xy x + y

int main() {
   
    printf("xy %d \n", xy * xy);

    return 0;
}

```

### 5. **Tendo em conta o código abaixo crie um macro que permite definir o resultado correcto.**
```
#include <stdio.h>

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
```

### 6. **Execute o código apresentado na imagem abaixo e justifique o resultado obtido.**
```
#include <stdio.h>
#define TAMANHO 10;
#define SUB TAMANHO - 2;

int main(){
    int tamanho;
    tamanho = SUB;

    printf ("Size is %d\n", tamanho);    
    return 0;
}
```

### 7. **Usando macro e estrutura de repetição cria um programa para obter o quadrado de 10 números.**

### 8. **Diga qual é o valor do Y no código abaixo.**
```
	#include <stdio.h>

	#if X == 3
	    #define Y 3
	#else
	    #define Y 5
	#endif

	int main() {

	    printf("%d", Y);

	    return 0;
	}
```

### 9. **Qual será o resultado da exucção do código abaixo**
```
#include <stdio.h>
#define quadrado(x) x*x

int main() {
    int x;
    x = 36/quadrado(6);
    printf("%d ", x);
    
    return 0;
}
```

### 10. **Qual será o resultado da execução do seguinte código.**
```
    #include<stdio.h>
    #define Y 7
    #if !Y
       	printf("PJA");  
    #else
       	printf("PJA");  
    #endif
    
    int main(){
    	return 0;
    }
```
   a) Reformule o cabeçalho de modo a dar um resultado pretendido

### 11. **Qual é o resultado de execução do presente programa.**
```
    #include<stdio.h>
    #define a 10
   
    int main(){
    	printf("%d", a);    
    
    	#define a 50
    	
    	printf("%d", a);
    	return 0;
    }
```
   
### 12. **Qual é o resultado da execução do seguinte código**
   -
```
    #include<stdio.h>
    #define f(g,g2) g##g2
    
    int main(){
    	int var12 = 100;
    	
    	printf("%d", var,12);
    	return 0;
    }
```
---

## 🛠️ Requisitos

- **Linguagem:** C
- **Ambiente de Desenvolvimento:** Qualquer IDE ou editor de texto que suporte C (e.g., Code::Blocks, Visual Studio Code).

Boa sorte e bons estudos!


