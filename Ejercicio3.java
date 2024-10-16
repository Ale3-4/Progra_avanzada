import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=0;

        System.out.println("Introduce un numero entero: ");
        num=input.nextInt();

        if(num>1){
            int a=0;
            int b=1;
            int i=1;
            System.out.println(a);
            System.out.println(b);

            while(i<num){
                System.out.println(i);
                a=b;
                b=i;
                i=a + b;

            }
        }
        else if(num==1){
            System.out.println("0");
            System.out.println("1");

        }
        else{
            System.out.println("0");
        }
        input.close();
    }
}
