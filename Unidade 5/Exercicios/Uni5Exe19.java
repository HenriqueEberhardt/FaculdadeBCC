import java.util.Scanner;

public class Uni5Exe19 {
    /*
     * Entrada:
     *  - Valor da compra (0 para finalizar)
     * Processo:
     *  - Aplicar desconto de 20% se valor > 500, senão desconto de 15%
     *  - Somar o valor pago ao total recebido
     * Saída:
     *  - Valor a pagar para cada compra
     *  - Valor total recebido ao final
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double valorCompra;
        double valorPagar;
        double totalRecebido = 0;

        while (true) {
            System.out.print("Valor da compra: ");
            valorCompra = src.nextDouble();

            if (valorCompra == 0) {
                break;
            }

            if (valorCompra > 500) {
                valorPagar = valorCompra * 0.80; // 20% de desconto
            } else {
                valorPagar = valorCompra * 0.85; // 15% de desconto
            }

            totalRecebido += valorPagar;

            System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
        }

        System.out.printf("O valor total recebido foi de R$%.2f%n", totalRecebido);

        src.close();
    }
}
