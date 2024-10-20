package basico;
import java.util.Scanner;

public class TanqueCombustivel {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            Double r = scan.nextDouble();
            Double x = scan.nextDouble();
            Double vAr;
            Double vCombustivel;
            int op = scan.nextInt();
            vAr =  (Math.PI/3)*Math.pow(x, 2)*(3*r - x);
            vCombustivel = ((4*Math.PI*Math.pow(r, 3))/3) - vAr;
            if(op == 1){
                System.out.printf("%.4f",vAr);
            }else{
                System.out.printf("%.4f",vCombustivel);
            }
        }

    }
}
