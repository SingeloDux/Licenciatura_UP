
import java.time.Year;
import java.util.Scanner;

public class Exerc_2c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu apelido: ");
        String apelido = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Calcular idade
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        System.out.println("\n--- Informações Pessoais ---");
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Telefone: " + telefone);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Idade: " + idade + " anos");

        scanner.close();
    }
}
