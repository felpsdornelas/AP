import java.util.Scanner;

public class validandoCPF {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);
          
          String Cpf;

          System.out.println("Digite seu CPF: ");
          Cpf = s.nextLine();

          String mascaraCpf = "((\\d{3}[.]){2}\\d{3}[-]\\d{2})|(\\d{11})";

          if(Cpf.matches(mascaraCpf) == true){
               System.out.println("CPF válido");
          } else {
               System.out.println("CPF inválido");
          }
     }
}
