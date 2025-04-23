import java.util.Scanner;

//Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
public class Uni5Exe03 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double soma = 0.0;

        for (int i = 1; i <= 100; i++) {
            soma = soma + 1.0 / i;

        }

        System.out.println(soma);
        src.close();
    }
}
