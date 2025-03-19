import java.util.Scanner;

public class Exercicio05 {
    // Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável
    // lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”,
    // caso seja false.
    // Entradas: resposta
    // Processo: if "resposta" == "Sim" = true;  if "resposta" == "Não" = false
    // Saida: logica
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        boolean logica = false;

        System.out.println("A cor é azul?");
        String resposta = src.next();

        if (resposta.equals("Sim")) {
            logica = true;
        } else if (resposta.equals("Não")) {
            logica = false;
        }
        System.out.println(logica);

    }
}
