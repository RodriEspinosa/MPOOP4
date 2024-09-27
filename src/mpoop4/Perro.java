/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop4;

/**
 *
 * @author joser
 */
public class Perro {
     String color;
    String pelaje;
    int tam;
    String raza;
    int edad;
    
    
    public Perro(){
        color=null;
        pelaje=null;
        tam=0;
        raza=null;
        edad=0;
    }
    
    public Perro(String color, String pelaje, int tam, String raza, int edad){
        this.color=color;
        this.pelaje=pelaje;
        this.tam=tam;
        this.raza=raza;
        this.edad=edad;
    }
    
    public void imprimirPerro(){
        System.out.println("El perro es de color "+color);
        System.out.println("El pelaje del perro es "+pelaje);
        System.out.println("El tamaño del perro es "+tam);
        System.out.println("La raza del perro es "+raza);
        System.out.println("La edad del perro es "+edad+" años");
    
    }
    public void jugar(){
        System.out.println("El perro esta jugando");
    }
    
    public boolean comer(){
        return true;
    }
    
    public void correr(){
        System.out.println("El perro esta corriendo rapido");
    }
    
    public void morder(){
        System.out.println("El perro mordio a alguien");
    }
    
    public void saltar(float x, float y, float z){
        float a = x+2;
        float b = y+3;
        float c = z+4;
        System.out.println("El perro brincó de ("+x+","+y+","+z+") a ("+a+","+b+","+c+")");
    }
}
