import java.util.Scanner;

public class Uni5Exe02 {
    //Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPar = somaPar + i;
            } else {
                somaImpar = somaImpar + i;
            }
        }
        System.out.println("Soma dos pares: "+somaPar);
        System.out.println("Soma dos impares: "+somaImpar);
        src.close();
    }
}
