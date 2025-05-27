import java.util.Scanner;

public class Uni6Exe01 {
    //Enunciado:
    // Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor
    // de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos.
    // Faça um método para ler e outro para escrever.


    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor da posição " + (i + 1) + ":");
            vetor[i] = src.nextInt();
        }

        for (int i = 10; i > vetor.length; i--) {
            System.out.println((i) + "º :" + vetor[i]);
        }

        src.close();
    }
}
