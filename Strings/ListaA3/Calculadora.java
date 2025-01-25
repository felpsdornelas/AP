import java.util.Scanner;

public class Calculadora {
     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
          
          String formulaMat;
          double soma = 0;

          System.out.println("Digite uma fórmula matemática: ");
          formulaMat = s.nextLine();

          String [] partesFormula =  formulaMat.split(" "); 

          double numero1 = Double.parseDouble(partesFormula[0]);
          String operador = partesFormula[1];
          double numero2 = Double.parseDouble(partesFormula[2]);

          if(partesFormula.length != 3){
               System.out.println("Formulá inválida");

          }else{
               switch (operador) {
                    case "*":
                         soma = numero1 * numero2;
                         System.out.println(soma);
                         break;
                    case "+":
                         soma = numero1 + numero2;
                         System.out.println(soma);
                         break;
                    case "-":
                         soma = numero1 - numero2;
                         System.out.println(soma);
                         break;
                    case "/":
                    case "÷":
                         soma = numero1 / numero2;
                         System.out.println(soma);
                         break;          
                    default:
                         System.out.println("Fórmula inválida");
                         break;
               }
          }
     }
}
