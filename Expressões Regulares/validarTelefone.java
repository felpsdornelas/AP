import java.util.Scanner;

public class validarTelefone {
     public static void main(String[] args) {
          
          Scanner s = new Scanner (System.in);

          String telefone;

          System.out.println("Digite o número de seu telefone com (DDD): ");
          telefone = s.nextLine();

          String mascaraCelular = "^\\((\\d{2})\\) [9]\\d{4}[-]\\d{4}$";
          String mascaraFixo = "^\\((\\d{2})\\) \\d{4}[-]\\d{4}$";

          if (telefone.matches(mascaraCelular) == true) {
               System.out.println("Celular");
          } else {
               if(telefone.matches(mascaraFixo) == true){
                    System.out.println("Fixo");  
               } else {
                    System.out.println("inválido");
               }
          }
     }
}
