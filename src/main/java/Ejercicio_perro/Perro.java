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
public class Perro {
    //Atributos
    private String nombre;
    private String raza;
    private String color;
    
    //Getter y Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getRaza(){
        return raza;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    //Constructores
    public Perro(){
       
    }
    //Métodos
    public void imprimirDatos(){
        System.out.println("El perro se llama "+this.getNombre()+", su raza es "+this.getRaza()+" y es de color "+this.getColor()+".");
    }
}
