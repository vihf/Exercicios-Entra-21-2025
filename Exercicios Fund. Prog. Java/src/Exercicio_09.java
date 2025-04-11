import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_09 {
    public static void main(String[] args) {
        //09. Fibonacci até N termos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int[] fibonacci = new int[numero];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < numero; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < numero; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}