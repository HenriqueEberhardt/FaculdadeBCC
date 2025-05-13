import java.util.Scanner;

public class Uni6Exe04 {
    // Faça um programa para ler os valores de dois vetores de inteiros, cada um
    // contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma
    // dos valores contidos nas posições respectivas dos vetores originais. Por
    // exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final,
    // os três vetores na tela. Faça três métodos: um método para ler valores dos
    // vetores, outro para somar e outro para escrever os vetores.

    public Uni6Exe04() {
        Scanner src = new Scanner(System.in);
        double vetor1[] = new double[10];
        double vetor2[] = new double[10];
        double vetor3[] = new double[10];

        ler(src, vetor1, vetor2);
        somar(vetor1, vetor2, vetor3);
        informar(vetor1, vetor2, vetor3);

    }

    private void ler(Scanner src, double vetor1[], double vetor2[]) {
        // Ler
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe o valor da posição " + i + 1);
            vetor1[i] = src.nextDouble();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Informe o valor da posição " + i + 1);
            vetor2[i] = src.nextDouble();
        }
    }

    private void somar(double vetor1[], double vetor2[], double vetor3[]) {
        for (int i = 0; i < 10; i++) {
            vetor3[i] = vetor2[i] + vetor1[i];
        }
    }

    private void informar(double vetor1[], double vetor2[], double vetor3[]) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i]);
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i]);
        }

    }

    public static void main(String[] args) {

    }
}
