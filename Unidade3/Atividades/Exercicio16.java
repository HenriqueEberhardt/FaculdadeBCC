import java.util.Scanner;

public class Exercicio16 {

    // Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
    // Considerando que alguém está pagando uma compra, faça um programa que
    // determine e escreva o número mínimo de notas que o caixa deve fornecer como
    // troco. Escreva também o número de cada tipo de nota a ser fornecido como
    // troco. Suponha que o sistema monetário não utilize centavos.
    // Entredas: numero, centena, dezena, unidade
    // Processo: centena = numero / 100
    // Processo: dezena = (numero % 10) / 10
    // Processo: unidade = numero % 10
    // Saida: centena, dezena, unidade
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Qual o valor da compra: ");
        int valorCompra = src.nextInt();
        System.out.println("informe o valor dado em dinheiro: ");
        int valorNotas = src.nextInt();

        int valorTroco = valorNotas - valorCompra;

        int centena = valorTroco / 100; 
        int dezena = (valorTroco % 100) / 10;
        int unidade = valorTroco % 10;

        int qntNotas = centena + dezena + unidade;

        System.out.println("O número mínimo de notas de troco é:"+ qntNotas);
        
    }
}
