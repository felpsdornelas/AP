import java.util.Scanner;

public class FatorialDenovo {

     static Scanner s = new Scanner(System.in);
     

    public static void main(String[] args){

     while (true) {
         String numeroACM = s.nextLine();  // Lê a linha de entrada

         // Condição de parada (caso de teste com "0")
         if (numeroACM.equals("0")) {
             break;
         }

         // Converte o número ACM para decimal e imprime o resultado
         int resultado = converterACM(numeroACM, numeroACM.length());
         System.out.println(resultado);
     }
 }

 // Função recursiva para calcular o fatorial de um número
 public static int fatorial(int n) {
     if (n == 0 || n == 1) {
         return 1;
     }
     return n * fatorial(n - 1);
 }

 // Função recursiva para converter o número da notação ACM para decimal
 public static int converterACM(String numeroACM, int posicao) {
     // Caso base: se não houver mais dígitos, retorna 0
     if (posicao == 0) {
         return 0;
     }

     // Obtém o dígito atual (da direita para a esquerda)
     int digito = numeroACM.charAt(numeroACM.length() - posicao) - '0';

     // Calcula o valor deste dígito multiplicado pelo fatorial da posição e chama a função recursiva para o próximo dígito
     return digito * fatorial(posicao) + converterACM(numeroACM, posicao - 1);
 }
}
