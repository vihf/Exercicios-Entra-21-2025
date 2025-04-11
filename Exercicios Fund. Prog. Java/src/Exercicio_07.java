import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_07 {
    public static void main(String[] args) {
        //07. Soma dos dígitos de um número
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 99:");
        int numero = scanner.nextInt();

        int dezena = numero / 10;
        int unidade = numero % 10;

        System.out.println("A soma dos números é: " + (dezena + unidade));
        }
    }
