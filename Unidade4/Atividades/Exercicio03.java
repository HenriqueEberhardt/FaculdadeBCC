import java.util.Scanner;

public class Exercicio03 {
    // Dados dois números inteiros descreva um algoritmo para informar o maior valor
    // entre eles.
    // Entradas: valor1, valor2
    // Processo: if valor1>valor2 escreva valor1; else escreva valor2;
    // Saida: valor1, valor2
    // Teste: Usado testes ditos no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int valor1 = src.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valor2 = src.nextInt();

        if (valor1 > valor2) {
            System.out.println("O valor " + valor1 + " é maior do que o valor " + valor2);
        }else{
            System.out.println("O valor " + valor2 + " é maior do que o valor " + valor1);
        }

        src.close();
    }
}
