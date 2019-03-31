/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 *
 * @author José
 */
public class Pantalla {

    private final int ANCHO;
    private final int ALTO;

    public final int[] pixeles;
    
    //Temporal
     private final int LADO_SPRITE=32;//Indica que tamaño tiene nuestro sprite
     private final int MASCARA_SPRITE = LADO_SPRITE -1;//
    //Fin Temporal

    public Pantalla(final int ancho, final int alto) {
        this.ALTO = alto;
        this.ANCHO = ancho;

        this.pixeles = new int[ancho * alto];
    }

    public void limpiar() {//Este método se encargará de redibujar de  negro  la pantalla en cada actualización para que no se arrastren graficos
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = 0; //0 es equivalente al color Negro absoluto
        }
    }
    
    public void mostrar(final int compensacionX, final int compensacionY){//Este metodo se encargará de redibujar la pantalla
        //La compensación será el movimiento de nuestro personaje(la ubicación en cada actualización)
    
            for(int y = 0 ;  y < ALTO ; y ++){//Este primer bucle redibujará la posicion Y  ,tomando eencuenta el alto
                int posicionY = y + compensacionY;
                if( posicionY < 0 || posicionY >= ALTO){
                    continue;//Este comando  sale de esa vuelta del for Y y pasaría al bucle del for  X || Es para no salirnos del mapa
                }
                for (int x = 0 ; x < ANCHO ; x ++){//Este segundo bucle anidado redibujará la posición X, tomando encuenta el ancho
                    int posicionX = x + compensacionX;
                    if(posicionX < 0  || posicionX >= ANCHO){
                        continue;
                    }
                    
                    pixeles[posicionX + posicionY * ANCHO] =  Sprite.cesped.pixeles[(x & MASCARA_SPRITE)+(y & MASCARA_SPRITE)* LADO_SPRITE];//Temporal
                }
            }
    }

}
