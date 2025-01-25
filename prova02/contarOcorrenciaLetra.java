import java.util.Scanner;

public class contarOcorrenciaLetra {
     
     public static void main(String[] args) {

          Scanner s = new Scanner (System.in);

          String frase = "";
          char letra1;
          char letra2;

          int contador1 = 0;
          int contador2 = 0;

          System.out.println("Digite uma frase: ");
          frase = s.nextLine();

          System.out.println("Digite a primeira letra: ");
          letra1 = s.next().charAt(0);

          System.out.println("Digite a segunda letra: ");
          letra2 = s.next().charAt(0);

          for(int i = 0; i < frase.length(); i++){
               char caracterAtual = frase.charAt(i);
               if (caracterAtual == letra1) {
                    contador1++;
               } else if(caracterAtual == letra2) {
                    contador2++;
               }
          }    

          if (contador1 > contador2) {
               System.out.println(letra1);
          } else if (contador1 < contador2){
               System.out.println(letra2);
          }else {
               System.out.println("empate");
          }
     }
}
