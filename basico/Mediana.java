package basico;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vet = new int[100];
            int valor;
            int cont = 0;
            int i = 0;
            int j = 0;
            double mediana;

            while(true){
                valor = scan.nextInt();
                if(valor == -1){
                    break;
                }else{
                    vet[cont] = valor;
                    cont++;
                }
            }

            if(cont%2 == 0){
                i = (cont/2) - 1;
                j = i + 1;
                mediana = (double)(vet[i] + vet[j])/2;
            }else{
                i = cont/2;
                mediana = (double)vet[i];
            }
            System.out.printf("%.1f",mediana);
        }
    }
}
