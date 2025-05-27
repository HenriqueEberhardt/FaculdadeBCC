import java.util.Scanner;

public class Uni5Exe33 {
    /*
     * Entrada:
     *  - Inteiros representando votos (1 a 6) ou 0 para encerrar
     * Processo:
     *  - Contar votos para cada candidato (1 a 4)
     *  - Contar votos nulos (5) e em branco (6)
     *  - Validar entrada, solicitando voto válido se inválido (exceto 0 para sair)
     *  - Calcular percentual de votos nulos + brancos sobre o total de votos
     * Saída:
     *  - Total de votos para cada candidato
     *  - Total de votos nulos
     *  - Total de votos em branco
     *  - Percentual de votos nulos e em branco sobre total
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int voto;
        int totalC1 = 0, totalC2 = 0, totalC3 = 0, totalC4 = 0;
        int totalNulos = 0, totalBrancos = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Informe o voto (1-4 para candidato, 5 nulo, 6 branco, 0 para sair): ");
            voto = src.nextInt();

            if (voto == 0) {
                break;
            }

            if (voto >= 1 && voto <= 4) {
                switch (voto) {
                    case 1: totalC1++; break;
                    case 2: totalC2++; break;
                    case 3: totalC3++; break;
                    case 4: totalC4++; break;
                }
                totalVotos++;
            } else if (voto == 5) {
                totalNulos++;
                totalVotos++;
            } else if (voto == 6) {
                totalBrancos++;
                totalVotos++;
            } else {
                System.out.println("Opção incorreta");
            }
        }

        System.out.println("Total de votos candidato 1: " + totalC1);
        System.out.println("Total de votos candidato 2: " + totalC2);
        System.out.println("Total de votos candidato 3: " + totalC3);
        System.out.println("Total de votos candidato 4: " + totalC4);
        System.out.println("Total de votos nulos: " + totalNulos);
        System.out.println("Total de votos em branco: " + totalBrancos);

        if (totalVotos > 0) {
            double percentual = ((double)(totalNulos + totalBrancos) / totalVotos) * 100;
            System.out.printf("Percentual votos nulos e em branco: %.2f%%\n", percentual);
        } else {
            System.out.println("Nenhum voto registrado.");
        }

        src.close();
    }
}
