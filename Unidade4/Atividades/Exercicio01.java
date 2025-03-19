import java.util.Scanner;

public class Exercicio01 {
    // A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
    // que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
    // hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
    // de horas trabalhadas em um mês, o valor por hora e escreva o salário total do
    // funcionário, que deverá ser acrescido das horas extras, caso tenham sido
    // trabalhadas (considere que o mês possua 4 semanas exatas).
    // Para resolver este problema pode se utilizar do algoritmo descrito no
    // Entradas: horasMes, valorHora
    // Processo: salaioTotal = hotasMes * valorHora; se horasMes > 160 = salarioExtra = (horasMes - 160) * (valorHora / 2); salarioTotal = salarioTotal + salarioExtra;
    // Saida: salarioTotal
    // Teste: Usado testes ditos no enunciado
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double salarioExtra;

        System.out.println("Entre com as horas trabalhadas no mês: ");
        double horasMes = src.nextDouble();
        System.out.println("Entre com o valor pago por hora: ");
        double valorHora = src.nextDouble();

        double salarioTotal = horasMes * valorHora;

        if (horasMes > 160) {
            salarioExtra = (horasMes - 160) * (valorHora / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println("O salário total é:"+salarioTotal);

        src.close();
    }
}
