/*
// Generar un programa que permita calcular la potencia de un 
// número haciendo uso de multiplicaciones sucesivas
// Dado un número elevado a la potencia n mediante multiplicaciones 
// sucesivas es igual a
// numero elevados n = numero * numero * ... hasta n veces
// Ejemplo: 4 elevado 3
// numero = 4
// potencia = 3
// 4 * 4 * 4
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
       
        // 8. potencia <-- 3
        
        // 9. resultado <-- 1
        resultado = 1;
        
        System.out.println("ingrese el valor del numero");
        numero = entrada.nextInt();
         System.out.println("ingrese el valor de la potencia");
        potencia = entrada.nextInt();

        
        for (int  contador = 1; contador <= potencia; contador++) {
            resultado = resultado * numero;
        }
        System.out.printf("%d\n", resultado);

    }

}
