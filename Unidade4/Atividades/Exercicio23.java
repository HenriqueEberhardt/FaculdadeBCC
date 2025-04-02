import java.util.Scanner;

public class Exercicio23 {
    // Escreva um algoritmo que leia um número inteiro positivo representando um
    // determinado mês do ano e escreva o mês por extenso. Para valores maiores do
    // que 12 informe que o valor não é válido.
    // Para resolver este problema pode se utilizar do algoritmo descrito no
    // fluxograma:

    // Entradas: mes;
    // Processo: que qual o número do mês e escrever o noma por extenso de acordo com a ordem
    // Saída: nomeMes;
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Entre com o número do mês: ");
        int mes = src.nextInt();

        String nomeMes;
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                nomeMes = "Valor inválido";
                break;
        }

        System.out.println(nomeMes);

        src.close();
    }
}
