package sofiaejercicios;

public class exercise {
    public static class operadores {
        public static double calcularAreaTriangulo(double num1, double num2) {
            double num3 = (num1 * num2) / 2;
            return num3;
        }

        public static double sumarNumeros(double num4, double num5) {

            double num6 = num4 + num5;
            return num6;

        }

        public static double calcularPromedio(double num7, double num8, double num9) {

            double num10 = (num7 + num8 + num9) / 3;
            return num10;

        }

        public static double elevarAlCuadrado(double num11) {
            double num12 = Math.pow(num11, 2);
            return num12;
        }

        public static double convertirEurosADolares(double num13) {
            double tasaCambio = 1.8;
            double dolares = num13 * tasaCambio;
            return dolares;

        }

        public static double calcularAreaYPerimetroCuadrado(double num14) {
            double area = num14 * num14;
            double perimetro = 4 * num14;
            System.out.println("El perímetro del cuadrado es: " + perimetro);
            return (area);

        }

        public static double calcularLongitudCircunferenciaYAreaCirculo(double num16) {

            double num02 = 2 * Math.PI * num16;
            double num03 = Math.PI * Math.pow(num16, 2);
            System.out.println("La longitud de la circunferencia es: " + num02);
            return (num03);
        }

        public static double calcularAreaLateralAreaTotalYVolumenCilindro(double num01, double num02) {

            double num03 = 2 * Math.PI * num01 * num02;
            double num04 = 2 * Math.PI * num01 * (num01 + num02);
            double num05 = Math.PI * Math.pow(num01, 2) * num02;

            System.out.println("El área lateral del cilindro es: " + num03);
            System.out.println("El área total del cilindro es: " + num04);
            return (num05);

        }
    }

    public static class condicionales {
        public static String numposneg(double res) {
            String val;

            if (res > 0) {
                val = res + " es positivo.";
            } else {
                val = res + " es negativo.";
            }

            return val;
        }

        public static String numasmen(double num1, double num2) {
            String val;
            if (num1 < num2) {
                val = "El numero " + num1 + " es menor,  el " + num2 + " es el mayor";
            } else {
                val = "El numero " + num2 + " es menor, el " + num1 + " es el mayor";
            }
            return val;
        }

        public static String mayomentres(double numi, double nume, double numo) {
            String resultado;
            double mayor = numi;
            if (nume > mayor) {
                mayor = nume;
            }
            if (numo > mayor) {
                mayor = numo;
            }

            double menor = numi;
            if (nume < menor) {
                menor = nume;
            }
            if (numo < menor) {
                menor = numo;
            }

            resultado = "El mayor número es el " + mayor + " y el menor es el " + menor + ".";
            return resultado;
        }

        public static double sumaoresta(double numc, double numd) {
            double res;

            if (numc < numd) {
                res = numc + numd;
            } else {
                res = numd - numc;
            }
            System.out.println("El resultado es: ");
            return res;
        }

        public static double dividir(double numA, double numB) {
            double res;

            if (numB == 0) {
                System.out.println("No se puede dividir entre 0, la división no es posible");
                res = Double.NaN;
            } else {
                res = numA / numB;
                System.out.println("El cociente entre estos dos números es: ");
            }
            return res;
        }

        public static double sumomul(double numa, double numb) {
            double res;

            if (numa < 0 || numb < 0) {
                res = numa + numb;
                System.out.println("La suma entre estos dos números es: ");
            } else {
                res = numa * numb;
                System.out.println("La multiplicación entre estos dos números da: ");
            }

            return res;
        }

        public static String anbisi(Double año) {
            String res;
            if (año % 4 == 0) {
                if (año % 100 == 0) {
                    if (año % 400 == 0) {
                        res = año + " sí es bisiesto.";
                    } else {
                        res = año + " no es bisiesto.";
                    }
                } else {
                    res = año + " es bisiesto.";
                }
            } else {
                res = año + " no es bisiesto.";
            }
            return res;
        }
    }
}
