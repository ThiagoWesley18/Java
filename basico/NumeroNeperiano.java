package basico;

import java.util.Scanner;

public class NumeroNeperiano {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		double K = sc.nextDouble();
		calcularE(K);
		
		sc.close();
	}

	public static double calcularFatorial(double n) {
	    if (n == 0 || n == 1) {
	        return 1;
	    } else {
	        return n * calcularFatorial(n - 1);
	    }
	}
	
	public static double calcularE(double K) {
	    double e = 1.0;
	    double denominador = 1;

	    for (int i = 1; i < K; i++) {
	        e += 1.0 / calcularFatorial(denominador); // Chama função para calcular fatorial
	        denominador++;	
	        //System.out.printf("%.6f\n", e);
	    }
	    System.out.printf("%.6f\n", e);

	    return e;
	}
	
}