import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_04 {
    public static void main(String[] args) {
        //04. Números pares até N
        int N = 10;

        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                numerosPares.add(i);
            }
        }
        System.out.println("Números pares: " + numerosPares);

        }
    }
