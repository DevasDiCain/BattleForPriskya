/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Escena {
    
    public String tituloEscena;
    public int secuencia;//Cada escena tendrá una introducción, un desarrollo y un desenlace
    public String descripcion;

    public Escena(String tituloEscena, int secuencia, String descripcion) {
        this.tituloEscena = tituloEscena;
        this.secuencia = secuencia;
        this.descripcion = descripcion;
    }

    public String getTituloEscena() {
        return tituloEscena;
    }

    public void setTituloEscena(String tituloEscena) {
        this.tituloEscena = tituloEscena;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Métodos
    
    
    //Escenas
    public void Escena1(){
        
    }
}
