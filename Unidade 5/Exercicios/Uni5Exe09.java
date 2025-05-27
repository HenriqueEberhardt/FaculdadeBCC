import java.util.Scanner;
/*
 * Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

    escreva os nomes dos alunos que tem 18 anos;
    escreva a quantidade de alunos que tem idade acima de 20 anos.
 */

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String nomeAluno = "";
        String nomes = "";
        int idade = 0;
        int contador = 0;
        System.out.println("Informe n: ");
        int n = src.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe sua idade: ");
            idade = src.nextInt();
            System.out.println("Informe seu Nome: ");
            nomeAluno = src.next();
            if (idade == 18) {
                nomes = nomes + nomeAluno + " - ";
            }
            if (idade > 20) {
                contador++;
            }

        }
        System.out.println("Nomes dos alunos que tem 18 anos: ");
        System.out.println(nomes);
        System.out.println("Quantidade de alunos que tem acima de 20 anos: " + contador);

        src.close();
    }
}
