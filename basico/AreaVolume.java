package basico;
import java.util.Scanner;

public class AreaVolume {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            double r = scan.nextInt();
            Double a = Math.PI * Math.pow(r, 2);
            Double v = (4.00 / 3.00) * Math.PI * Math.pow(r, 3);
            System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.", r, a);
            System.out.printf("\n");
            System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", r, v);
        } finally {
            scan.close();
        }
    }
}