import java.util.Scanner;

public class Exercicio04 {
    // Dado um número de ponto flutuante maior do que 0, informe se foram digitadas
    // ou não casas decimais no número.
    // Entradas: valor
    // Processo:
    // Saida:
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe o valor com ou sem casas decimais: ");
        float valor = src.nextFloat();

        if (valor % 1 == 0) {
            System.out.println("Casas decimais não foram digitadas");
        } else {
            System.out.println("Casas decimais foram digitadas.");
        }

        src.close();

    }
}
