import java.util.Scanner;

public class Uni6Exe03 {
    // Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
    // 12 posições do tipo real. Em seguida, modifique o vetor de modo que os
    // valores das posições ímpares sejam aumentados em 5% e os das posições pares
    // sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler
    // os valores, outro para ajustar os valores dentro do vetor e outro para
    // escrever os valores atualizados do vetor.

    public Uni6Exe03() {
        Scanner src = new Scanner(System.in);
        double vetor[] = new double[12];

        ler(src, vetor);
        ajustar(vetor);
        informar(vetor);

    }

    private void ler(Scanner src, double vetor[]) {
        // Ler
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor da posição " + i + 1);
            vetor[i] = src.nextDouble();
        }
    }

    private void ajustar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = vetor[i] * 1.02;
            } else {
                vetor[i] = vetor[i] * 1.05;
            }
        }
    }

    private void informar(double vetor[]) {
        // Informando valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);

        }
    }

    public static void main(String[] args) {
    }
}
