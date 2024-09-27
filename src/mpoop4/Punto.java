/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop4;

/**
 *
 * @author joser
 */
public class Punto {
     int x;
    int y;
    String nombre;
    
    public Punto(){//Constructor para los valores vacios 
        x=0;
        y=0;
        nombre=null;
    }
    
    public Punto(int x, int y, String nombre){//Sobre escritura de los valores del constructor que ya recibe los parametros que mandemos
        this.x=x;
        this.y=y;
        this.nombre=nombre;
    }
    
    public void imprimePunto(){ //Creamos el metodo
        System.out.println("(x="+x+" , y="+y+") Nombre ="+nombre);
    }
}
