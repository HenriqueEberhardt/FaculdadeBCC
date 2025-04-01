import java.util.Scanner;

public class Exercicio10 {
    // Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
    // algoritmo para ler as idades dos filhos e exibir quem é o caçula da família;
    // suponha que não haja empates.
    // Entradas: idadeMar, idadeZe, idadeLulu;
    // Processo: if idadeMar < idadeZe && idadeMar < idadeLulu;
    // else if idadeZe < idadeMar && idadeZe < idadeLulu;
    // else if idadeLulu < idadeMar && idadeLulu < idadeZe;
    // Saida: maiorIdade
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe a idade de Marquinho: ");
        int idadeMar = src.nextInt();
        System.out.println("Informe a idade de Zezinho: ");
        int idadeZe = src.nextInt();
        System.out.println("Informe a idade de Luluzinha: ");
        int idadeLulu = src.nextInt();

        if (idadeMar < idadeZe && idadeMar < idadeLulu) {
            System.out.println("Marquinhos é o caçula");
        } else if (idadeZe < idadeMar && idadeZe < idadeLulu) {
            System.out.println("Zezinho é o caçula");
        } else if (idadeLulu < idadeMar && idadeLulu < idadeZe) {
            System.out.println("Luluzinha é a caçula");
        }

        src.close();

    }
}
