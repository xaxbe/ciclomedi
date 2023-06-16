/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclomedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author xaxbe
 */

public class CicloMedia {
    public void Med(){
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int numero;
        double media;
        String continuar;

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
            numeros.add(numero);

            System.out.print("¿Desea ingresar otro número? (S/N): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("S"));

        media = calcularMedia(numeros);

        System.out.println("Conjunto de números ingresados: " + numeros);
        System.out.println("Media: " + String.format("%.2f", media));

        sc.close();
    }

    public static double calcularMedia(List<Integer> numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.size();
    }
    public static void main(String[] args) {
        CicloMedia Ciclo = new CicloMedia();
        Ciclo.Med();
        
    }
}
