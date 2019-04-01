/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 *
 * @author José Rodríguez Fernández
 */
public final class Sprite {

    private final int lado;
    private final HojaSprites hoja;

    private int x;//Eje horizontal
    private int y;//Eje vertical

    public int[] pixeles;
    
    //Colección de Sprites
    //Tamaño-Posicion X-PosicionY-hojadeSprites
     public static Sprite  cesped = new Sprite(32,0,0, HojaSprites.mapaSecreto);
    //Fin de Colección de Sprites

    public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja) {
        this.lado = lado;
        this.hoja = hoja;
        this.pixeles = new int[lado * lado];

        this.x = columna * lado;//Así hallamos la posicion exacta del sprite
        this.y = fila * lado;

        //Extracción del Sprite
        //De esta iremos accediendo a cada una de las posiciones de izquierda a derecha del array como si fuese una matriz bidimensional
        for (int y = 0; y < lado; y++) {//Y .. X son variables temporales, nda que ver con los atributos
            for (int x = 0; x < lado; x++) {
                pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getANCHO()];//x+y sería la coordenada del sprite pero como queremos empezar a atribuir valores al x , y de ese sprite tendremos que multiplicarlo por el lado
            }
        }
    }
}
