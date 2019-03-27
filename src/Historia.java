
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Historia {
    
    private String titulo;
    private int numEscenas;//Número de escenas
    private String dificultad;//Normal-Heroico-Mítico
    private ArrayList<Escena>trama;//Curso de la historia

    public Historia(String titulo, int numEscenas, String dificultad, ArrayList<Escena> trama) {
        this.titulo = titulo;
        this.numEscenas = numEscenas;
        this.dificultad = dificultad;
        this.trama = trama;
    }

   
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumEscenas() {
        return numEscenas;
    }

    public void setNumEscenas(int numEscenas) {
        this.numEscenas = numEscenas;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    
    //Métodos
    
    //Iniciar historia
    
    public void iniciarHistoria(){
        for(Escena x : trama){
            System.out.println(x);
        }
    }
}
