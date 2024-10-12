import java.util.Scanner;
public class REC06 {

     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
          int n = s.nextInt();
          System.out.println("ff(" + n + ") = " + funcaoFF(n));
          s.close(); 
     }

     private static int funcaoFF(int n) {
          if (n <= 1){
              return 1; // Neste caso, não é necessáro chamar a função, pois todo número 1 ou menor que ele será 1, corrigi o caso base para numero <= 1, para incluir números negativos.

          }else if (n % 2 == 0){
              return funcaoFF(n/2);
          }else {
              return funcaoFF((n-1)/2) + funcaoFF((n+1)/2);
          }      
     }
}
