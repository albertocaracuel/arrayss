/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientealbertocaracuel;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Serpiente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = null;
        int num;
        int numk;
        int contador = 0;
        int medicion = 0;
        do {

            System.out.println("Introduce el numero de mediciones");
            num = sc.nextInt();
            int[] array1 = new int[num];

            for (int i = 0; i < array1.length; i++) {
                System.out.println("Introduce las mediciones");
                array1[i] = sc.nextInt();
            }

            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " - ");
            }

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 1) {

                    contador++;
                    medicion = i;
                }
            }

            System.out.println("Resultado : El periodo óptimo tiene longitud\n"
                    + contador + "y comienza en la medición" + medicion);

            sc.nextLine();
            System.out.println("¿Desea realizar otra medición?");
            palabra = sc.nextLine();

        } while (palabra.equals("si"));

        System.out.println("Fin del programa");
    }
}
