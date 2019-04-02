/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa.cuadro;

import Graficos.Pantalla;
import Graficos.Sprite;

/**
 *
 * @author jose
 */
public class CuadroCesped extends Cuadro {

    public CuadroCesped(Sprite sprite) {
        super(sprite);
        
    }
    
    public void mostrar(int x , int y , Pantalla pantalla){
        pantalla.mostrarCuadro(x, y, this);
    }
    
    
   
}
