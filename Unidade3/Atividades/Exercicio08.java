import java.util.Scanner;

public class Exercicio08 {
    // Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela
    // entregou um valor em dólares para o atendente.
    // Considerando que o atendente tem a cotação do dólar, descreva um programa
    // para calcular quantos reais o atendente deve devolver para a pessoa.
    // Entradas: valorDol
    // processo: valorReal = valorDol * 5.65
    // saidas: valorReal
    // teste: 
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double valorDol, valorReal;
        System.out.println("Quantos Dólares deseja trocar?");
        valorDol = src.nextDouble();

        valorReal = valorDol * 5.65;

        System.out.println("O atendente deve devolver "+valorReal+" para o cliente.");

    }
}
