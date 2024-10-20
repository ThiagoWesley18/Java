package basico;
import java.util.Scanner;

public class Desconto {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        try {
            Double valor = scan.nextDouble();
            if(valor >= 200){
                Double desc = valor*(1-0.05);
                System.out.printf("%.2f",desc);
            }else{
                System.out.printf("%.2f",valor);
            }
        } finally {
            scan.close();
        }
    }
}
