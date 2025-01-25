import java.util.Scanner;

class ZeroValeZero {

     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {

          // Declaração de variáveis;
          int num1, num2, soma;

          // Entrada de dados;

          while (true) {

               // System.out.println("Digite o primeiro número: ");
               num1 = s.nextInt();

               // System.out.println("Digite o segundo número: ");
               num2 = s.nextInt();

               soma = num1 + num2;
               String ResultadosSemZero = "";

               // Transformando o número em uma String;
               String somaStri = String.valueOf(soma);

               for (int i = 0; i < somaStri.length(); i++) {
                    char c = somaStri.charAt(i);

                    if (c != '0') {

                         ResultadosSemZero += c;
                    }

               }

               if (num1 == 0 && num2 == 0) {
                    break;
               }

               System.out.println(ResultadosSemZero);
          }
     }
}