package sofiaejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Calcular área de triángulo");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Calcular promedio de tres números");
            System.out.println("4. Elevar un número al cuadrado");
            System.out.println("5. Convertir euros a dólares");
            System.out.println("6. Calcular área y perímetro de un cuadrado");
            System.out.println("7. Calcular longitud de circunferencia y área de un círculo");
            System.out.println("8. Calcular área lateral, área total y volumen de un cilindro");
            System.out.println("0. Salir del programa");

            int opc = in.nextInt();

            switch(opc) {
                case 1:
                    System.out.println("Ingrese la longitud de la base del triángulo:");
                    double num1 = in.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double num2 = in.nextDouble();
                    System.out.println("El área del triángulo es: " + exercise.calcularAreaTriangulo(num1,num2));
                    break;

                case 2:
                    System.out.println("Ingrese el primer numero:");
                    double num4 = in.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num5 = in.nextDouble();
                    System.out.println("El resultado de la suma es: " + exercise.sumarNumeros(num4, num5));
                    break;

                case 3:
                    System.out.println("Ingrese tres números separados por espacio:");
                    double num7 = in.nextDouble();
                    double num8 = in.nextDouble();
                    double num9 = in.nextDouble();
                    System.out.println("El promedio de los tres números es: " + exercise.calcularPromedio(num7,num8,num9));
                    break;

                case 4:
                    System.out.println("Ingrese un número:");
                    double num11 = in.nextDouble();
                    System.out.println("El resultado de elevar " + num11 + " al cuadrado es: " + exercise.elevarAlCuadrado(num11));
                    break;

                case 5:
                    System.out.println("Ingrese la cantidad en euros:");
                    double num13 = in.nextDouble();
                    System.out.println(num13 + " euros equivalen a " + exercise.convertirEurosADolares(num13) + " dólares.");
                    break;

                case 6:
                    System.out.println("Ingrese la longitud del lado del cuadrado:");
                    double num14 = in.nextDouble();
                    System.out.println("El área del cuadrado es: " + exercise.calcularAreaYPerimetroCuadrado(num14));
                    break;

                case 7:
                    System.out.println("Ingrese el radio de la circunferencia: ");
                    double num16 = in.nextDouble();
                    System.out.println("El área del círculo es: " + exercise.calcularLongitudCircunferenciaYAreaCirculo(num16));
                    break;

                case 8:
                    System.out.println("Ingrese el radio del cilindro:");
                    double num01 = in.nextDouble();
                    System.out.println("Ingrese la altura del cilindro:");
                    double num02 = in.nextDouble();
                    System.out.println("El volumen del cilindro es: " + exercise.calcularAreaLateralAreaTotalYVolumenCilindro(num01, num02));
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
        in.close();
    }
}
