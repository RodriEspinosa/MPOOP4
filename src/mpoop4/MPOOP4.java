/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop4;

/**
 *
 * @author joser
 */
public class MPOOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto = new Punto();
        punto.imprimePunto(); //impresion del objeto punto con los valores del constructor vacio
        Punto punto2 = new Punto(1,2,"Punto 2");
        punto2.imprimePunto(); //Impresion del objeto con los parametros que le mandamos, con el constructor que ya tiene definidas las variables
        
        //asignación de los valores para el constructor con valores vacios(inflando el objeto)
        punto.x=20;
        punto.y=100;
        punto.nombre="Punto 1";
        punto.imprimePunto(); //impresion del objeto punto con los valores asignados manualmente
        
        System.out.println(punto);
        
        System.out.println("\n\n");
        
        //Estructura del perro
        Perro perro = new Perro();
        perro.color = "gris";
        perro.pelaje = "liso";
        perro.tam = 5;
        perro.raza = "Gran danes";
        perro.edad = 6;
        perro.imprimirPerro();
        
        perro.jugar();
        if (perro.comer()) {
            System.out.println("El perro esta comiendo");
        }
        perro.correr();
        perro.saltar(2.8f, 3.2f, 4.4f);

    }
    
}
