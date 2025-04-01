import java.util.Scanner;

public class Exercicio13 {
    // Escreva um algoritmo que obtém do usuário, 3 valores inteiros representando
    // as
    // três cartas deste usuário em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3;
    // 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a
    // palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" (se
    // APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas
    // forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso
    // nada.
    // Dica: criar variáveis intermediárias para contar a quantidade de "boas".
    // Para resolver este problema pode se utilizar do algoritmo descrito no
    // fluxograma:
    // Entradas: carta1, carta2, carta3;
    // Processo: if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
    /*
     * qtdCartasBoas++;
     * }
     * if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
     * qtdCartasBoas++;
     * }
     * if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
     * qtdCartasBoas++;
     * }
     * if (qtdCartasBoas == 1) {
     * System.out.println("TRUCO");
     * } else if (qtdCartasBoas == 2) {
     * System.out.println("SEIS");
     * } else if (qtdCartasBoas == 3) {
     * System.out.println("NOVE");
     * 
     * }
     */
    // Saida: TRUCO/SEIS/NOVE
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe as 3 cartas: ");
        int carta1 = src.nextInt();
        int carta2 = src.nextInt();
        int carta3 = src.nextInt();
        int qtdCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoas++;
        }
        if (qtdCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (qtdCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qtdCartasBoas == 3) {
            System.out.println("NOVE");
        }

        src.close();
    }
}
