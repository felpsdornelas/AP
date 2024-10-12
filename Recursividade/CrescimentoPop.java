import java.util.Scanner;

public class CrescimentoPop {

     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {
               Scanner s = new Scanner(System.in);
       
               int T = s.nextInt();  // Número de casos de teste
       
               for (int i = 0; i < T; i++) {
                   int PA = s.nextInt();  // População da cidade A
                   int PB = s.nextInt();  // População da cidade B
                   double G1 = s.nextDouble();  // Taxa de crescimento da cidade A
                   double G2 = s.nextDouble();  // Taxa de crescimento da cidade B
       
                   // Chamada recursiva para calcular os anos
                   int anos = calcularAnos(PA, PB, G1, G2, 0);
       
                   // Verificar se ultrapassou 100 anos
                   if (anos > 100) {
                       System.out.println("Mais de 1 seculo.");
                   } else {
                       System.out.println(anos + " anos.");
                   }
               }
           }
       
           // Função recursiva para calcular os anos
           public static int calcularAnos(int PA, int PB, double G1, double G2, int anos) {
               // Base da recursão: se a população de A for maior que B ou o tempo for maior que 100 anos
               if (PA > PB || anos > 100) {
                   return anos;
               }
       
               // Crescimento das populações de A e B
               PA += (int)(PA * G1 / 100);
               PB += (int)(PB * G2 / 100);
       
               // Chamada recursiva, incrementando os anos
               return calcularAnos(PA, PB, G1, G2, anos + 1);
           }
}
