import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_19 {
    public static void main(String[] args) {
        //19. Duplicar valores de uma lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(10);

        int fator = 2;
        for (int i = 0; i < numeros.size(); i++) {
            numeros.set (i, numeros.get(i) * fator);
        }
        System.out.println("Valores Duplicados: " + numeros);
    }
}