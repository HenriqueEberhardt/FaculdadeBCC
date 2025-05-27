import java.util.Scanner;

public class Uni5Exe34 {
    /*
     * Entrada:
     *  - Opção do recepcionista (1, 2 ou 3)
     *  - Se opção 1: nome do hóspede e número de diárias
     * Processo:
     *  - Se opção 1: calcular total a pagar conforme regra de taxa de serviço e diária
     *  - Contabilizar número de contas encerradas
     *  - Se opção 2: mostrar número de contas encerradas
     *  - Se opção 3: encerrar programa
     * Saída:
     *  - Opção 1: nome do hóspede e total a pagar
     *  - Opção 2: número de contas encerradas
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int opcao;
        int contasEncerradas = 0;
        final double VALOR_DIARIA = 50.0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Encerrar conta de hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = src.nextInt();
            src.nextLine(); // Consumir o Enter pendente

            switch (opcao) {
                case 1:
                    System.out.print("Nome do hóspede: ");
                    String nome = src.nextLine();

                    System.out.print("Número de diárias: ");
                    int diarias = src.nextInt();

                    double taxaServico;
                    if (diarias < 15) {
                        taxaServico = 7.5;
                    } else if (diarias == 15) {
                        taxaServico = 6.5;
                    } else {
                        taxaServico = 5.0;
                    }

                    double total = (VALOR_DIARIA + taxaServico) * diarias;

                    System.out.printf("Hóspede: %s\nTotal a pagar: R$ %.2f\n", nome, total);
                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        src.close();
    }
}
