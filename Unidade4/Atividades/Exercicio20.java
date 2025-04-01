import java.util.Scanner;

public class Exercicio20 {
    // Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
    // descreva um algoritmo que calcule a média de aproveitamento e o conceito do
    // aluno, usando a fórmula:

    // media = (notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7

    // O algoritmo deve escrever a média de aproveitamento, o conceito
    // correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e
    // "reprovado" caso o conceito seja D ou E.

    // Entradas: notaProva1, notaProva2, notaProva3, notaExercicios;
    // Processo:
    // Solicitar as notas das provas e a média dos exercícios ao usuário
    // Calcular a média de aproveitamento utilizando a fórmula fornecida
    // Determinar o conceito do aluno com base na tabela de classificação
    // Exibir a média de aproveitamento e o conceito obtido
    // Exibir se o aluno está aprovado ou reprovado com base no conceito
    // Saída: Média de aproveitamento, conceito e status

    //media	conceito

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe a nota da prova 1: ");
        double notaProva1 = src.nextDouble();
        System.out.println("Informe a nota da prova 2: ");
        double notaProva2 = src.nextDouble();
        System.out.println("Informe a nota da prova 3: ");
        double notaProva3 = src.nextDouble();
        System.out.println("Informe a nota dos exercícios: ");
        double notaExercicios = src.nextDouble();

        double media = (notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7;
        String conceito = "";
        String status;

        if (media >= 9) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
        } else if (media >= 5 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
        } else if (media < 4) {
            conceito = "E";
        }

        if (media >= 6) {
            System.out.println("A média de aproveitamento foi:"+media+". Conceito:"+conceito+". Aprovado");
        } else if (media < 6) {
            System.out.println("A média de aproveitamento foi:"+media+". Conceito:"+conceito+". Reprovado");
        }

        src.close();


    }
}
