/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectrodomestico;

import java.util.ArrayList;

/**
 *
 * @author adolfoparada
 */
public class Ejecutar {

    //Creamos un array de Electrodomesticos
    public static ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listaElectrodomesticos.add(new Electrodomestico(200, 60, 'C', "Verde"));
        listaElectrodomesticos.add(new Lavadora(150, 30));
        listaElectrodomesticos.add(new Television(500, 80, 'E', "negro", 42, false));
        listaElectrodomesticos.add(new Electrodomestico());
        listaElectrodomesticos.add(new Electrodomestico(600, 20, 'D', "gris"));
        listaElectrodomesticos.add(new Lavadora(300, 40, 'Z', "blanco", 40));
        listaElectrodomesticos.add(new Television(250, 70));
        listaElectrodomesticos.add(new Lavadora(400, 100, 'A', "verde", 15));
        listaElectrodomesticos.add(new Television(200, 60, 'C', "naranja", 30, true));
        listaElectrodomesticos.add(new Electrodomestico(50, 10));

        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;

        //Recorremos el array invocando el metodo precioFinal
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
            if (electrodomestico instanceof Electrodomestico) {
                /*
                * El operador instanceof sirve para conocer si un objeto es de un tipo determinado. 
                * Por tipo, nos referimos a clase o interfaz (interface)
                 */
                sumaElectrodomesticos += electrodomestico.precioFinal();
                System.out.println("Precio Final Electrodomestico: " + electrodomestico.precioFinal());
            }
            if (electrodomestico instanceof Lavadora) {
                sumaLavadoras += electrodomestico.precioFinal();
                //System.out.println("Precio Final Lavadora: "+ electrodomestico.precioFinal());
            }
            if (electrodomestico instanceof Television) {
                sumaTelevisiones += electrodomestico.precioFinal();
                //System.out.println("Precio Final Television: "+ electrodomestico.precioFinal());
            }
        }
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de " + sumaTelevisiones);
    }
}
//ya lo guardo tambien lo guardo ahora solo falta imprimir 

