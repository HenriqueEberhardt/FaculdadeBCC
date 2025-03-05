import java.util.Scanner;

public class Exercicio18 {

    /**
    * Este programa calcula o valor gasto com a compra de azulejos para cobrir uma parede.
    * Cada metro quadrado é formado por 9 azulejos e cada azulejo custa R$ 12,50.
    *
    * Entradas:
    * - Comprimento da parede (em metros)
    * - Altura da parede (em metros)
    *
    * Saídas:
    * - Valor total gasto na compra dos azulejos
    *
    * Processo:
    * 1. Solicitar ao usuário o comprimento e a altura da parede.
    * 2. Calcular a área total da parede em metros quadrados.
    * 3. Determinar a quantidade total de azulejos necessária (9 azulejos por metro quadrado).
    * 4. Calcular o valor total gasto multiplicando a quantidade de azulejos pelo preço unitário.
    * 5. Exibir o valor total ao usuário.
    *
    * Testes de Exemplo:
    * Comprimento | Altura | Área (m²) | Qnt. Azulejos | Valor Gasto (R$)
    * ------------|--------|-----------|---------------|-----------------
    * 2.0         | 3.0    | 6.0       | 54            | 675.00
    * 4.0         | 2.5    | 10.0      | 90            | 1125.00
    */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float azulejo = 12.50f;
        float comprimento = 0;
        float altura = 0;

        System.out.println("Informe o comprimento da parede em metros: ");
        comprimento = leitor.nextFloat();
        System.out.println("Informe a altura da parede em metros: ");
        altura = leitor.nextFloat();

        float metrosQuadrados = comprimento * altura;
        float qntAzulejos = metrosQuadrados * 9;
        float valorGasto = qntAzulejos * azulejo;

        System.out.printf("O valor gasto com a compra de azulejos é: R$ %.2f%n", valorGasto);

        leitor.close();
    }
}
