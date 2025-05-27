
// Entradas: não há entrada do usuário (série fixa de 20 termos);
// Processo: para i de 1 até 20:
//    - calcular o numerador como (2 * i + 1);
//    - calcular o denominador como (i * (i + 1));
//    - somar o valor da divisão à variável acumuladora;
// Saída: exibir o valor final da soma da série.

public class Uni5Exe04 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 20; i++) {
            double numerador = 2 * i + 1;
            double denominador = i * (i + 1);
            soma += numerador / denominador;
        }

        System.out.printf("A soma é: " + soma);
    }
}
