/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letritas;

/**
 *
 * @author DANIELA
 */
import java.util.*;

public class Letritas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una linea de texto:");
        String linea = sc.nextLine();
        System.out.println("Texto original: " + linea);

        // Obtener el caracter más frecuente
        char c = caracterMasFrecuente(linea.toLowerCase());
        System.out.println("Caracter más frecuente: " + c);

        // Sustituir las vocales por el caracter más frecuente
        String transformada = sustituirVocales(linea, c);
        System.out.println("Texto transformado: " + transformada);

        // Invertir el orden de las letras
        String invertida = invertirCadena(transformada);
        System.out.println("Texto invertido: " + invertida);
    }

    // Método para obtener el caracter más frecuente en una cadena
    public static char caracterMasFrecuente(String cadena) {
        char[] chars = cadena.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (Character.isLetter(c)) { // Solo contar letras
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        char caracter = ' ';
        int frecuencia = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > frecuencia) {
                caracter = entry.getKey();
                frecuencia = entry.getValue();
            }
        }
        return caracter;
    }

    // Método para sustituir las vocales de una cadena por un caracter dado
    public static String sustituirVocales(String cadena, char c) {
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esVocal(caracter)) {
                nuevaCadena += c;
            } else {
                nuevaCadena += caracter;
            }
        }
        return nuevaCadena;
    }

    // Método para determinar si un caracter es vocal
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Método para invertir el orden de una cadena
    public static String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }
}

