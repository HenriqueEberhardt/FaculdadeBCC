import java.util.Scanner;

public class Uni6Exe08 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Uni6Exe08 uni = new Uni6Exe08();

        System.out.print("Informe o valor n (máximo 20): ");
        int n = src.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("Valor inválido. O número deve estar entre 1 e 20.");
            return;
        }

        double vetor[] = new double[n];
        uni.ler(vetor, src);

        double[] valores = new double[n];
        int[] frequencia = new int[n];
        int diferentes = uni.verificacao(vetor, valores, frequencia);

        uni.informarValores(valores, frequencia, diferentes);

        src.close();
    }

    public void ler(double[] vetor, Scanner src) {
        System.out.println("Informe os valores para o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i + 1) + "º valor: ");
            vetor[i] = src.nextDouble();
        }
    }

    public int verificacao(double[] vetor, double[] valores, int[] frequencia) {
        int diferentes = 0;
        for (int i = 0; i < vetor.length; i++) {
            boolean jaExiste = false;

            for (int j = 0; j < diferentes; j++) {
                if (vetor[i] == valores[j]) {
                    frequencia[j]++;
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                valores[diferentes] = vetor[i];
                frequencia[diferentes] = 1;
                diferentes++;
            }
        }
        return diferentes;
    }

    public void informarValores(double[] valores, int[] frequencia, int diferentes) {
        System.out.println("\nValor\tFrequência");
        for (int i = 0; i < diferentes; i++) {
            System.out.printf("%.2f\t%d\n", valores[i], frequencia[i]);
        }
    }
}
