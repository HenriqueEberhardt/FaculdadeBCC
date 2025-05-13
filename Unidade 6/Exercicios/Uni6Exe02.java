import java.util.Scanner;

public class Uni6Exe02 {

    // Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
    // 12 posições do tipo real. Imprima quais valores desses informados são maiores
    // que a média dos valores. Faça um método para ler os valores, outro para
    // calcular a média e outro para informar os valores maiores que a média.
    public Uni6Exe02() {
        Scanner src = new Scanner(System.in);
        double vetor[] = new double[12];
        double soma = 0;
        double media = 0;

        ler(src, vetor);
        media = media(vetor, soma);
        informar(vetor, media);

    }

    private void ler(Scanner src, double vetor[]) {
        // Ler
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor da posição " + i + 1);
            vetor[i] = src.nextDouble();
        }
    }

    private double media(double vetor[], double soma) {
        // calculo media
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        media = soma / vetor.length;
        return media;
    }

    private void informar(double vetor[], double media) {
        // Informando valores
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
