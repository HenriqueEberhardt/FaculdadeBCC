import java.util.Scanner;

public class Exercicio14 {
    // Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está
    // entre 1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias
    // em anos bissextos, e 28 dias em anos não bissextos.
    // Para resolver este problema pode se utilizar do algoritmo descrito no
    // fluxograma:
    // Entradas: dia, mes, ano
    // Processo:
    //  Verificar se o mês está no intervalo de 1 a 12 e o ano é válido (> 0).
    //  Validar a quantidade de dias do mês:
    //      Meses com 31 dias: 1, 3, 5, 7, 8, 10, 12.
    //      Meses com 30 dias: 4, 6, 9, 11.
    //  Fevereiro:
    //      28 dias em anos não bissextos.
    //      29 dias em anos bissextos (ano divisível por 4, mas não por 100, a menos
    // que também seja divisível por 400).
    // Saída: "Valida" ou "Não valida".
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = src.nextInt();
        System.out.println("Digite o mês: ");
        int mes = src.nextInt();
        System.out.println("Digite o ano: ");
        int ano = src.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Valida");
            } else if (mes != 2 && dia < 31) {
                System.out.println("Valida");
            } else if (mes == 2 && dia < 29) {
                System.out.println("Valida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("Valida");
            } else {
                System.out.println("Não valida");
            }

        } else {
            System.out.println("Não valida");
        }

        src.close();

    }
}
