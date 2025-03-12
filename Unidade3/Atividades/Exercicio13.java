import java.util.Scanner;

public class Exercicio13 {
    // Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50.
    // Faça um programa para ler o comprimento e altura de uma parede (em metros), e
    // depois escrever o valor gasto com a compra de azulejos. Considere que um
    // metro quadrado é formado por 9 azulejos.
    // Entradas: altura, comprimento
    // processo: valor = (altura * comprimento) * (9 * 12.50)
    // saidas: valor
    // teste: Foi utilizados os testes citados no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Qual é a altura e o comprimento de sua parede em metros respectivamente? ");
        double altura = src.nextDouble();
        double comprimento = src.nextDouble();

        double valor = (altura * comprimento) * (9 * 12.5);

        System.out.println("O valor final é "+valor);

    }
}
