package basico;
import java.util.Scanner;

public class ContaEnergia {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int consumo = scan.nextInt();
        char tipo = scan.next().charAt(0);
        double valor = 0;
        switch(tipo){
            case 'R':
                if((consumo <= 500)&&(consumo>=0)){
                    valor = consumo*0.40;
                }else if(consumo > 500){
                    valor = consumo*0.65;
                }else valor = -1;
                break;
            case 'I':
                if((consumo <= 5000)&&(consumo>=0)){
                    valor = consumo*0.55;
                }else if(consumo > 5000){
                    valor = consumo*0.60;
                }else valor = -1;
                break;
            case 'C':
                if((consumo <= 1000)&&(consumo>=0)){
                    valor = consumo*0.55;
                }else if(consumo > 1000){
                    valor = consumo*0.60;
                }else valor = -1;
                break;
            default:
                valor = -1;

        }
        System.out.printf("%.2f",valor);
        scan.close();
    }
}
