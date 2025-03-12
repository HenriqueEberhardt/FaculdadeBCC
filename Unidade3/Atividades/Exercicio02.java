import java.util.Scanner;

public class Exercicio02 {
    // Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um
    // programa para calcular e exibir o valor de desconto a ser dado num par de
    // sapatos e quanto deve custar o produto com o desconto. O preço do par de
    // sapatos deve ser informado pelo usuário. Como resultado, o programa deverá
    // exibir as seguintes mensagens:

    // O valor do desconto é de R$ xxx
    // O preço do par de sapatos com desconto é R$ xxx

    // Entradas: precoSapatos, precoSapatosDesconto, precoDesconto
    // processo: precoSapatoDesconto = precoSapatos * 0,88, precoDesconto = precoSapato - precoSapatoDesconto
    // saidas: precoDesconto, 
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double precoDesconto, precoSapato, precoSapatoDesconto;

        System.out.println("Qual é o preço dos sapatos? ");
        precoSapato = src.nextDouble();

        precoSapatoDesconto = precoSapato * 0.88;
        precoDesconto = precoSapato - precoSapatoDesconto;

        System.out.println("O valor do desconto é de R$"+precoDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$"+precoSapatoDesconto);

    }
}
