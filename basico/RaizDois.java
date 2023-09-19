package basico;
import java.util.Scanner;

public class RaizDois {
     
     /** 
      * @param args
      * @throws Exception
      */
     public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Double SEMENTE = 1.0;
        Double resultado = 0.0;

        for(int j = 1; j<=n; j++){
            if (j >= 2){
                resultado = 2 + (1/SEMENTE);
                for(int i = 0; i < j-1; i++){
                    resultado = 2 + (1/resultado);
                }
                resultado = 1 + (1/resultado);
                System.out.printf("%.14f\n",resultado);
            }else{
            resultado = 1 + (1/(2+(1/SEMENTE))); 
            System.out.printf("%.14f\n",resultado);
            resultado = 0.0;
            }
        }   
        
     }
}
