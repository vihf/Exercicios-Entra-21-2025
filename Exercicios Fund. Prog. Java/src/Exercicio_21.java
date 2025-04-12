import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_21 {
    public static void main(String[] args) {
        //21. Ordenar lista decrescente
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(17);
        numeros.add(89);
        numeros.add(55);
        numeros.add(91);
        numeros.add(5);
        numeros.add(1);

        ArrayList<Integer> decrescente = new ArrayList<>();
        Collections.sort (numeros, Collections.reverseOrder());
        System.out.println(numeros);
    }
}