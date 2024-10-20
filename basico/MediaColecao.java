package basico;
import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int soma = 0;
        int cont = 0;
        double media = 0.0;
        while(n != -1 ){
            soma += n;
            cont++;
            n = scan.nextInt();
        }
        media = (double)soma/(double)(cont);
        System.out.printf("%.2f\n",media);
        scan.close();
    }
}
