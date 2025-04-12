import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_15 {
    public static void main(String[] args) {
        //15. Média dos valores de um ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        int soma = 0;
        for (int num : numeros) {
            soma+= num;
        }
        double media = soma / (double) numeros.size();
        System.out.println("Média dos números do ArrayList: " + media );
    }
}