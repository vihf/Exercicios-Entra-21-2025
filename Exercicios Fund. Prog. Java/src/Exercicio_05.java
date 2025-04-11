import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio_05 {
    public static void main(String[] args) {
        //05. Números ímpares até N
        int N = 10;

        int i = 1;
        while(i <= N) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
