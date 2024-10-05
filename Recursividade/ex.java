import java.util.Scanner;

public class ex {

     // Deixa o Scanner compatível com qualquer função;
     static Scanner s = new Scanner(System.in);

     // Função que realiza a leitura das notas;
     public static void lerNotas(int valorEntrada, double [] notas){

          for (int i = 0; i<valorEntrada; i++){
               System.out.print("Digite o valor da nota "+ (i+1) + " : ");
               notas[i] = s.nextDouble();
          }
     }

     public static void realizarMediaNotas(double notas[]){
          
          double somaNotas = 0;

          for(int i = 0; i<notas.length; i++){
               somaNotas += notas[i];
          }
          System.out.println("A média das notas é : " + somaNotas / notas.length);
     }

     public static void main(String[] args) {

          System.out.print("Digite o valor de entrada: ");
          int valorEntrada = s.nextInt();


          double[] notas =  new double[valorEntrada];
          lerNotas(valorEntrada, notas);

          realizarMediaNotas(notas);


     }
}
