/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa.cuadro;

import Graficos.HojaSprites;
import Graficos.Pantalla;
import Graficos.Sprite;

/**
 *
 * @author José Rodríguez Fernández
 */
public abstract class Cuadro {//Tiles

    private int x;
    private int y;

    public Sprite sprite;
    
    //Coleccion de cuadros
   
    public static final Cuadro CESPED = new CuadroCesped(Sprite.CESPED);
    public static final Cuadro PARED_DORADA = new CuadroParedDorada(Sprite.PARED_DORADA);
    //Fin de colección 

    public Cuadro(Sprite sprite) {
        this.sprite = sprite;
    }
    
    public void mostrar(int x  , int y , Pantalla pantalla){
          pantalla.mostrarCuadro(x << 5, y << 5, this);//BitShifting x=<<   /==>>
    }
    
    public boolean solido(){
        return false;
    }

}
