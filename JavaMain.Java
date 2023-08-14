import java.util.Scanner;

public class JavaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de los números es: " + suma);

        System.out.println("¡Hallo, Welt!"); // ¡Hola, mundo!, en Alemán
    }
}
