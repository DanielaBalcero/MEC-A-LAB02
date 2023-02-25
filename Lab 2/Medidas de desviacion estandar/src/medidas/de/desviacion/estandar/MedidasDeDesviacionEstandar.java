/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medidas.de.desviacion.estandar;

/**
 *
 * @author DANIELA
 */
import java.util.Arrays;
import java.util.*;


public class MedidasDeDesviacionEstandar {
    static double numeros[];
    static double media;
    static double mediana;
    static double varianza;
    static double desviacion;
    static int n;
    static int contadorNumeroExiste;

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba cantidad de numeros a evaluar");
        n = sc.nextInt();
        
        numeros = new double[n];
        
        for(int posN = 0 ; posN < numeros.length; posN++){
            int n = (int) (Math.random()*10)+1;
            numeros[posN]=n;
        }
        Arrays.sort(numeros);
        
        System.out.print("Los números generados son: ");
        for(int posN = 0 ; posN < numeros.length; posN++){
            System.out.print(numeros[posN] + " ");
        }
        System.out.println();
        
        // Media
        double suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        media = suma / numeros.length;
        System.out.println("La media es: " + media);
        
        // Mediana
        if (numeros.length % 2 == 0){
            mediana = (numeros[numeros.length/2] + numeros[numeros.length/2 - 1]) / 2;
        } else {
            mediana = numeros[numeros.length/2];
        }
        System.out.println("La mediana es: " + mediana);
        
        // Varianza
        double sumatoria = 0;
        for (int i = 0; i < numeros.length; i++){
            sumatoria += Math.pow(numeros[i] - media, 2);
        }
        varianza = sumatoria / (numeros.length - 1);
        System.out.println("La varianza es: " + varianza);
        
        // Desviación estándar
        desviacion = Math.sqrt(varianza);
        System.out.println("La desviación estándar es: " + desviacion);
        
        // Moda
        int maxFrecuencia = 0;
        int moda = 0;
        for (int i = 0; i < numeros.length; ++i) {
            int frecuencia = 0;
            for (int j = 0; j < numeros.length; ++j) {
                if (numeros[j] == numeros[i])
                    ++frecuencia;
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = (int)numeros[i];
            }
        }
        System.out.println("La moda es: " + moda);
    }
}




