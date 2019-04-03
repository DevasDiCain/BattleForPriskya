/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Mapa.cuadro.Cuadro;

/**
 *
 * @author José Rodríguez Fernández
 */
public class Pantalla {

    private final int ANCHO;
    private final int ALTO;
    
    private int diferenciaX;
    private int diferenciaY;

    public final int[] pixeles;

    //Temporal
    
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

    //Temporal
    
    //FIN TEMPORAL

    public void mostrarCuadro(int compensacionX, int compensacionY, Cuadro cuadro) {
        
        compensacionX -= diferenciaX;
        compensacionY -= diferenciaY;//Esto nos permite saber que desplazamiento ha tenido nuestro personaje respecto al mapa
        for (int y = 0; y < cuadro.sprite.obtenerLado(); y++) {
            int posicionY = y + compensacionY;
            for (int x = 0; x < cuadro.sprite.obtenerLado(); x++) {
                int posicionX = x + compensacionX;
                if(posicionX < 0 || posicionX > ANCHO || posicionY < 0 || posicionY > ALTO){
                    break;
                }
                pixeles[posicionX + posicionY * ANCHO] = cuadro.sprite.pixeles[x + y * cuadro.sprite.obtenerLado()];
            }
        }
    }
    public void estableceDiferencia(final int diferenciaX,final int diferenciaY){
        this.diferenciaX = diferenciaX;
        this.diferenciaY = diferenciaY;
    }
    public int getANCHO() {
        return ANCHO;
    }

    public int getALTO() {
        return ALTO;
    }
    

}
