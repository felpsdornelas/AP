import java.util.Scanner;

public class ValidarTamanhoCpf {

  static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {

    String cpf;

    System.out.println("Digite o seu CPF (Sem pontos e traços)");
    cpf = s.next();

    if (cpf.length() == 11) {
      System.out.println("valido");
    } else {
      System.out.println("invalido");
    }

  }
}
