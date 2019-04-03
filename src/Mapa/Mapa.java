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
public abstract class Mapa {

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

    public void actualizar() {

    }

    public Cuadro obtenCuadro(final int x, final int y) {
        if(x < 0 || y < 0 || x >= ancho || y >= alto){
            return Cuadro.VACIO;
        }
        switch (cuadros[x + y * ancho]) {
            case 0:
                return Cuadro.CESPED;
            case 1:
                return Cuadro.PARED_DORADA;
            case 2:
                return Cuadro.CESPED;
            case 3:
                return Cuadro.CESPED;

            default:
                return Cuadro.VACIO;
        }
        
    }

    public void mostrar(int compensacionX, int compensacionY, Pantalla pantalla) {
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
        pantalla.estableceDiferencia(compensacionX, compensacionY);
        //Nos permitirá saber en que parte del mapa nos encontramos
        int oeste = compensacionX >> 5;//Lo divido entre 32 porque es el tamaño de cada tiles y así hacemos que el personaje se mueva por pixel y no por tile
        int este = (compensacionX + pantalla.getANCHO()) >> 5;
        int norte = compensacionY >> 5;
        int sur = (compensacionY + pantalla.getALTO()) >> 5;

        for (int y = norte; y < sur; y++) {
            for (int x = oeste; x < este; x++) {//Recorremos todo el vector de tiles para decidir que tile está en cada sitio
                obtenCuadro(x, y).mostrar(x, y, pantalla);
            }
        }
    }

}
