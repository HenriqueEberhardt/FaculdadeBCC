import java.util.Scanner;

public class Exercicio18 {
    // Uma loja que trabalha com crediário funciona da seguinte maneira: se o
    // pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é
    // avisado que o pagamento está em dia. Se o pagamento é realizado até cinco
    // dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa
    // mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um
    // algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da
    // prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas
    // mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os
    // clientes nunca deixam para pagar no mês seguinte.
    // Entradas: diaPagamento, valorPrestação;
    // Processo:
    // Verificar a data do pagamento em relação ao vencimento (dia 10).
    // Aplicar as seguintes regras:
    // if Até o dia 10 desconto de 10% no valor.
    // if Entre os dias 11 e 15 valor normal.
    // if Após o dia 15 acréscimo de 2% por dia de atraso.
    // Saída: se o pagamento está em dia, sem desconto ou com
    // multa, e o valor final a ser pago.
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe o dia do Pagamento: ");
        int diaPagamento = src.nextInt();
        System.out.println("Informe o valor da prestação: ");
        double valorPrestação = src.nextDouble();
        int diasAtraso;

        if (diaPagamento >= 1 && diaPagamento <= 10) {
            valorPrestação = (valorPrestação / 100) * 90;
            System.out.println("O pagamento está em dia. O valor da prestação = R$" + valorPrestação);

        } else {
            diasAtraso = diaPagamento - 10;
            valorPrestação = valorPrestação + diasAtraso * ((valorPrestação / 100) * 2);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$"
                    + valorPrestação);
        }

        src.close();

    }
}
