import java.util.Scanner;

public class Exercicio02 {
    // Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
    // Para resolver este problema pode se utilizar do algoritmo descrito no
    // fluxograma:
    // Entradas: valor
    // Processo: valor % 2 == 0
    // Saida: O número é par/impar
    // Teste: Usado testes ditos no enunciado

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro maior do que 0: ");
        int valor = src.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("É ímpar");
        }

        src.close();

    }
}
