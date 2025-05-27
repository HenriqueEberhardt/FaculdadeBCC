import java.util.Scanner;
/*
    Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

    escreva o menor valor negativo;
    escreva a média dos números positivos.
 */

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double menorNmrNeg = 0;
        double nmr = 0;
        double somaPositivos = 0;
        double contadorPositivos = 0;
        System.out.println("Informe n: ");
        int n = src.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o valor: " + i);
            nmr = src.nextDouble();

            if (nmr > 0) {
                somaPositivos = somaPositivos + nmr;
                contadorPositivos++;
            }
            if (nmr < 0) {
                if (nmr < menorNmrNeg) {
                    menorNmrNeg = nmr;
                }
            }
        }
        double mediaPositivos = somaPositivos / contadorPositivos;
        System.out.println("Menor número negativo: " + menorNmrNeg);
        System.out.println("Media da soma dos positivos: " + mediaPositivos);

        src.close();

    }
}
