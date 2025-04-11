import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_10 {
    public static void main(String[] args) {
        //10.  Contagem regressiva de N até 0
        ArrayList<Integer> regressiva = new ArrayList<>();

        for (int i = 10; i >= 0; i--)
            regressiva.add(i);
        System.out.println(regressiva);
    }
}