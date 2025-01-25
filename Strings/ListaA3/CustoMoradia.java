import java.util.Scanner;

public class CustoMoradia {

     static Scanner s = new Scanner (System.in);
     public static void main(String[] args) {
          
          String cidade;
          double custo;

          System.out.println("Digite o custo: ");
          custo = s.nextDouble();
          s.nextLine();

          System.out.println("Digite a cidade:");
          cidade = s.nextLine();

          if(cidade.equals("Uberlandia")){
               System.out.printf("O custo de vida em %s e R$ %.2f%n", cidade ,custo);
          }
          else if (cidade.equals("Brasilia")){
               System.out.printf("O custo de vida em %s e R$ %.2f%n", cidade, custo*2);
          }
          else{
               System.out.printf("O custo de vida em %s e R$ %.2f%n", cidade, custo/2);
          }
     }
}
