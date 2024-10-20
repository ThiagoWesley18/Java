package basico; // NOSONAR
import java.util.Scanner;

public class PinturaMuro { // NOSONAR
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            double valor = scan.nextDouble();
            Double total = (12 * 3) * valor + 100;
            System.out.printf("%.1f", total);
        }
    }
}