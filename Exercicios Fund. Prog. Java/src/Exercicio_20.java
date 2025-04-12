import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_20 {
    public static void main(String[] args) {
        //20. Ordenar lista crescente
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(17);
        numeros.add(89);
        numeros.add(55);
        numeros.add(91);
        numeros.add(5);
        numeros.add(1);

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}