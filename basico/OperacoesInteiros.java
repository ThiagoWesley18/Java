package basico;
import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[100];
        int valor;
        int cont = 0;
        int par = 0;
        int impar = 0;
        int soma = 0;
        int soma1 = 0;
        double media = 0.0;
        int maior = 0;
        int menor = 0;

        while(true){
            valor = scan.nextInt();
            if(valor == -1){
                vet[cont] = valor;
                cont++;
                soma1++;
                break;
            }else{
                while(true){
                    if(valor == -1){
                        vet[cont] = valor;
                        cont++;
                        soma1++;
                        break;
                    }else{
                        vet[cont] = valor;
                        cont++;
                    }
                    valor = scan.nextInt();
                }
            }  
        }
        
        
        int i = 0;
        cont = 0;
        while(true){
            if(vet[i] != -1){
                maior = vet[i];
                menor = vet[i];
                while(true){
                    if(vet[i] == -1){
                        media = (double)soma / (double)(cont);
                        i++;
                        break;
                    }else{
                        cont++;
                        soma += vet[i];
                        if(vet[i]%2 == 0){
                            par++;
                        }else{impar++;}
                        if(vet[i] > maior){maior = vet[i];}
                        if(vet[i] < menor){menor = vet[i];}
                        i++;
                    }
                }
                System.out.println(cont);
                System.out.println(par);
                System.out.println(impar);
                System.out.println(soma);
                System.out.printf("%.2f\n",media);
                System.out.println(maior);
                System.out.println(menor);
                cont = 0;
                par = 0;
                impar = 0;
                soma = 0;
                media = 0.0;
                maior = 0;
                menor = 0;
            }else{
                break;
            }
        }


    }
}
