package basico;
import java.util.Scanner;

public class AsciiArt {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        int total = qtd;
        int qtdEspaços = 0;

        for(int j = qtd; j > 0; j--){
            int i;
            for(i = 0; i < qtd; i++){
                System.out.print("*");
            }
            
            for(int k = 0; k < qtdEspaços; k++){
                System.out.print(" ");
            }
            
            for(int t = 0; t < qtd; t++){
                System.out.print("*");
            }
            
            qtd--;
            qtdEspaços = (total - qtd) * 2;
            System.out.print("\n");
        }
    
    }
}
