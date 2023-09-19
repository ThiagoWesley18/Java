package basico;
import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Entrada: ");
        String input = scanner.nextLine();
        String[] valores = input.split(" ");

        int meio = valores.length / 2;

        double[] x = new double[meio];
        double[] y = new double[meio];

        for (int i = 0; i < meio; i++) {
            x[i] = Double.parseDouble(valores[i]);
            y[i] = Double.parseDouble(valores[i + meio]);
        }

        double area = calcularAreaPoligono(x, y);
        System.out.printf("%.4f\n", area);

        scanner.close();
    }

    private static double calcularAreaPoligono(double[] x, double[] y) {
        double area = 0;
        int n = x.length;

        for (int i = 0; i < n - 1; i++) {
            area += (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
        }

        area += (x[n - 1] * y[0]) - (x[0] * y[n - 1]);

        return Math.abs(area)/2;
    }
}
