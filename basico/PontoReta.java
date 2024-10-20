package basico;
import java.util.Scanner;

public class PontoReta {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            if((2*x+y) == 3){
                System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.",x,y);
            }else{
                System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.",x,y);
            }
        }

    }
}
