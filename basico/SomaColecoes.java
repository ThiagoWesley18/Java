package basico;
import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int flag = 0;
        int soma = 0;

        while(flag != -1){
            int valor = scan.nextInt();
            if(valor != -1){
                while(valor != -1){
                    if(valor != -1){
                        soma =  soma + valor;
                    }else{
                        flag = -1;
                    }
                    valor = scan.nextInt();
                }
                System.out.println(soma);
                soma = 0;
            }else{
                flag = -1;
            }
        }
    }
}
