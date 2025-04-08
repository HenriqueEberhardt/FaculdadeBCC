import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = opcao
         * Saída =
         * - O valor da área da figura selecionada.
         * - Caso a opção seja inválida, uma mensagem de erro é exibida.
         * Processos =
         * - O programa utiliza um `switch` para determinar qual figura o usuário deseja
         * calcular a área.
         * - Para cada figura, a fórmula apropriada é aplicada para calcular a área.
         * - Caso a opção seja inválida (diferente de T, Q, R ou C), uma mensagem de
         * erro é exibida.
         */
        Scanner src = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("T: Calcular a área de um triangulo da base b e altura h");
        System.out.println("Q: Calcular a área de um quadrado de lado l");
        System.out.println("R: Calcular a área de um retangulo de base b e altura h ");
        System.out.println("C: Calcular a área de um circulo de raio r");
        char opcao = src.next().toUpperCase().charAt(0);
        switch (opcao) {
            case 'T':
                System.out.println("Digite a base do triangulo: ");
                double base = src.nextDouble();
                System.out.println("Digite a altura do triangulo: ");
                double altura = src.nextDouble();
                System.out.println("Área do triângulo = " + base * altura / 2);
                break;
            case 'Q':
                System.out.println("Digite o lado: ");
                double lado = src.nextDouble();
                System.out.println("Área do quadrado = " + lado * lado);
                break;
            case 'R':
                System.out.println("Digite a base do retangulo: ");
                double b = src.nextDouble();
                System.out.println("Digite a altura do retangulo: ");
                double h = src.nextDouble();
                System.out.println("Área do triângulo = " + b * h);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                double raio = src.nextDouble();
                System.out.println("Área do circulo = " + Math.PI * Math.pow(raio, 2));
                break;
            default:
                System.out.println("Opção INVÁLIDA");
                break;
        }
        src.close();
    }
}