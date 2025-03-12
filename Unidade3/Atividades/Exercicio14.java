import java.util.Scanner;

public class Exercicio14 {
    // Descreva um programa que a partir da distância percorrida e o do tempo gasto
    // por um motorista durante uma viagem de final de semana, calcule a velocidade
    // média e a quantidade de combustível gasto na viagem, sabendo que o automóvel
    // faz 12 km por litro.
    // Entradas: tempoGasto, kmPercorrido
    // processo: velMedia = kmPercorrido / qtdCombustivel = kmPercorrido / 12
    // saidas: velMedia, kmPercorrido;
    // teste: Foi utilizados os testes citados no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Quanto tempo você gastou nessa viagem? (Em horas)");
        int tempoGasto = src.nextInt();
        System.out.println("Quantos km foram percorridos?");
        int kmPercorrido = src.nextInt();

        int qtdCombustivel = kmPercorrido / 12;
        int velMedia = kmPercorrido / tempoGasto;

        System.out.println("A velocidade média foi de "+velMedia+" km/h e a quantidade de combustível usado foi "+qtdCombustivel+" litros");

    }
}
