import java.util.Scanner;

public class Uni5Exe14 {
    /*
     * Entrada:
     *  - Para cada uma das 20 mercadorias: nome, preço de compra (PC) e preço de venda (PV).
     * 
     * Processo:
     *  - Calcular o percentual de lucro de cada mercadoria: ((PV - PC) / PC) * 100.
     *  - Contabilizar quantas mercadorias têm lucro < 10%, entre 10% e 20% (inclusive) e > 20%.
     *  - Calcular o valor total de compra, total de venda e o lucro total.
     * 
     * Saída:
     *  - Quantidade de mercadorias em cada faixa de lucro.
     *  - Valor total de compra, valor total de venda e lucro total.
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;

        double totalCompra = 0;
        double totalVenda = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Mercadoria %d - Informe o nome: ", i);
            String nome = src.next();

            System.out.print("Informe o preço de compra: ");
            double precoCompra = src.nextDouble();

            System.out.print("Informe o preço de venda: ");
            double precoVenda = src.nextDouble();

            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }

            totalCompra += precoCompra;
            totalVenda += precoVenda;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("\nResultado do levantamento:");
        System.out.println("Mercadorias com lucro menor que 10%: " + lucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Mercadorias com lucro maior que 20%: " + lucroMaior20);

        System.out.printf("Valor total de compra: R$ %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: R$ %.2f\n", totalVenda);
        System.out.printf("Lucro total: R$ %.2f\n", lucroTotal);

        src.close();
    }
}
