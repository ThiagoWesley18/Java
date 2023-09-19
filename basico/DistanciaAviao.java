package basico;
import java.util.Scanner;

public class DistanciaAviao {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int cidade1 = 0;
        int cidade2 = 0;
        int coordenada1 = 0,coordenada2 = 0;
        int soma = 0;
        int mat[][] = new int[][] { {0,111,222,333,444,555,666,777}, {111,0,2,11,6,15,11,1}, {222,2,0,7,12,4,2,15}, 
                                    {333,11,7,0,11,8,3,13}, {444,6,12,11,0,10,2,1}, {555,15,4,8,10,0,5,13},
                                    {666,11,2,3,2,5,0,14}, {777,1,15,13,1,13,14,0} };
        Scanner scan = new Scanner(System.in);

        cidade1 = scan.nextInt();
        cidade2 = scan.nextInt();

        while((cidade1 != -1) && (cidade2 != -1)){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[0][j] == cidade1){
                        coordenada2 = j;
                    }
            }
            
                for(int i = 0; i < mat.length; i++){
                    if(mat[i][0] == cidade2){
                        coordenada1 = i;
                    }
                }
            
            
            soma += mat[coordenada1][coordenada2];
            //System.out.println(soma);
            cidade1 = cidade2;
            cidade2 = scan.nextInt();   
        }

        System.out.println(soma);

    }
}
  