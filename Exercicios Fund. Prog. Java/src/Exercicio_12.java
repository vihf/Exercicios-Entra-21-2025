import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_12 {
    public static void main(String[] args) {
        //12.  Soma dos elementos de um ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma dos numeros é: " + soma);
    }
}