package ejercicio17;

import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {
        double radio,area,circunferencia;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo");
        radio = input.nextDouble();
        area = Math.PI * Math.pow(radio,2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.println("Su area es igual a " + area);
        System.out.println("Su longitud de circunferencia es igual a " + circunferencia);
    }
    
}
