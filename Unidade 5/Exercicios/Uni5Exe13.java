import java.util.Scanner;

public class Uni5Exe13 {

    /*
     * Um motorista registra odômetro e combustível em várias paradas de uma viagem.
     * 
     * Entrada:
     *  - Número total de reabastecimentos (n).
     *  - Para cada reabastecimento:
     *      * Valor do odômetro no momento do reabastecimento.
     *      * Quantidade de combustível comprado (litros).
     * Processo:
     *  - Calcular quilometragem rodada entre paradas (diferença dos odômetros).
     *  - Calcular quilometragem por litro em cada parada (km/l).
     *  - Calcular média total da quilometragem por litro na viagem.
     * Saída:
     *  - Quilometragem por litro em cada parada.
     *  - Quilometragem média total da viagem.
     */
    
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Informe o número total de reabastecimentos: ");
        int n = src.nextInt();

        double[] odometro = new double[n + 1]; // armazenar odômetro do início + n paradas
        double[] combustivel = new double[n];  // combustível comprado em cada parada

        System.out.print("Informe o odômetro no início da viagem: ");
        odometro[0] = src.nextDouble();

        // Entrada dos dados para cada reabastecimento
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o odômetro na parada %d: ", i + 1);
            odometro[i + 1] = src.nextDouble();

            System.out.printf("Informe a quantidade de combustível (litros) comprado na parada %d: ", i + 1);
            combustivel[i] = src.nextDouble();
        }

        double somaKm = 0;
        double somaLitros = 0;

        System.out.println("Quilometragem por litro em cada parada:");

        for (int i = 0; i < n; i++) {
            double kmRodados = odometro[i + 1] - odometro[i];
            double kmPorLitro = kmRodados / combustivel[i];
            System.out.printf("Parada %d: %.2f km/l", i + 1, kmPorLitro);

            somaKm += kmRodados;
            somaLitros += combustivel[i];
        }

        double mediaTotal = somaKm / somaLitros;
        System.out.printf("Quilometragem média total da viagem: %.2f km/l", mediaTotal);

        src.close();
    }
}
