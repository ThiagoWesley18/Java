package basico;
import java.util.Scanner;

public class RaizQuadrada {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        double raiz = Math.sqrt(valor);

        System.out.printf("%.4f", raiz);
    }
}
