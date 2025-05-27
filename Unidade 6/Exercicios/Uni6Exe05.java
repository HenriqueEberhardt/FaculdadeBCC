import java.util.Scanner;

public class Uni6Exe05 {
    // Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça
    // cada um respondeu um questionário com 5 perguntas, como por exemplo:

    /*
     * Gosta de música sertaneja?
     * Gosta de futebol?
     * Gosta de seriados?
     * Gosta de redes sociais?
     * Gosta da Oktoberfest?
     * A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice
     * de afinidade é medido da seguinte maneira:
     * 
     * se ambos deram a mesma resposta soma-se 3 pontos ao índice;
     * se um respondeu IND e o outro SIM ou NÃO soma-se 1;
     * se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
     * Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as
     * respostas da moça. Crie um método que possa ler tanto as respostas do rapaz
     * como da moça, e outro para calcular e retornar a afinidade. Por fim, escreva
     * a afinidade considerando os seguintes intervalos:
     * 
     */

    public static void main(String[] args) {
        Uni6Exe05 uni = new Uni6Exe05();
        Scanner src = new Scanner(System.in);
        String respostaHomen[] = new String[5];
        String respostaMulher[] = new String[5];
        int indice = 0;

        uni.ler(src, respostaHomen, respostaMulher);
        uni.calculo(respostaHomen, respostaMulher, indice);
        uni.informarValores(indice);

        src.close();

    }

    public void ler(Scanner src, String respostaHomen[], String respostaMulher[]) {
        System.out.println("Gosta de música sertaneja?");
        respostaHomen[0] = src.next();
        System.out.println("Gosta de futebol?");
        respostaHomen[1] = src.next();
        System.out.println("Gosta de seriados?");
        respostaHomen[2] = src.next();
        System.out.println("Gosta de redes sociais?");
        respostaHomen[3] = src.next();
        System.out.println("Gosta da Oktoberfest?");
        respostaHomen[4] = src.next();

        System.out.println("Gosta de música sertaneja?");
        respostaMulher[0] = src.next();
        System.out.println("Gosta de futebol?");
        respostaMulher[1] = src.next();
        System.out.println("Gosta de seriados?");
        respostaMulher[2] = src.next();
        System.out.println("Gosta de redes sociais?");
        respostaMulher[3] = src.next();
        System.out.println("Gosta da Oktoberfest?");
        respostaMulher[4] = src.next();
    }

    public void calculo(String respostaHomen[], String respostaMulher[], int indice) {
        for (int i = 0; i < 5; i++) {
            if (respostaHomen[i] == respostaMulher[i]) {
                indice = indice + 3;
            } else if ((respostaHomen[i] == "NAO" && respostaMulher[i] == "SIM")
                    || (respostaMulher[i] == "NAO" && respostaHomen[i] == "SIM")) {
                indice = indice - 2;
            } else if ((respostaHomen[i] == "IND" && (respostaMulher[i] == "NAO" || respostaMulher[i] == "SIM"))) {
                indice = indice + 1;
            } else if ((respostaMulher[i] == "IND" && (respostaHomen[i] == "NAO" || respostaHomen[i] == "SIM"))) {
                indice = indice + 1;
            }
        }
    }

    public void informarValores(int indice) {
        if (indice <= -10) {
            System.out.println("Voces se odeiam!");
        } else if (indice <= -1 && indice >= -9) {
            System.out.println("Melhor não perder tempo");
        } else if (indice <= 4 && indice >= 0) {
            System.out.println("Vale um encontro.");
        } else if (indice <= 9 && indice >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (indice <= 14 && indice >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else {
            System.out.println("Casem!");
        }
    }
}
