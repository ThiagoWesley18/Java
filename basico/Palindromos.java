package basico;
import java.util.Scanner;

public class Palindromos {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String linha = scan.nextLine();
        String linhaMaiusc = linha.toUpperCase();
        linhaMaiusc = linhaMaiusc.replace(" ", "");
        int flag = 0;
        int fim = linhaMaiusc.length() - 1;
        for(int i = 0; i < (linhaMaiusc.length()/2); i++){
            if(i<=fim){
                if(linhaMaiusc.charAt(i) == linhaMaiusc.charAt(fim)){
                    flag = 1;
                }else{
                    flag = 0;
                }
            }
            fim--;
        }
        System.out.printf(linhaMaiusc +" "+ flag);
    }
}
