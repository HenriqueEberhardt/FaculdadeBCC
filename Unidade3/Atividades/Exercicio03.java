import java.util.Scanner;

public class Exercicio03 {
    // Um motorista deseja abastecer seu tanque de combustível.
    // Escreva um programa para ler o preço do litro da gasolina e o valor do
    // pagamento e exibir quantos litros ele conseguiu colocar no tanque.
    // Entradas: precoGasolina, valorPagamento, qtdCombustivel
    // processo: qtdCombustivel = valorPagamento / precoGasolina
    // saidas: qtdCombustivel
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double precoGasolina, valorPagamento;

        System.out.println("Qual é o preoço da gasolina?");
        precoGasolina = src.nextDouble();
        System.out.println("Qual o valor de pagamento?");
        valorPagamento = src.nextDouble();

        double qtdCombustivel = valorPagamento / precoGasolina;

        System.out.println("O motorista conseguiu colocar:"+qtdCombustivel);

    }
}
