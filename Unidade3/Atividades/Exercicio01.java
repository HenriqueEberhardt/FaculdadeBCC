import java.util.Scanner;

public class Exercicio01 {
    // Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler
    // as dimensões de um terreno e depois exibir a área do terreno.
    // Entradas: valor1, valor2
    // processo: resultado = valor1 * valor2
    // saidas: resultado
    // teste: Foi utilizados os testes citados no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int valor1, valor2;
        System.out.println("Me de as medidas do terreno..:");
        valor1 = src.nextInt();
        valor2 = src.nextInt();

        int area = valor1 * valor2;

        System.out.println(area);

    }
}
