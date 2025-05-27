import java.util.Scanner;

public class Uni6Exe09 {
    // Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
    // seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo
    // (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor
    // inteiro) e a idade.

    /*
     * Baseado nisto faça um programa que informe:
     * 
     * qual a nota média recebida pelo cinema;
     * qual a nota média atribuída pelos homens;
     * qual a nota atribuída pela mulher mais jovem;
     * quantas das mulheres com mais de 50 anos deram nota superior a média recebida
     * pelo cinema.
     * Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e
     * métodos para a resolução deste exercício.
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Uni6Exe09 uni = new Uni6Exe09();
        int sexo[] = new int[30];
        int nota[] = new int[30];
        int idade[] = new int[30];
        int media = 0;
        int mediaHomens = 0;
        int mulherMaisNova = idade[0];
        int posicaoIdadeMaisNova = 0;
        int contagemNotasMulheres50 = 0;

        uni.entrada(idade, sexo, nota, src);
        uni.verificacao(nota, sexo, idade, media, mediaHomens, contagemNotasMulheres50, mulherMaisNova, posicaoIdadeMaisNova);
        uni.saida(media, mediaHomens, nota, contagemNotasMulheres50, posicaoIdadeMaisNova);

        src.close();
    }

    public void entrada(int idade[], int sexo[], int nota[], Scanner src) {
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Informe a idade da " + (i + 1) + " posição: ");
            idade[i] = src.nextInt();
            System.out.println("Informe o sexo da " + (i + 1) + " posição: (1=feminino, 2=masculino)");
            sexo[i] = src.nextInt();
            System.out.println("Informe a nota da " + (i + 1) + " posição: ");
            nota[i] = src.nextInt();
        }
    }

    public void verificacao(int nota[], int sexo[], int idade[], int media, int mediaHomens,
            int contagemNotasMulheres50, int mulherMaisNova, int posicaoIdadeMaisNova) {
        // media das notas
        for (int i = 0; i < 30; i++) {
            media = media + nota[i];
        }
        media = media / 30;
        // media dos Homens
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 2) {
                mediaHomens = mediaHomens + nota[i];
            }
        }
        mediaHomens = mediaHomens / 30;
        // nota mulher mais nova
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1 && idade[i] < mulherMaisNova) {
                mulherMaisNova = idade[i];
                posicaoIdadeMaisNova = i;
            }
        }
        // quantas das mulheres com mais de 50 anos deram nota superior a média recebida
        // pelo cinema.
        for (int i = 0; i < idade.length; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > media) {
                contagemNotasMulheres50++;
            }
        }
    }

    public void saida(int media, int mediaHomens, int nota[], int contagemNotasMulheres50, int posicaoIdadeMaisNova) {
        System.out.println("Nota média recebida: " + media);
        System.out.println("Nota média recebida de homens: " + mediaHomens);
        System.out.println("Nota dada pela mulher mais nova: " + nota[posicaoIdadeMaisNova]);
        System.out.println("Quantidade de mulheres com mais de 50 anos e deram nota superior a média recebida pelo cinema: "+ contagemNotasMulheres50);
    }
}
