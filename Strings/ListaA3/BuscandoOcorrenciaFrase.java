import java.util.Scanner;

public class BuscandoOcorrenciaFrase {
     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
          
          // Declaração e solicitação de dados ao usuário;

          String frase1, frase2;
          int contador = 0;

          System.out.println("Digite a primeira frase: ");
          frase1 = s.nextLine();

          System.out.println("Digite a segunda frase: ");
          frase2 = s.nextLine();

          String [] partesFrase1 = frase1.split(" ");
          
          for(String indexBusca : partesFrase1) {
               if(indexBusca.equals(frase2)){
                    for(int i = contador; i < partesFrase1.length; i++){
                         System.out.println(partesFrase1[i] + " ");
                    }
               }
               contador ++;
          }
     }
}
