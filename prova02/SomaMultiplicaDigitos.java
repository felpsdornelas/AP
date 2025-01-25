import java.util.Scanner;

public class SomaMultiplicaDigitos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = s.nextLine();
        
        String[] palavras = frase.split(" ");

        int resultado = 1; 

        for (String palavra : palavras) {
            int somaDigitos = 0;
            
            for (int i = 0; i < palavra.length(); i++) {
                char numerico = palavra.charAt(i);

                if (numerico >= '0' && numerico <= '9') {
                    somaDigitos = somaDigitos + numerico - '0';
                }
            }

            if (somaDigitos == 0) {
                somaDigitos = 1;
            }

            resultado = resultado * somaDigitos;
        }

        System.out.println("Resultado = " + resultado);
    }
}