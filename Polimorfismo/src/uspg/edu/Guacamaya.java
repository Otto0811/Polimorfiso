/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Otto
 */
public class Guacamaya extends Animal{
    String color;

    public Guacamaya(String color, String nombre, String alimentacion, int edad) {
        super(nombre, alimentacion, edad);
        this.color = color;
    }

    public Guacamaya(String color){
        
    }
    
    
   

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void Mostrar(){
        System.out.println(getNombre()+"-"+getAlimentacion()+"-"+getEdad()+"-"+getColor());
    }

    @Override
    public void habitat() {
        System.out.println("America del Sur y Centroamerica");
    }

    @Override
    public void estado() {
        System.out.println("En Cautiverio, en el Zoologico la Aurora.");
    }
  
    
    
    
    
   
 
    
    
}
