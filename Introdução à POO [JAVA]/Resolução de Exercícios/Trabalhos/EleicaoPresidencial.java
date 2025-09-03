import java.util.Scanner;

public class EleicaoPresidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulos = 0, brancos = 0, total = 0;
        int voto;

        System.out.println("ELEIÇÃO - Códigos: 1-4 (candidatos) | 5 (nulo) | 6 (branco) | 0 (sair)");

        do {
            System.out.print("Voto: ");
            voto = scanner.nextInt();

            if (voto != 0) {
                switch (voto) {
                    case 1: cand1++; break;
                    case 2: cand2++; break;
                    case 3: cand3++; break;
                    case 4: cand4++; break;
                    case 5: nulos++; break;
                    case 6: brancos++; break;
                    default: System.out.println("Código inválido!"); continue;
                }
                total++;
            }
        } while (voto != 0);

        double percNulos = (total > 0) ? (nulos * 100.0) / total : 0;
        double percBrancos = (total > 0) ? (brancos * 100.0) / total : 0;

        System.out.println("\nRESULTADOS:");
        System.out.println("Candidato 1: " + cand1 + " votos");
        System.out.println("Candidato 2: " + cand2 + " votos");
        System.out.println("Candidato 3: " + cand3 + " votos");
        System.out.println("Candidato 4: " + cand4 + " votos");
        System.out.println("Nulos: " + nulos + " (" + String.format("%.1f", percNulos) + "%)");
        System.out.println("Brancos: " + brancos + " (" + String.format("%.1f", percBrancos) + "%)");
        System.out.println("Total: " + total + " votos");
        scanner.close();
    }
}