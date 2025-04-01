import java.util.Scanner;

public class Exercicio12 {
    // Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos
    // lados de um triângulo, descreva um algoritmo que verifique se os mesmos podem
    // ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique
    // e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo
    // escaleno". Em caso negativo, informe que os mesmos não formam um triângulo.
    // Considere que:
    // Entradas: lado1, lado2, lado3;
    // Processo: if lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 <
    // (lado1 + lado2)
    // else if lado1 == lado2 || lado2 == lado3 || lado1 == lado3
    // Saida: É equilátero/É isóceles/É escaleno/Não formam um triângulo
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Entre com o comprimento do lado 1");
        int lado1 = src.nextInt();
        System.out.println("Entre com o comprimento do lado 2");
        int lado2 = src.nextInt();
        System.out.println("Entre com o comprimento do lado 3");
        int lado3 = src.nextInt();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É isóceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo");
        }

        src.close();
    }
}
