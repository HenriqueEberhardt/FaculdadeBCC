import java.util.Scanner;

public class Exercicio10 {
    // Descreva um programa que leia o comprimento dos catetos de um triângulo
    // retângulo e calcule o comprimento da hipotenusa.
    // Fórmula: hipotenusa^2=cateto1^2+cateto2^2
    // Entradas: cateto1, cateto2
    // processo: hipotenusa = raiz((catetoOposto * catetoOposto) + (catetoAdjacente
    // * catetoAdjacente))
    // saidas: hipotenusa
    // teste: Foi utilizados os testes citados no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Qual o comprimento dos catetos?");
        System.out.println("Cateto1: ");
        double cateto1 = src.nextDouble();
        System.out.println("Cateto2: ");
        double cateto2 = src.nextDouble();

        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

        System.out.println("A hipotenusa é:" + hipotenusa);

    }
}
