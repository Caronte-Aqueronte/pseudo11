import java.util.Scanner;

public class Seudo11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int contadorimpar = 0;
        int contadornumeros = 0;
        int suma = 0;
        int contadorpar = 0;
        int mayorque = 0;
        double promedio;
        for (int x = 0; x < 10; x++) {
            System.out.println("Ingrese un numero de 0 a 36");
            num = scanner.nextInt();
            while (num > 36 || num < 0) {
                System.out.println("Ingrese un numero de 0 a 36");
                num = scanner.nextInt();
            }
            if (num % 2 != 0) {
                contadorimpar++;
            }
            if (num % 2 == 0 && num != 0) {
                suma = suma + num;
                contadorpar++;
            }
            if (num >= 13 && num <= 24) {
                contadornumeros++;
            }
            if (num > mayorque) {
                mayorque = num;
            }
        }
        if (contadorpar == 0) {
            contadorpar = 1;
        }
        promedio = suma / contadorpar;
        System.out.println("El numero de digitos impares es de " + contadorimpar);
        System.out.println("El promedio de los digitos pares es de " + promedio);
        System.out.println("La cantidad de digitos comprendidos entre 13 y 24 es de " + contadornumeros);
        System.out.println("El numero mayor ingresado es " + mayorque);
    }
}