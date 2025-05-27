public class Uni5Exe11 {
    // Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela
    // quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte
    // ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e
    // assim por diante. Faça um algoritmo que calcule quantos biscoitos são
    // quebrados no final de cada dia (a máquina opera 16 horas por dia).
    public static void main(String[] args) {
        long biscoitoAnterior = 1;
        long biscoito = 0;

        // cálculo da 1ª hora
        biscoito += biscoitoAnterior;

        // hora 2 em diante
        for (int i = 2; i <= 16; i++) {
            biscoitoAnterior *= 3;
            biscoito += biscoitoAnterior;
        }

        System.out.println("Total de biscoitos quebrados: " + biscoito);
    }
}
