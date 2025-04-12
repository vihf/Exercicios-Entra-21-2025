import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_16 {
    public static void main(String[] args) {
        //16. Buscar um número na lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Scanner scaner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scaner.nextInt();

        if (numeros.contains(numero)) {
            System.out.println("Número " + numero + " está na lista");
        } else {
            System.out.println("Número " + numero + " não está na lista");
        }
    }
}