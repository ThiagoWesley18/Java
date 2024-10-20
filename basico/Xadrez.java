package basico;
import java.util.Scanner;

public class Xadrez {
    
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int qtd = scan.nextInt();
            int qtdEspaços = 0;

            for (int j = 0; j < qtd; j++) {
                int i;
                for (i = 0; i < qtd; i++) {
                    if (qtdEspaços % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" *");
                    }
                }
                qtdEspaços++;
                System.out.print("\n");
            }
        }
    }
}
