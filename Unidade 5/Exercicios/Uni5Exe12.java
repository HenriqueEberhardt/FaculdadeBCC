import java.util.Scanner;

public class Uni5Exe12 {
    // Escreva um programa que leia um número inteiro positivo n e em seguida
    // imprima n linhas do chamado Triangulo de Floyd:
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe um número n: ");
        int n = src.nextInt();
        int numero = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }

        src.close();
    }
}
