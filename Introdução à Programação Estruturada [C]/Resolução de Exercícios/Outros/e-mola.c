#include <stdio.h>
#include <string.h>

float saldo = 100;
int pin_correto = 123456;

void transferir_emola()
{
    char numero[10];
    float valor;
    char conteudo[50];
    int pin;

    printf("Digite o numero: ");
    scanf("%s", numero);

    printf("Digite o valor: ");
    scanf("%f", &valor);

    printf("Digite o conteudo da transacao: ");
    scanf(" %[^\n]s", conteudo);

    printf("Digite o PIN: ");
    scanf("%d", &pin);

    if (pin != pin_correto)
    {
        printf("\nPIN incorreto! Tente novamente.\n");
        return;
    }

    if (valor > saldo)
    {
        printf("\nSaldo insuficiente! Seu saldo atual é: %.2f MZN\n", saldo);
        return;
    }

    saldo -= valor;
    printf("\nTransferência de %.2f MZN para %s foi realizada com sucesso!\n", valor, numero);
    printf("Seu novo saldo é: %.2f MZN\n", saldo);
}

void transferir_mpesa_mkesh()
{
    char numero[10];
    float valor;
    char conteudo[50];
    int pin;

    printf("Digite o numero: ");
    scanf("%s", numero);

    printf("Digite o valor: ");
    scanf("%f", &valor);

    printf("Digite o conteudo da transacao: ");
    scanf(" %[^\n]s", conteudo);

    printf("Digite o PIN: ");
    scanf("%d", &pin);

    if (pin != pin_correto)
    {
        printf("\nPIN incorreto! Tente novamente.\n");
        return;
    }

    if (valor > saldo)
    {
        printf("\nSaldo insuficiente! Seu saldo atual é: %.2f MZN\n", saldo);
        return;
    }

    saldo -= valor;
    printf("\nTransferência de %.2f MZN para %s foi realizada com sucesso!\n", valor, numero);
    printf("Seu novo saldo é: %.2f MZN\n", saldo);
}

void transferir_banco()
{
    printf("Transferir para banco selecionado.\n");
}

void levantar()
{
    printf("Levantar selecionado.\n");
}

void comprar_credito()
{
    printf("Comprar crédito selecionado.\n");
    // Lógica para compra de crédito aqui
}

void voz_internet()
{
    printf("Voz & Internet selecionado.\n");
    // Lógica para compra de pacotes de voz e internet aqui
}

void xtique()
{
    printf("Xtique selecionado.\n");
    // Lógica para Xtique aqui
}

void credelec()
{
    printf("CREDELEC selecionado.\n");
    // Lógica para pagamento de energia aqui
}

void pagamentos()
{
    printf("Pagamentos selecionado.\n");
    // Lógica para pagamentos aqui
}

void minha_conta()
{
    int opcao;

    printf("1 - Saldo\n");
    printf("2 - Extrato\n");
    printf("3 - Alterar PIN\n");
    printf("4 - Cancelar conta\n");
    printf("5 - Reverter transação\n");
    printf("6 - Confirmar reversão\n");
    printf("7 - Voucher de pagamento\n");
    printf("8 - Reenviar SMS\n");
    printf("9 - Termos e Condições (T&C)\n");
    printf("10 - Atualizar\n");
    printf("12 - ENG \n");
    printf("Escolha uma opção: ");
    scanf("%d", &opcao);

    switch (opcao)
    {
    case 1:
        printf("\nSeu saldo atual é: %.2f MZN\n", saldo);
        break;
    case 2:
        printf("\nExtrato indisponível no momento.\n");
        break;
case 3:
    int pin_atual, novoPin, confirmacaoPin;
    printf("\nDigite o PIN Atual: \n");
    scanf("%d", &pin_atual);

    if (pin_atual != pin_correto) {
        printf("\nPIN incorreto! Tente novamente.\n");
        break;
    }

    printf("\nDigite o Novo PIN: \n");
    scanf("%d", &novoPin);

    printf("\nConfirme o Novo PIN: \n");
    scanf("%d", &confirmacaoPin);

    if (novoPin == confirmacaoPin) {
        pin_correto = novoPin;
        printf("\nPIN alterado com sucesso!\n");
    } else {
        printf("\nOs PINs não coincidem! Tente novamente.\n");
    }
    break;

    case 4:
        printf("\nOpção para cancelar conta selecionada.\n");
        break;
    case 5:
        printf("\nOpção para reverter transação selecionada.\n");
        break;
    case 6:
        printf("\nOpção para confirmar reversão selecionada.\n");
        break;
    case 7:
        printf("\nOpção para gerar voucher de pagamento selecionada.\n");
        break;
    case 8:
        printf("\nOpção para reenviar SMS selecionada.\n");
        break;
    case 9:
        printf("\nTermos e Condições (T&C):\nEste programa é apenas um exemplo básico.\n");
        break;
    case 10:
        printf("\nAtualização indisponível no momento.\n");
        break;
    case 12:
        printf("\nMudança para Inglês selecionada.\n");
        break;
    case 0:
        printf("\nVoltando ao menu principal...\n");
        break;
    default:
        printf("\nOpção inválida! Tente novamente.\n");
        break;
    }
}

int main()
{
    int opcao;

    printf("1 - Transferir para 86/87\n");
    printf("2 - Transferir para Mpesa/Mkesh\n");
    printf("3 - Transferir para banco\n");
    printf("4 - Levantar\n");
    printf("5 - Comprar crédito\n");
    printf("6 - Voz & Internet\n");
    printf("7 - Xtique\n");
    printf("8 - CREDELEC\n");
    printf("9 - Pagamentos\n");
    printf("10 - Minha conta\n");
    printf("0 - Sair\n");
    printf("=================================\n");
    printf("Escolha uma opção: ");
    scanf("%d", &opcao);

    switch (opcao)
    {
    case 1:
        transferir_emola();
        break;
    case 2:
        transferir_mpesa_mkesh();
        break;
    case 3:
        transferir_banco();
        break;
    case 4:
        levantar();
        break;
    case 5:
        comprar_credito();
        break;
    case 6:
        voz_internet();
        break;
    case 7:
        xtique();
        break;
    case 8:
        credelec();
        break;
    case 9:
        pagamentos();
        break;
    case 10:
        minha_conta();
        break;
    case 0:
        printf("Encerrando o programa...\n");
        break;
    default:
        printf("Opção inválida! Tente novamente.\n");
        break;
    }

    return 0;
}
