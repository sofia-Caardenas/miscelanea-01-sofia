package sofiaejercicios;
public class exercise {
    exercise e= new exercise();
    double num1, num2, num3,num4,num5 ; 
public static double calcularAreaTriangulo(double num1,double num2){
    double num3 = (num1 * num2) / 2;
    return num3;
}
public static double sumarNumeros(double num4,double num5){
  
    double num6 = num4 + num5;
    return num6;
    
}
public static double calcularPromedio(double num7,double num8,double num9){

    
    double num10 = (num7 + num8 + num9) / 3;
    return num10;

}
public static double elevarAlCuadrado(double num11){
      double num12 = Math.pow(num11, 2);
    return num12;
}
public static double convertirEurosADolares(double num13){
         double tasaCambio=1.8;
        double dolares = num13 * tasaCambio;
        return dolares;
    
}
public static double calcularAreaYPerimetroCuadrado(double num14){
    double area = num14 * num14;
    double perimetro = 4 * num14;
    System.out.println("El perímetro del cuadrado es: " + perimetro);
    return (area);

}
public static double calcularLongitudCircunferenciaYAreaCirculo(double num16){

    
    double num02 = 2 * Math.PI * num16;
    double num03 = Math.PI * Math.pow(num16, 2);
    System.out.println("La longitud de la circunferencia es: " + num02 );
   return (num03);
}
public static double calcularAreaLateralAreaTotalYVolumenCilindro(double num01, double num02){
    

    double num03 = 2 * Math.PI * num01 * num02;
    double num04 = 2 * Math.PI * num01 * (num01 + num02);
    double num05 = Math.PI * Math.pow(num01, 2) * num02;

    System.out.println("El área lateral del cilindro es: " + num03);
    System.out.println("El área total del cilindro es: " + num04);
    return (num05);
    
}
}
    
