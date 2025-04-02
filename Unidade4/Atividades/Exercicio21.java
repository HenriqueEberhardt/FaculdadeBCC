import java.util.Scanner;

public class Exercicio21 {
    // O índice de massa corporal (IMC) é uma medida internacional usada para
    // calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão
    // da massa do indivíduo pelo quadrado de sua altura, onde a massa está em
    // quilogramas e a altura está em metros, de acordo com a fórmula:

    /*
     * IMC=\frac{Massa}{Altura^2}
     * 
     * Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
     * indivíduo, de acordo com a seguinte tabela:
     * 
     * IMC Classificação
     * < 18.5 Magreza
     * 18.5 - 24.9 Saudável
     * 25.0 - 29.9 Sobrepeso
     * 30.0 - 34.9 Obesidade Grau I
     * 35.0 - 39.9 Obesidade Grau II (severa)
     * >= 40.0 Obesidade Grau III (mórbida)
     */

    // Entradas: massa, altura
    // Processo:
    // Solicitar massa e altura
    // Definir IMC da pessoa;
    /*
     * if IMC < 18.5 Magreza
     * if IMC > 18.5 && IMC < 24.9 Saudável
     * if IMC > 25.0 && IMC < 29.9 Sobrepeso
     * if IMC > 30.0 && IMC < 34.9 Obesidade Grau I
     * if IMC > 35.0 && IMC < 39.9 Obesidade Grau II (severa)
     * if IMC >= 40.0 Obesidade Grau III (mórbida)
     */
    // Saída: grau
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Informe sua massa corporal: ");
        double massa = src.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = src.nextDouble();

        double imc = (massa)/(altura*altura);
        String grau = "";

        if (imc < 18.5) {
            grau = "Magreza";
        } else if (imc > 18.5 && imc < 24.9) {
            grau = "Suadável";
        } else if (imc > 25.0 && imc < 29.9) {
            grau = "Sobrepeso";
        } else if (imc > 30 && imc < 34.9) {
            grau = "Obesidade Grau I";
        } else if (imc > 35 && imc < 39.9) {
            grau = "Obesidade Grau II (Severa)";
        } else if (imc >= 40) {
            grau = "Obesidade Grau III (Mórbida)";
        }

        System.out.println(grau);

        src.close();

    }
}
