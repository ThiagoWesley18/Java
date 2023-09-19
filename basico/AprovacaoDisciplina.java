package basico;

import java.util.Scanner;

public class AprovacaoDisciplina {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double notas[] = new double[100];
        int presenças[] = new int[100];
        int i = 0;
        double frequencia;
        int reprovadoFrequencia = 0;
        int reprovadoNota = 0;
        int aprovados = 0;

        double nota = scan.nextDouble();
        while (nota != -1){
            if(nota == 0){
                reprovadoNota++;
            }
            notas[i] = nota;
            nota = scan.nextDouble();
            i++;
        }

        i = 0;
        int presença = scan.nextInt();
        while (presença != -1){
            if(presença == 0){
                reprovadoFrequencia++;
            }
            presenças[i] = presença;
            presença = scan.nextInt();
            i++;
        }
        int cargaHoraria = scan.nextInt();

        int flag = 0;
        for(i = 0; i < notas.length; i++){
            if((notas[i] < 5.0) && (notas[i] > 0)){
                reprovadoNota++;
            }else if (notas[i] > 0){
                flag = 1;
            }

            frequencia =(double) presenças[i] / (double)cargaHoraria;
            if((frequencia < 0.75) && (presenças[i] > 0)){
                reprovadoFrequencia++;
                flag = 0;
            }else if((flag ==1) && (presenças[i] > 0)){
                aprovados++;
                flag = 0;
            }
            
        }
        
        System.out.print(aprovados+" ");
        System.out.print(reprovadoNota+" ");
        System.out.print(reprovadoFrequencia);
    }
}
