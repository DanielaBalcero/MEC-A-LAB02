/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base.de.datos.carros;

/**
 *
 * @author Estudiante
 */
public class Atributos {
    public static String marca [] = {"Acura", "Alfa Romeo", "Audi", "Baic", "BAW", "BMW", "Brilliance", "BYD", "Cadillac", "Changan", "Changhe", "Chery", "Chevrolet", "Chrysler", "Citroën", "Daihatsu", "DFSK", "Dodge", "Dongfeng", "DS", "FAW", "Ferrari", "Fiat", "Ford", "Foton", "Geely", "GMC", "Gonow", "Great Wall", "Haima", "Haval", "Honda", "Hummer", "Hyundai", "Infiniti", "JAC", "Jaguar", "Jeep", "Kenbo", "Kia", "Land Rover", "Lexus", "Lifan", "Mahindra", "Maserati", "Maxus", "Mazda", "Mercedes-Benz", "MG", "Mini", "Mitsubishi", "Nissan", "Opel", "Peugeot", "Porsche", "RAM", "Renault", "SEAT", "Skoda", "Ssangyong", "Subaru", "Suzuki", "Toyota", "UAZ", "Volkswagen", "Volvo", "Wuling", "Zhongxing", "Zotye"};
    private static String color[] = {"Rojo", "naranja", "amarillo", "verde", "azul", "violeta", "rosa", "marrón", "gris", "negro", "blanco", "plateado", "dorado", "bronce", "turquesa", "beige", "crema", "burdeos", "magenta", "añil", "caqui", "coral", "marfil", "mostaza", "verde oliva", "rosa pastel", "lavanda", "menta", "salmón", "terracota"};
    public static int aleatorio(int a, int b) {
        return a + (int)(Math.random()*(b - a + 1));
    }
    public static String getMarca() {
     return marca[aleatorio(0, marca.length)];
    }
    public static String getColor() {
         return color[aleatorio(8, color.length)];
    }
}
