import java.util.Scanner;

public class Exercicio11 {
    // Descreva um programa que dado uma temperatura em °C informe o seu valor em
    // °F. Fórmula:
    // °F = (9/5) °C + 32
    // Entradas: C
    // processo: F = celsius + 33.8
    // saidas: F
    // teste: Foi utilizados os testes citados no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Informe o valor em °C: ");
        double C = src.nextDouble();

        double F = C + 33.8;

        System.out.println(F);
    }
}
