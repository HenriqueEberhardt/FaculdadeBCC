import java.util.Scanner;

public class Exercicio15 {

    // Construa um programa para ler um número inteiro (assuma até 3 dígitos) e
    // imprima a saída da seguinte forma: X centena(s) Y dezena(s) K unidade(s)
    // Entredas: numero, centena, dezena, unidade
    // Processo: centena = numero / 100
    // Processo: dezena = (numero % 10) / 10
    // Processo: unidade = numero % 10
    // Saida: centena, dezena, unidade

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int numero = src.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        System.out.println("A numero separado é " + centena + " centena(s), " + dezena + " dezena(s), " + unidade+ " unidade(s) ");
    }
}