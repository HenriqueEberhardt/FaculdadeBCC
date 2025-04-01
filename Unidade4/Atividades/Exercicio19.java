import java.util.Scanner;

public class Exercicio19 {
    // Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual
    // quadrante ele está localizado
    // 0, se os dois valores forem zero
    // 1, se os dois valores forem positivos
    // 2, se o x for negativo e o y, positivo 3, se os dois valores forem negativos
    // 4, se o x for positivo e o y, negativo Para resolver este problema pode se
    // utilizar do algoritmo descrito no fluxograma:

    // Entradas: Coordenadas X e Y (números inteiros).
    // Processo:
    // 1. Verificar se X e Y são iguais a 0 resposta: 0.
    // 2. Se X > 0 e Y > 0 resposta: 1.
    // 3. Se X < 0 e Y > 0 resposta: 2.
    // 4. Se X < 0 e Y < 0 resposta: 3.
    // 5. Se X > 0 e Y < 0 resposta: 4.
    // Saída: Exibir o quadrante.
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Me informe as coordenadas X e Y: ");
        int x = src.nextInt();
        int y = src.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y  > 0) {
            System.out.println("Quadrante 1");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 4");
        }

        src.close();

    }
}
