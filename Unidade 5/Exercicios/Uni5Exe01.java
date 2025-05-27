import java.util.Scanner;
//Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int nmr = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe um número: ");
            nmr = src.nextInt();

            if (nmr % 2 == 0) {
                System.out.println("Número é par");
            } else {
                System.out.println("Número é ímpar");
            }

        }
        src.close();
    }
}
