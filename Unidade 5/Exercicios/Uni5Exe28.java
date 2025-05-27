import java.util.Scanner;

public class Uni5Exe28 {
    /*
     * Entrada:
     *  - Código do voto (1 a 4).
     *  - Perguntar se deseja informar mais um voto: s (SIM) / n (NÃO).
     * Processo:
     *  - Contar total de votos para cada grupo.
     *  - Calcular percentual de votos por grupo.
     *  - Determinar grupo vencedor.
     * Saída:
     *  - Exibir total de votos e percentual para cada grupo.
     *  - Exibir grupo vencedor.
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int[] votos = new int[5]; // índices 1 a 4 usados
        int totalVotos = 0;
        String opcao;

        do {
            System.out.print("Informe o código do voto (1 a 4): ");
            int voto = src.nextInt();
            if (voto >= 1 && voto <= 4) {
                votos[voto]++;
                totalVotos++;
            } else {
                System.out.println("Código inválido.");
            }

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            opcao = src.next();
        } while (opcao.equalsIgnoreCase("s"));

        String[] grupos = { "", "Nenhum de Nós", "CPM22", "Skank", "Jota Quest" };

        for (int i = 1; i <= 4; i++) {
            double percentual = totalVotos > 0 ? (votos[i] * 100.0) / totalVotos : 0;
            System.out.printf("%s: %d votos (%.2f%%)%n", grupos[i], votos[i], percentual);
        }

        int maiorVotos = 0;
        int vencedor = 0;
        for (int i = 1; i <= 4; i++) {
            if (votos[i] > maiorVotos) {
                maiorVotos = votos[i];
                vencedor = i;
            }
        }

        if (vencedor != 0) {
            System.out.println("Grupo vencedor: " + grupos[vencedor]);
        } else {
            System.out.println("Nenhum voto registrado.");
        }

        src.close();
    }
}
