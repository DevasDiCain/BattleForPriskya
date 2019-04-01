/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 *@author José Rodríguez Fernández
 */
public final class Teclado implements KeyListener {//Implementamos el paquete KeyListener

    private final static int NUMEROTECLAS = 120;
    private final boolean[] TECLAS = new boolean[NUMEROTECLAS];

    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;
    
    public void actualizar(){
        //Asignamos las teclas W, S, A, D 
        arriba = TECLAS[KeyEvent.VK_W];
        abajo = TECLAS[KeyEvent.VK_S];
        izquierda = TECLAS[KeyEvent.VK_A];
        derecha = TECLAS [KeyEvent.VK_D];
    }

    //Métodos implementados por KeyListener
    public void keyTyped(KeyEvent e) {//Pulsamos tecla sin soltarla
 

    }

    public void keyPressed(KeyEvent e) {//Soltar la tecla que hemos pulstado
         TECLAS[e.getKeyCode()]=true;//La tecla pulsada se pone en True
    }

    public void keyReleased(KeyEvent e) {//Pulsar-Soltar
         TECLAS[e.getKeyCode()]=false;//La tecla pulsada vuelve a False
    }

    
}
