/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Graficos.Pantalla;

/**
 *
 * @author José Rodríguez Fernández
 */
public  abstract class  Mapa {

    private int ancho;
    private int alto;

    private int[] cuadros;//tiles

    public Mapa(int ancho, int alto) {//Genera un mapa aleatorio
        this.ancho = ancho;
        this.alto = alto;

        cuadros = new int[ancho * alto];
        generarMapa();
    }

    public Mapa(String ruta) {//Genera un mapa previamente hecho
        cargarMapa(ruta);
    }

    public void generarMapa() {
    }

    public void cargarMapa(String ruta) {
    }
    public void actualizar(){
    
    }
    public void mostrar(int compensacionX , int compensacionY  , Pantalla pantalla){
    
    }
}
