package basico;
import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int soma = 0;
        while(n != -1 ){
            soma += n;
            n = scan.nextInt();
        }
        System.out.println(soma);
        scan.close();
    }

}
