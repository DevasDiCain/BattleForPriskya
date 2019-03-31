/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author peper
 */
public class HojaSprites {

    private final int ANCHO;
    private final int ALTO;
    public final int[] pixeles;
    
    //Coleccion de hojas de Sprite
    
    public static HojaSprites mapaSecreto = new HojaSprites("/Recursos/Pantalla1.png",320,320);
    //Fin de coleccion de hojas de Sprite

    public HojaSprites(final String ruta, final int ancho, final int alto) {//ruta será la ruta donde se encuentra la imagen x ejemplo c/home/imagenes/imagen.jpg
        this.ANCHO = ancho;
        this.ALTO = alto;
        pixeles = new int[ancho * alto];//Iniciamos el array con las dimensiones de la imagen
        //ImageIO.read = LECTURA DE DATOS
        BufferedImage imagen;
        //Las operaciones de lectura pueden fallar así que la envolvemos en un try/catch
        try {
            imagen = ImageIO.read(HojaSprites.class.getResource(ruta)); //Creamos una imagen y le añadimos el valor de nuestra ruta, esdecir, donde se encuentra nuestra imagen
            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);//Volcamos la imagen en el array de manera de que cada pixel entrará en una de las posiciones del array
            //(Posicion x inicial Posicion y inicial ANCHO ALTO EL ARRAY QUE VAMOS A UTILIZAR CORRECCION DE POSICION Y TAMAÑO DE SCANEO)
        } catch (IOException ex) {
            Logger.getLogger(HojaSprites.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getANCHO() {
        return ANCHO;
    }

 
    
}
