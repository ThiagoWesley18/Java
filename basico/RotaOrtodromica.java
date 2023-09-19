package basico;
import java.util.Scanner;

public class RotaOrtodromica {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Double R = 6371.0;
        Scanner scan = new Scanner(System.in);
        double t1 = Math.toRadians(scan.nextDouble());
        double g1 = Math.toRadians(scan.nextDouble());
        double t2 = Math.toRadians(scan.nextDouble());
        double g2 = Math.toRadians(scan.nextDouble());
        double d = R*Math.acos(Math.sin(t1) * Math.sin(t2) + Math.cos(t1) * Math.cos(t2) * Math.cos(g1-g2) );
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km",Math.toDegrees(t1),Math.toDegrees(g1),Math.toDegrees(t2),Math.toDegrees(g2),d);

    }
}
