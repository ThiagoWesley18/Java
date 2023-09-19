package basico;
import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(" ", 2); 
        int deslocamento = Integer.parseInt(partes[0]);
        String textoOriginal = partes[1];

        String textoCriptografado = criptografarCesar(textoOriginal, deslocamento);
        System.out.println(textoCriptografado.toUpperCase());

        scanner.close();
    }

    private static String criptografarCesar(String texto, int deslocamento) {
        StringBuilder textoCriptografado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char inicioAlfabeto = Character.isUpperCase(caractere) ? 'A' : 'a';
                char novoCaractere = (char) (((caractere - inicioAlfabeto + deslocamento) % 26) + inicioAlfabeto);
                textoCriptografado.append(novoCaractere);
            } else {
                textoCriptografado.append(caractere);
            }
        }
        return textoCriptografado.toString();
    }

}