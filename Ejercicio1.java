import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Calculadora calc= new Calculadora();

        System.out.println("Introduce el primer numero:");
        double num1= input.nextDouble();
        calc.setX(num1);

        System.out.println("Introduce el segundo numero:");
        double num2= input.nextDouble();
        calc.setY(num2);

        double sum= calc.suma();

        System.out.print("Tu resultado es: " + sum);


    }
}
