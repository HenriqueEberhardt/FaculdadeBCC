import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        /*
         * Análise do problema =Todas as informações/variáveis serão utilizadas
         * Entradas = horaChegada,minChegada,horaSaida,minSaida
         * Saída =
         * - O resultado da operação solicitada ou uma mensagem de erro.
         * Processos:
         * 1. Cálculo do tempo total de estacionamento em horas e minutos.
         * 2. Considera-se a diferença entre os horários de chegada e saída.
         * 3. O cálculo de minutos é ajustado se o minuto de saída for menor que o
         * minuto de chegada.
         */
        Scanner src = new Scanner(System.in);
        double horaTotal = 0;
        double minutoTotal = 0;
        float precoCobrado = 5;

        System.out.print("Informe a hora chegada: ");
        double horaChegada = src.nextDouble();
        System.out.print("Informe o minuto chegado: ");
        double minChegada = src.nextDouble();
        System.out.print("Informe a hora de saída: ");
        double horaSaida = src.nextDouble();
        System.out.print("Informe o minuto de saída: ");
        double minSaida = src.nextDouble();

        if ((horaChegada < horaSaida) || (horaChegada == horaSaida)) {
            horaTotal = (horaSaida - horaChegada);
        } else {
            horaTotal = (horaChegada - horaSaida);
        }
        if (minSaida < minChegada) {
            minutoTotal = (60 + minSaida - (minChegada));
            horaTotal--;
        } else {
            minutoTotal = (minSaida - minChegada);
        }

        if ((horaTotal == 0) || ((horaTotal == 1) && (minutoTotal < 30))) {
            System.out.printf("O motorista ficou estacionado por " + horaTotal + " hora(s) e " + minutoTotal
                    + " minuto(s). Preço cobrado: R$ %.2f.", precoCobrado);
        } else if ((horaTotal == 1) || ((horaTotal == 2) && (minutoTotal < 30))) {
            System.out.printf("O motorista ficou estacionado por " + horaTotal + " hora(s) e " + minutoTotal
                    + " minuto(s). Preço cobrado: R$ %.2f.", precoCobrado * 2);
        } else if ((horaTotal == 2) || ((horaTotal == 3) && (minutoTotal < 30))) {
            System.out.printf("O motorista ficou estacionado por " + horaTotal + " hora(s) e " + minutoTotal
                    + " minuto(s). Preço cobrado: R$ %.2f.", precoCobrado * 2 + 7.5f);
        } else if ((horaTotal == 3) || ((horaTotal == 4) && (minutoTotal < 30))) {
            System.out.printf("O motorista ficou estacionado por " + horaTotal + " hora(s) e " + minutoTotal
                    + " minuto(s). Preço cobrado: R$ %.2f.", precoCobrado * 2 + 7.5f * 2);
        } else if ((horaTotal == 4) || ((horaTotal == 5) && (minutoTotal < 30))) {
            System.out.printf("O motorista ficou estacionado por " + horaTotal + " hora(s) e " + minutoTotal
                    + " minuto(s). Preço cobrado: R$ %.2f.", precoCobrado * 2 + 7.5f * 2 + 10);
        } else {
            System.out.printf(
                    "O motorista ficou estacionado por " + horaTotal + " hora(s) e " + minutoTotal
                            + " minuto(s). Preço cobrado: R$ %.2f.",
                    precoCobrado * 2 + 7.5f * 2 + 10 + ((horaTotal - 5) * 10));
        }

        src.close();
    }
}