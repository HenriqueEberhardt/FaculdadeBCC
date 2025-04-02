import java.util.Scanner;

public class Exercicio24 {
    // Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem
    // a partir de um menu de opções:
    /*
     * se opção = 1, escreva os 3 valores em ordem crescente
     * se opção = 2, escreva os 3 valores em ordem decrescente
     * se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
     */
    // Entradas: valor1, valor2, valor3;
    // Processo: ler a opção e caso seja
    // case 1: escreva os 3 valores em ordem crescente
    // case 2: escreva os 3 valores em ordem decrescente
    // case 3: escreva os 3 valores de forma que o maior valor fique no meio
    // Saída: valores na ordem requisitada
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Informe 3 valores: ");
        int valor1 = src.nextInt();
        int valor2 = src.nextInt();
        int valor3 = src.nextInt();

        System.out.println("Agora seleciona uma opção de ordem: ");
        System.out.println("1 - ordem crescente");
        System.out.println("2 - ordem decrescente");
        System.out.println("3 - de forma que o maior valor fique no meio");
        int opcao = src.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 > valor2 && valor1 > valor3) {
                    if (valor2 > valor3) {
                        System.out.println(valor3 + "" + valor2 + "" + valor1);
                    } else {
                        System.out.println(valor2 + "" + valor3 + "" + valor1);
                    }

                } else if (valor2 > 1 && valor2 > valor3) {
                    if (valor3 > valor1) {
                        System.out.println(valor1 + "" + valor3 + "" + valor2);
                    } else {
                        System.out.println(valor3 + "" + valor1 + "" + valor2);
                    }

                } else {
                    if (valor1 > valor2) {
                        System.out.println(valor2 + "" + valor1 + "" + valor3);
                    } else {
                        System.out.println(valor1 + "" + valor2 + "" + valor3);
                    }
                }

                break;

            case 2:
                if (valor1 > valor2 && valor1 > valor3) {
                    if (valor2 > valor3) {
                        System.out.println(valor1 + "" + valor2 + "" + valor3);
                    } else {
                        System.out.println(valor1 + "" + valor3 + "" + valor2);
                    }

                } else if (valor2 > 1 && valor2 > valor3) {
                    if (valor3 > valor1) {
                        System.out.println(valor2 + "" + valor3 + "" + valor1);
                    } else {
                        System.out.println(valor2 + "" + valor1 + "" + valor3);
                    }

                } else {
                    if (valor1 > valor2) {
                        System.out.println(valor3 + "" + valor1 + "" + valor2);
                    } else {
                        System.out.println(valor3 + "" + valor2 + "" + valor1);
                    }
                }


                //CONTINUAR CODIGO ABAIXO DA OPCAO 3!
                break;
            case 3:
                if (valor1 > valor2 && valor1 > valor3) {
                    if (valor2 > valor3) {
                        System.out.println(valor3 + "" + valor2 + "" + valor1);
                    } else {
                        System.out.println(valor2 + "" + valor3 + "" + valor1);
                    }

                } else if (valor2 > 1 && valor2 > valor3) {
                    if (valor3 > valor1) {
                        System.out.println(valor1 + "" + valor3 + "" + valor2);
                    } else {
                        System.out.println(valor3 + "" + valor1 + "" + valor2);
                    }

                } else {
                    if (valor1 > valor2) {
                        System.out.println(valor2 + "" + valor1 + "" + valor3);
                    } else {
                        System.out.println(valor1 + "" + valor2 + "" + valor3);
                    }
                }

                break;

            default:
                break;
        }

    }
}
