/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_perro;

/**
 *
 * @author Dell
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos el objeto
        Perro perro1 = new Perro();
        
        //Llamamos métodos Set
        perro1.setColor("Café");
        perro1.setNombre("Firulais");
        perro1.setRaza("Pitbull");
        
        //Llamamos método que imprime
        perro1.imprimirDatos();
    }
    
}
