import java.util.Scanner;

public class Exercicio08 {
    // Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
    // Para resolver este problema pode se utilizar do algoritmo descrito no
    // fluxograma:
    // Entradas: letra
    // Processo: if letra == a ou letra == e ou letra == i ou letra == o ou letra == u) { 
    // Saida: NÃO é vogal; É vogal
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char letra = src.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { 
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }
        src.close();
    }
}
