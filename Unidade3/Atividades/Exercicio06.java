import java.util.Scanner;

public class Exercicio06 {
    //Um restaurante cobra R$ 25,00 por cada quilo de refeição.
    // Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
    //Entradas: peso
    //processo: valor = (peso - 0,75) * 25
    //saidas: valor

    public static void main(String[] args) {
        Scanner src = new Scanner (System.in);
        double peso, valor;

        System.out.println("Insira o peso do seu prato em QUILOS: ");
        peso = src.nextDouble();
        valor = (peso - 0.75) * 25;

        System.out.println(valor);
        
    }
}
