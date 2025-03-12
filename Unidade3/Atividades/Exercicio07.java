import java.util.Scanner;

public class Exercicio07 {
    //Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
    // Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.
    //Entradas: qtd350, qtd600, qtd2
    //processo: total = qtd2 * 2 + qtd350 * 0,350 + qtd600 * 0,6
    //saidas: total
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double qtd2, qtd350, qtd600, total;

        System.out.println("Quantas latas de 350ml você comprou? ");
        qtd350 = src.nextDouble();
        System.out.println("Quantas garrafas de 600ml você comprou? ");
        qtd600 = src.nextDouble();
        System.out.println("Quantas garrafas de 2l você comprou? ");
        qtd2 = src.nextDouble();

        total = (qtd2 * 2) + (qtd350 * 0.350) + (qtd600 * 0.6);

        System.out.println("O cliente comprou ao total: "+total);
        
    }
}
