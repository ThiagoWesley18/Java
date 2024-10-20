package basico;
import java.util.Scanner;

public class CaixaEletronico {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            double valor = scan.nextDouble();

            if ((valor < 0 ) || (valor % 2 != 0)){
                System.out.println("Valor Invalido");
            } else{
                int nota50 = (int)valor / 50;
                valor = valor - (nota50*50);
                int nota10 = (int)valor / 10;
                valor = valor - (nota10*10);
                int nota2 =(int)valor / 2;
                valor = valor - (nota2*2);
                System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2",nota50,nota10,nota2);
            } 
        } finally {
            scan.close();
        }
    }
}
