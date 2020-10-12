/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectrodomestico;

/**
 *
 * @author adolfoparada
 */

public class Lavadora extends Electrodomestico{
  
    //Constantes
  
    /**
     * Carga por defecto
     */
    private final static int CARGA_DEF=5;
  
    //Atributos
  
    /**
     * Carga de la lavadora
     */
    private int carga;
  
    //Constructor
  
    /**
     * Contructor por defecto
     */
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    
        //esto lo que hace es no cargar el cuadro de texto que no hace falta y cambiarle el nombre a la etiqueta a "carga"
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
    
    
    //Métodos publicos
  
    /**
     * Devuelve la carga de la lavadora
     * @return
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }  
    //esto no se si se pueda pero lo vamos a intentar asi 

    
}
    

