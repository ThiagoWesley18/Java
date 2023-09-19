package basico;
import java.util.Scanner;

public class TipoTriangulo {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if( (a+b <= c) || (a+c <= b) || (b+c <= a) ){
            System.out.println("invalido");
        }else if((a==b)&&(a==c)){
            System.out.println("equilatero");
        }else if((a==b)||(a==c)){
            System.out.println("isosceles");
        }else{
            System.out.println("escaleno");
        }
    }
}
