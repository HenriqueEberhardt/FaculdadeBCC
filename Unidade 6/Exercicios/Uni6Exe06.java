import java.util.Scanner;

public class Uni6Exe06 {
    // Faça um programa que leia um valor N inteiro. Com base neste valor, crie um
    // vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade
    // N de valores reais para popular o vetor. Após ter preenchido o vetor,
    // solicite que o usuário informe um outro valor real. Informe para o usuário se
    // este valor informado se encontra cadastrado no vetor. Faça um método para ler
    // o vetor, e outro que retorne verdadeiro ou falso, para encontrar o valor.
    public static void main(String[] args) {
        Uni6Exe06 uni = new Uni6Exe06();
        Scanner src = new Scanner(System.in);
        double valor = 0;
        boolean retorno = true;

        System.out.println("Informe o valor n: ");
        int n = src.nextInt();
        double vetor[] = new double[n];

        uni.ler(src, vetor, valor);
        System.out.println("Informe outro valor: ");
        valor = src.nextDouble();

        retorno = uni.retornar(vetor, valor);

        if (retorno = false) {
            System.out.println("O valor ja se encontra neste vetor.");
        } else {
            System.out.println("O valor não se encontra nos vetor.");
        }
        
        src.close();
    }

    public void ler(Scanner src, double vetor[], double valor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor da " + i + 1 + "º posição");
            vetor[i] = src.nextDouble();
        }
    }

    public boolean retornar(double vetor[], double valor) {
        boolean retorno = true;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                retorno = false;
            } else {
                retorno = true;
            }
        }
        return retorno;
    }
}
