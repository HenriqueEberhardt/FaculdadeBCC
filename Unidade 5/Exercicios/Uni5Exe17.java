import java.util.Scanner;

public class Uni5Exe16 {
    /*
     * Entrada:
     *  - Altura da pessoa (double), leitura finaliza quando altura for 0
     *  - Gênero da pessoa (char): 'M'/'m' para masculino, 'F'/'f' para feminino, 'O'/'o' para outro
     * 
     * Processo:
     *  - Ler altura e gênero de cada pessoa enquanto altura != 0
     *  - Calcular a média de altura das mulheres
     *  - Calcular a média de altura do grupo inteiro
     * 
     * Saída:
     *  - Média da altura das mulheres
     *  - Média da altura do grupo
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double altura;
        char genero;
        double somaAlturaMulheres = 0.0;
        int contMulheres = 0;
        double somaAlturaGrupo = 0.0;
        int contGrupo = 0;

        while (true) {
            System.out.print("Informe a altura (0 para encerrar): ");
            altura = src.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Informe o gênero (M/m, F/f, O/o): ");
            genero = src.next().charAt(0);

            somaAlturaGrupo += altura;
            contGrupo++;

            if (genero == 'F' || genero == 'f') {
                somaAlturaMulheres += altura;
                contMulheres++;
            }
        }

        if (contMulheres > 0) {
            System.out.printf("A média da altura das mulheres é: %.2f%n", somaAlturaMulheres / contMulheres);
        } else {
            System.out.println("Não foram informadas mulheres.");
        }

        if (contGrupo > 0) {
            System.out.printf("A média de altura do grupo é: %.2f%n", somaAlturaGrupo / contGrupo);
        } else {
            System.out.println("Nenhuma altura válida foi informada.");
        }

        src.close();
    }
}
