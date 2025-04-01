import java.util.Scanner;

public class Exercicio11 {
    // Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma
    // mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere
    // que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
    // dos demais, e apenas irmãos se todas as idades forem diferentes.
    // Entradas: nascIrmao1, nascIrmao2, nascIrmao3;
    // Processo: if nascIrmao1 == nascIrmao2 && nascIrmao1 == nascIrmao3
    // else if nascIrmao1 == nascIrmao2 || nascIrmao2 == nascIrmao3 || nascIrmao1 ==
    // nascIrmao3
    // Saida: TRIGÊMEOS ou GÊMEOS ou APENAS IRMÃOS
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento do irmão 1: ");
        int nascIrmao1 = src.nextInt();
        System.out.println("Informe o ano de nascimento do irmão 2: ");
        int nascIrmao2 = src.nextInt();
        System.out.println("Informe o ano de nascimento do irmão 3: ");
        int nascIrmao3 = src.nextInt();

        if (nascIrmao1 == nascIrmao2 && nascIrmao1 == nascIrmao3) {
            System.out.println("TRIGÊMEOS");
        } else if (nascIrmao1 == nascIrmao2 || nascIrmao2 == nascIrmao3 || nascIrmao1 == nascIrmao3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }

        src.close();
    }
}
