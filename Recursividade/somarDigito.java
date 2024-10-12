import java.util.Scanner;

public class somarDigito {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variavéis. 
        int resultado;
        int numero;

        System.out.println("Digite um valor: ");
        numero = s.nextInt();

        resultado = somaDigitoFim(numero); 
        System.out.println(resultado);
    }

    // Função que faz a soma dos dígitos de um número recursivamente;
    public static int somarDigitos(int numero) {
        if (numero == 0) {
            return 0; // Base da recursão: quando não restam dígitos
        } else {
            return (numero % 10) + somarDigitos(numero / 10); // Soma o último dígito e continua com o restante
        }
    }

    // Função que continua somando os dígitos até restar um único dígito;
    public static int somaDigitoFim(int numero) {
        int soma = somarDigitos(numero); // Soma inicial dos dígitos
        if (soma < 10) {
            return soma; // Se a soma tem um único dígito, retorna o valor
        } else {
            return somaDigitoFim(soma); // Caso contrário, chama a função novamente
        }
    }
}
