/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Graficos.Pantalla;
import Mapa.cuadro.Cuadro;

/**
 *
 * @author José Rodríguez Fernández
 */
public  abstract class  Mapa {

    protected int ancho;
    protected int alto;

    protected int[] cuadros;//tiles

    public Mapa(int ancho, int alto) {//Genera un mapa aleatorio
        this.ancho = ancho;
        this.alto = alto;

        cuadros = new int[ancho * alto];
        generarMapa();
    }

    public Mapa(String ruta) {//Genera un mapa previamente hecho
        cargarMapa(ruta);
    }

    protected void generarMapa() {
    }

    public void cargarMapa(String ruta) {
    }
    public void actualizar(){
    
    }
    public void mostrar(int compensacionX , int compensacionY  , Pantalla pantalla){
        //Bitshifting-> Nos permitrá mostrar mas frames por segundo
        //               Las operaciones matemáticas se harán a un ritmo bastante alto
        //               Las operaciones se realizan por transferencia de bits
        /*
            128   64    32    16    8     4    2    1    0
            0      0     0     0    0     0    0    0    0
            Primero hacemos la division o la multiplicacion
        128/32 == 128 >> 5
        700/10 == 700 >> 7
        */
        int oeste = compensacionX >> 5;//Lo divido entre 32 porque es el tamaño de cada tiles y así hacemos que el personaje se mueva por pixel y no por tile
        int este = (compensacionX + pantalla.getANCHO())>> 5;
        int norte = compensacionY >> 5;
        int sur =(compensacionY + pantalla.getALTO()) >> 5 ;
    }
    public Cuadro obtenCuadro(int x , int y){
        switch (x+y*ancho){
            case 0: return Cuadro.CESPED;
            
            
            default: return null;
    }
    }
}
