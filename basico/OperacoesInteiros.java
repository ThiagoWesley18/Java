package basico; // NOSONAR
import java.util.Scanner;

public class OperacoesInteiros { // NOSONAR
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vet = new int[100];
            int valor;
            int cont = 0;
            int par = 0;
            int impar = 0; // NOSONAR
            int soma = 0;
            double media = 0.0;
            int maior = Integer.MIN_VALUE; // NOSONAR
            int menor = Integer.MAX_VALUE; // NOSONAR

            while (true) {
                valor = scan.nextInt();
                if (valor == -1) {
                    break;
                }
                vet[cont] = valor;
                cont++;
            }

            for (int i = 0; i < cont; i++) {
                valor = vet[i];
                soma += valor;
                if (valor % 2 == 0) {
                    par++;
                } else {
                    impar++; // NOSONAR
                }
                if (valor > maior) {
                    maior = valor; // NOSONAR
                }
                if (valor < menor) {
                    menor = valor; // NOSONAR
                }
            }

            if (cont > 0) {
                media = (double) soma / cont;
            }

            System.out.println("Quantidade de números: " + cont);
            System.out.println("Quantidade de pares: " + par);
            System.out.println("Quantidade de ímpares: " + impar); // NOSONAR
            System.out.println("Soma dos valores: " + soma);
            System.out.printf("Média dos valores: %.2f\n", media);
            System.out.println("Maior valor: " + maior); // NOSONAR
            System.out.println("Menor valor: " + menor); // NOSONAR
        }
    }
}
