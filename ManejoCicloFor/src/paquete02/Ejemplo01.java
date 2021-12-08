/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { //1<=5 v // 2<=5 v
            System.out.printf("%d\n", i); //1\n
                                         //2\n
            for (int j = 1; j <= 3; j++) { // 1<=3 v // 2<=3 v // 3 <= 3 // 4<=3
                System.out.printf("%d ", j*i); // 1  2 3
            }
            System.out.printf("\n-------------\n");
        }
    }
}
