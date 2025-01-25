import java.util.Scanner;

public class validarValor {
     public static void main(String[] args) {
          
          Scanner s = new Scanner (System.in);

          String valor;

          System.out.println("Digite um valor entre 100,00 a 99999,99: ");
          valor = s.nextLine();

          String mascara = "^R\\$ \\d{3,5}[.]\\d{2}$";

          if(valor.matches(mascara) == true) {
               System.out.println("Valor válido");
          } else {
               System.out.println("Valor inválido");
          }
     }
}
