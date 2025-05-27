import java.util.Scanner;

public class Uni5Exe07 {
    // Descreva um algoritmo que leia um número inteiro n e, dados n números reais
    // informe o maior e o menor número.
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int maiorNmr = 0, menorNmr = 0;
        int nmr = 0;

        System.out.println("Quantos números você quer informar?: ");
        int n = src.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o número: " + i);
            nmr = src.nextInt();

            if (i == 1) {
                menorNmr = nmr;
            }
            if (nmr > maiorNmr) {
                maiorNmr = nmr;
            }
            if (nmr < menorNmr) {
                menorNmr = nmr;
            }

        }
        System.out.println("Maior: "+maiorNmr);
        System.out.println("Menor: "+menorNmr);

        src.close();

    }

}
