package basico;
import java.util.Scanner;

public class PinturaMuro {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        Double total = (12*3) *valor + 100;
        System.out.printf("%.1f", total);
    }

}
