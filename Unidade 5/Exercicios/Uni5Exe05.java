import java.util.Scanner;

// Descreve os n primeiros termos da sequência: 8, 10, 16, 18, 32, 34, 64...
public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos para a sequência (maior que 2): ");
        int qtd = src.nextInt();
        int n = 8;

        if (qtd > 2) {
            for (int i = 0; i < qtd; i++) {
                System.out.println(n); // Imprime o termo base
                i++; // Avança para o próximo termo
                if (i < qtd) {
                    System.out.println(n + 2); // Imprime o termo somado com 2
                }
                n *= 2; // Próximo termo base
            }
        } else {
            System.out.println("Erro: informe um valor maior que 2.");
        }
        src.close();
    }
}
