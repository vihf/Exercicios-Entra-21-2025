import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_13 {
    public static void main(String[] args) {
        //13. Maior e menor número em uma lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("Maior número é: " + maior);
        System.out.println("Menor número é: " + menor);
    }
}