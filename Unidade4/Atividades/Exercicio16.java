import java.util.Scanner;

public class Exercicio16 {
    // Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que
    // a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a
    // soma das idades do homem mais velho com a mulher mais nova, e o produto das
    // idades do homem mais novo com a mulher mais velha.
    // Entradas: idadeMulher1, idadeMulher2, idadeHomem1, idadeHomem2;
    // Processo:
    // 1. Comparar as idades dos homens e determinar o mais velho e o mais novo
    // 2. Comparar as idades das mulheres e determinar a mais velha e a mais nova
    // 3. Calcular a soma do homem mais velho com a mulher mais nova
    // 4. Calcular o produto do homem mais novo com a mulher mais velha
    // Saída: Soma e o produto
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int maiorIdadeMulher, menorIdadeMulher, maiorIdadeHomem, menorIdadeHomem;

        System.out.println("Informe a idade da mulher 1: ");
        int idadeMulher1 = src.nextInt();
        System.out.println("Informe a idade da mulher 2: ");
        int idadeMulher2 = src.nextInt();
        System.out.println("Informe a idade do homem 1: ");
        int idadeHomem1 = src.nextInt();
        System.out.println("Informe a idade do homem 2: ");
        int idadeHomem2 = src.nextInt();

        if (idadeMulher1 > idadeMulher2) {
            maiorIdadeMulher = idadeMulher1;
            menorIdadeMulher = idadeMulher2;
        } else {
            maiorIdadeMulher = idadeMulher2;
            menorIdadeMulher = idadeMulher1;
        }
        if (idadeHomem1 > idadeHomem2) {
            maiorIdadeHomem = idadeHomem1;
            menorIdadeHomem = idadeHomem2;
        } else {
            maiorIdadeHomem = idadeHomem2;
            menorIdadeHomem = idadeHomem1;
        }

        int soma = maiorIdadeHomem + menorIdadeMulher;
        int produto = maiorIdadeMulher * menorIdadeHomem;

        System.out.println("Soma:"+soma+" Produto:"+produto);


        src.close();
    }
}
