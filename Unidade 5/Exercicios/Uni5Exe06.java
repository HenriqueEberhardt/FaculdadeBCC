import java.util.Scanner;

public class Uni5Exe06 {
    // Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de
    // altura das mesmas.
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double altura = 0.0;
        double somaAltura = 0.0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe a altura da pessoa " + i);
            altura = src.nextDouble();
            somaAltura = somaAltura + altura;

        }
        double media = somaAltura / 20;
        System.out.println("A média das alturas é: " + media);

        src.close();

    }
}
