import java.util.Scanner;

public class Exercicio17 {
    // Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda
    // anual e o número de dependentes do contribuinte. A renda líquida é calculada
    // sobre a renda anual com um desconto de 2% para cada dependente do
    // contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não
    // paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$
    // 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas
    // líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$
    // 10.000,00 pagam 15% de imposto.
    // Entradas: rendaAnual, dependentes
    // Processo:
    // Aplicar desconto de 2% para cada dependente sobre a renda anual.
    // Determinar o imposto de acordo com a renda líquida:
    // if Até 2.000,00 → isento
    // if De 2.000,01 até 5.000,00 5% de imposto
    // if De 5.000,01 até 10.000,00 10% de imposto
    // if Acima de 10.000,00 15% de imposto
    // Saída: valorImposto;
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Qual é a renda anual do contribuinte? ");
        double rendaAnual = src.nextDouble();
        System.out.println("Quantos dependetes o contribuinte tem?");
        double dependentes = src.nextInt();

        double rendaLiquida = rendaAnual - (dependentes * ((rendaAnual / 100) * 2));
        double valorImposto;
        int porcentagem;

        if (rendaLiquida < 2000) {
            valorImposto = 0;
            porcentagem = 0;

        } else if (rendaLiquida > 2001 && rendaLiquida < 5000) {
            valorImposto = (rendaLiquida / 100) * 5;
            porcentagem = 5;

        } else if (rendaLiquida > 5001 && rendaLiquida < 10000) {
            valorImposto = (rendaLiquida / 100) * 10;
            porcentagem = 10;

        } else {
            valorImposto = (rendaLiquida / 100) * 15;
            porcentagem = 15;

        }

        System.out.println("O imposto é de "+porcentagem+": R$"+valorImposto);

        src.close();

    }
}
