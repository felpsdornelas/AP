import java.util.Scanner;

public class ImpirmirPalavraLetra {
     public static void main(String[] args) {
         
          Scanner s = new Scanner (System.in);

          String frase = "";
          char letra1;
          int contador = 0;

          System.out.println("Digite uma frase: ");
          frase = s.nextLine(); 

          System.out.println("Digite uma letra: ");
          letra1 = s.next().charAt(0);

          String [] partesString = frase.split(" ");

          String fraseMaiuscula = frase.toUpperCase();
          char letraMaiuscula = Character.toUpperCase(letra1);

          for(int i = 0; i<fraseMaiuscula.length(); i++){
               char caracterAtual = fraseMaiuscula.charAt(i);
               if(caracterAtual == letraMaiuscula){
                    contador ++;
               }
          }

          System.out.println(contador);

          for (String palavra : partesString){
               String palavraMiaiuscula = palavra.toUpperCase();

               if (palavraMiaiuscula.indexOf(letraMaiuscula) != -1) {
                    System.out.print(palavra + " ");
               }
          }
     }
}
