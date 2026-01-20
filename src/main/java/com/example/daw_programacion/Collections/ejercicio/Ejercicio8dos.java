import java.util.Scanner;
import java.util.ArrayDeque;

public class Ejercicio8dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> pila = new ArrayDeque<>();

        int n = scanner.nextInt();
        int aux = n;

        while (aux > 0){
            pila.push(aux%10);
            aux  /= 10;
        }

        boolean capicua = true;
        aux = n;

        while (aux > 0){
            int d = aux%10;
            if (d != pila.pop()){
                capicua = false;
                break;
            }
            aux /= 10;
        }

        if(capicua){
            System.out.println("El numero es capicua");
        }
        else{
            System.out.println("El numero no es capicua");
        }
    }
}