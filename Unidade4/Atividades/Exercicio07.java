import java.util.Scanner;

public class Exercicio07 {
    // O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com
    // peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em
    // que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em
    // gramas, determine o custo do selo.
    // Entradas: peso
    // Processo: if peso <= 50 = valorPagar = 0.45; else = pesoExcedido = peso - 50;
    // qtAdicional = (pesoExcedido / 20) + 1; valorPagar = 0.45 + 0.45 *
    // qtAdicional;
    // Saida: valorPagar
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double valorPagar = 0;
        double pesoExcedido = 0;
        double qtAdicional = 0;

        System.out.println("Entre com o peso da carta: ");
        int peso = src.nextInt();

        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            pesoExcedido = peso - 50;
            qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45 + 0.45 * qtAdicional;
        }

        System.out.println("Custo do selo: " + valorPagar);
        src.close();

    }
}
