import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a temperatura em Celsius: ");
        int temperatura = scanner.nextInt();
        double resultado = (temperatura * 1.8) + 32;
        String mensagem = String.format("O resultado da conversão de Celsius %d é %.2f Fahrenheit!", temperatura, resultado);
        System.out.println(mensagem);
    }
}
