/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package base.de.datos.carros;

/**
 *
 * @author Estudiante
 */
public class BaseDeDatosCarros {
    private String Marca;
    private int Modelo;
    private String Color;
    private float Kilometraje;
    
    public BaseDeDatosCarros(String Marca, int Modelo,String Color, float Kilometraje){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Kilometraje = Kilometraje;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public float getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(float Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
