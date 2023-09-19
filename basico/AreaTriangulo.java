package basico;
import java.util.Scanner;

public class AreaTriangulo {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double s,area;

        if( (a+b <= c) || (a+c <= b) || (b+c <= a) ){
            System.out.println("Triangulo invalido");
        }else{
            s =  (a+b+c)/2;
            area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
            System.out.printf("%.2f",area);
        }
        
    }
}
