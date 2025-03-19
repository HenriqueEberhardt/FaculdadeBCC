import java.util.Scanner;

public class Exercicio06 {
    // Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
    // escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for
    // informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva
    // “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para
    // maiúscula.
    // Entradas: sexo
    // Processo: if maiusculo = M escreva masculino; if maiusculo = F escreva
    // feminino; if maiusculo = I escreva Nao Informado; else Entrada Incorreta;
    // Saida: Feminino/Masculino/Nao Informado/Entrada incorreta
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String genero;

        System.out.println("Qual o seu genero");
        genero = src.next().toUpperCase();
        char maiusculo = genero.charAt(0);

        if (maiusculo == 'M') {
            System.out.println("Masculino");
        } else if (maiusculo == 'F') {
            System.out.println("Feminino");
        } else if (maiusculo == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }

        src.close();
    }

}
