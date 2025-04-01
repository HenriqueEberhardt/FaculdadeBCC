import java.util.Scanner;

public class Exercicio15 {
    // Elabore um algoritmo para exibir o valor de reajuste que um funcionário
    // receberá no seu salário. A empresa irá conceder 5% de reajuste para o
    // funcionário que for admitido há até de 12 meses. Para funcionário admitido
    // entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve
    // solicitar ao usuário que digite a quantidade de meses que o funcionário foi
    // admitido.
    // Entradas: meses
    // Processo: 
    // Ler a quantidade de meses desde a admissão.
    // Verificar a faixa de tempo:
    //    if até 12 meses, reajuste de 5%.
    //    if entre 13 e 48 meses, reajuste de 7%.
    //    else não há reajuste informado.
    // Saída: Reajuste
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe a quantos meses você está admitido: ");
        int meses = src.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }

        src.close();

    }
}
