import java.util.Scanner;

public class Exercicio09 {
    // Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
    // volume = PI * Raio^2 * altura
    // Quantas casas decimais devo usar para o número Pi?
    // Entradas: altura, raio
    // processo: PI * (raio * raio) * altura
    // saidas: volume
    // teste: Foi utilizados os testes citados no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Qual é a altura e o raio do latão de óleo respectivamente?");
        double altura = src.nextDouble();
        double raio = src.nextDouble();

        double volume = pi * (raio * raio) * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

    }
}
