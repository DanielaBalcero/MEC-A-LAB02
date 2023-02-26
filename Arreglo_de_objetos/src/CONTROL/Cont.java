/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

//importamos el paquete modelo y la clase mod
import MODELO.Mod;
import javax.swing.JOptionPane;
import VISTA.Menu;
/**
 *
 * @author ANDRES RAMIREZ
 */
public class Cont {
    
    //creamos nuestro a reglo de tipo mod
    Mod arreglo [];
    private int posUltimo;
    private int tamaño;

    public Cont(int tam) {
        tamaño=tam;
        posUltimo=0;
        arreglo=new Mod[tamaño];
        }
    
    
  //  ahora vamos a ingresar datos a nuestro arreglo
    public void ingresar(){
        
        if(posUltimo<tamaño){
            Mod ob=new Mod();
           // llamamos nuestro metodo en el cual ingresamos los datos y se lo pasamos al arreglo
            ob=ob.Llenar();
            arreglo[posUltimo]=ob;
            posUltimo++;
            JOptionPane.showMessageDialog(null, "dato agregado");
        }else{
            JOptionPane.showMessageDialog(null, "dato no agregado");
        }    
    }
          public void mostrar(){
              String info="";
              //Con este for recorremos el arreglo
              for (int i = 0; i < tamaño; i++) {
                info=info+""+ arreglo[i]+"\n";
                  
              }
              //aqui imprimimos la informacion el el text area
              Menu.jTextArea1.setText(info);
          }
                  
}
