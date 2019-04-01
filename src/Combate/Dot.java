package Combate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Dot extends Habilidad {
    
        private String tipo;// Tipo de dot (veneno,corrupcion,sombra,fuego...)
        private int dañoPorSegundo;//Daño por segundo
        private int duracion;//Turnos que durará

    public Dot(String tipo, int dañoPorSegundo, int duracion, String nombre, int daño) {
        super(nombre, daño);
        this.tipo = tipo;
        this.dañoPorSegundo = dañoPorSegundo;
        this.duracion = duracion;
    }
    
    


  
        
        
}
