/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

//IMPORTAMOS NUESTRO PAQUETE VISTA PARA PODER LLAMAR LAS CAJAS EN DONDE INGRESAREMOS LA INFORMACION 
import VISTA.Menu;


/**
 *
 * @author ANDRES RAMIREZ
 */
public class Mod {

    //DECLARAMOS NUESTROS ATRIBUTOS 
   private String id;
   private String nom;
   private String ape;

    //CREAMOS ESTE METODO CONSTRUCTOR Y DECLARAMOS LAS VARIABLES
    public Mod() {
        id = "";
        nom = "";
        ape = "";
    }

    //EN ESTE CONSTRUCTOR PARAMOS LOS DATOS A INGRESAR
    public Mod(String id, String nom, String ape) {
        this.id = id;
        this.nom = nom;
        this.ape = ape;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public Mod Llenar() {
     //DECLARAMOS Y LLAMAMOS NUESTRAS CAJAS DE LA INTERFAZ
        String id = String.valueOf(Menu.jTextField1.getText());
        String nom = String.valueOf(Menu.jTextField2.getText());
        String ape = String.valueOf(Menu.jTextField3.getText());
        //PASAMOS LOS DATOS AL METODO CONSTRUCTOR 
        Mod mo = new Mod(id, nom, ape);
        //LE DECIMOS QUE NOS RETORNE LOS DATOS INGRESADOS 
        return mo;
    }

    @Override
    public String toString() {
        return  id + ", " + nom + ", " + ape ;
    }

}
