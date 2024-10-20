package basico;
import java.util.Scanner;

public class IdadeUfam {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int ano = scan.nextInt();
        int idade = ano - 1909; 
        System.out.println("A UFAM tem " + idade + " anos de fundacao");
        scan.close();
    }
}
