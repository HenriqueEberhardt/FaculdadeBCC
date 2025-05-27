import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {
    /*
     * Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
     * neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário
     * para digitar um número inteiro várias vezes, até preencher o vetor. Esse
     * número deverá ser armazenado no vetor caso ainda não exista, e se o valor já
     * existir deve ser pedido um novo valor. Isto é, se o usuário informar o número
     * 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser
     * adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo
     * deve ser ordenado. Para isso reordene os elementos internos do vetor de modo
     * que este fique em ordem crescente, conforme no exemplo:
     * 
     * Vetor origem: [0][4][2][6][3]
     * Vetor ordenado: [0][2][3][4][6]
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Uni6Exe07 uni = new Uni6Exe07();
        System.out.println("Informe o valor n, que seja menor que 20");
        int n = src.nextInt();
        int vetor[] = new int[n];
        int vetorOrigem[] = new int[vetor.length];
        boolean acabar = true;

        while (n <= 20 && acabar == true) {

            uni.ler(n, src, vetorOrigem);
            uni.ordenar(vetor, vetorOrigem);
            uni.informarValores(vetor, vetorOrigem);

            acabar = false;
        }
        
        src.close();
    }

    public void ler(int n, Scanner src, int vetor[]) {
        System.out.println("Agora dê valores: ");
        for (int i = 0; i < n; i++) {
            boolean bu = false;
            int valor = 0;
            System.out.println((i + 1) + "º posição");
            valor = src.nextInt();
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == valor) {
                    System.out.println("Este valor já existe, informe outro: ");
                    i--;
                    bu = true;
                }
            }
            if (!bu) {
                vetor[i] = valor;

            }

        }
    }

    public void ordenar(int vetor[], int vetorOrigem[]) {
        for (int i = 0; i < vetor.length; i++) {
            vetorOrigem[i] = vetor[i];
        }
        Arrays.sort(vetor);

    }

    public void informarValores(int vetor[], int vetorOrigem[]) {
        System.out.println("Vetor origem: ");
        for (int i = 0; i < vetorOrigem.length; i++) {
            System.out.print(vetorOrigem[i] + " - ");
        }
        System.out.println("Vetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " - ");
        }

    }
}
