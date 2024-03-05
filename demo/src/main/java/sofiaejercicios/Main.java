package sofiaejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("Menú principal:");
            System.out.println("1. Operadores");
            System.out.println("2. condicionales");
            System.out.println("3. ciclos");
            System.out.println("0. Salir del programa");

            int opc = in.nextInt();

            switch (opc) {
                case 1:
                    menuop(in);
                    break;
                case 2:
                  menuco(in);
                break;
                case 0:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
        in.close();
    }

    public static void menuop(Scanner in) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú de operaciones básicas:");
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

            switch (opc) {
                case 1:
                    System.out.println("Ingrese la longitud de la base del triángulo:");
                    double num1 = in.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double num2 = in.nextDouble();
                    System.out.println(
                            "El área del triángulo es: " + exercise.operadores.calcularAreaTriangulo(num1, num2));
                    break;

                case 2:
                    System.out.println("Ingrese el primer numero:");
                    double num4 = in.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num5 = in.nextDouble();
                    System.out.println("El resultado de la suma es: " + exercise.operadores.sumarNumeros(num4, num5));
                    break;

                case 3:
                    System.out.println("Ingrese tres números separados por espacio:");
                    double num7 = in.nextDouble();
                    double num8 = in.nextDouble();
                    double num9 = in.nextDouble();
                    System.out.println("El promedio de los tres números es: "
                            + exercise.operadores.calcularPromedio(num7, num8, num9));
                    break;

                case 4:
                    System.out.println("Ingrese un número:");
                    double num11 = in.nextDouble();
                    System.out.println("El resultado de elevar " + num11 + " al cuadrado es: "
                            + exercise.operadores.elevarAlCuadrado(num11));
                    break;

                case 5:
                    System.out.println("Ingrese la cantidad en euros:");
                    double num13 = in.nextDouble();
                    System.out.println(num13 + " euros equivalen a " + exercise.operadores.convertirEurosADolares(num13)
                            + " dólares.");
                    break;

                case 6:
                    System.out.println("Ingrese la longitud del lado del cuadrado:");
                    double num14 = in.nextDouble();
                    System.out.println(
                            "El área del cuadrado es: " + exercise.operadores.calcularAreaYPerimetroCuadrado(num14));
                    break;

                case 7:
                    System.out.println("Ingrese el radio de la circunferencia: ");
                    double num16 = in.nextDouble();
                    System.out.println("El área del círculo es: "
                            + exercise.operadores.calcularLongitudCircunferenciaYAreaCirculo(num16));
                    break;

                case 8:
                    System.out.println("Ingrese el radio del cilindro:");
                    double num01 = in.nextDouble();
                    System.out.println("Ingrese la altura del cilindro:");
                    double num02 = in.nextDouble();
                    System.out.println("El volumen del cilindro es: "
                            + exercise.operadores.calcularAreaLateralAreaTotalYVolumenCilindro(num01, num02));
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }

    }

    public static void menuco(Scanner in) {
        boolean ok = true;

        while (ok) {
            System.out.println("Menú de condicionales:");
            System.out.println("1.Verificar si un numero es positivo o negativo");
            System.out.println("2.numero mayor y menor ");
            System.out.println("0.salir");
        
            int opc = in.nextInt();

            switch (opc) {
                case 1:
                System.out.println("Ingrese un número:");
                double num0 = in.nextDouble();
                System.out.println(exercise.condicionales.numeroposone(num0)); 
                break;
                case 2:
                System.out.println("Ingrese el primer número:");
                double num = in.nextDouble();
                System.out.println("Ingrese el segundo numero número:");
                double num1 = in.nextDouble();
                System.out.println(exercise.condicionales.nummaymen(num,num1)); 
                break;
                case 0:
                    ok = false;
                    break;
                }
}
            }
            private static void menu(Scanner in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menu'");
    }
        }

    

    


