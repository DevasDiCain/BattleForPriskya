
import Combate.Turno;
import Personajes.mobs.Campeon;
import Personajes.mobs.DPS;
import Personajes.mobs.Enemigo;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *@author José Rodríguez Fernández
 */
public class Escena {

    public String tituloEscena;
    public int secuencia;//Cada escena tendrá una introducción, un desarrollo y un desenlace
    public String descripcion;

    public Escena() {
    }

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
    public void CombateDPS(DPS campeon, Enemigo enemigo) {//Combate para hijos DPS
        Turno turno = new Turno();
        JOptionPane.showMessageDialog(null, "Comienza la batalla entre \n " + campeon.getName() + "   VS   " + enemigo.getNombre());
        if (campeon.getCeleridad() > enemigo.getCeleridad()) {
            JOptionPane.showMessageDialog(null, campeon.getName() + " es tu Turno");
            int eleccion = turno.Accion();
            switch (eleccion) {
                case 1:
                    campeon.GolpearMOB(enemigo);
                    break;
                case 2:
                    Object[] skills = {"Potenciar", "Ruptura", "Alvaro Paquete"};
                    Object opcion = JOptionPane.showInputDialog(null, "¿Qué habilidad desea lanzar?", "Elige", JOptionPane.DEFAULT_OPTION, null, skills, skills[0]);
                    if (opcion.equals("Potenciar")) {
                        campeon.Potenciar();
                    } else if (opcion.equals("Ruptura")) {
                        campeon.Ruptura(enemigo);
                    }else {System.out.println("FALLO");}

                    break;
                case 3:JOptionPane.showMessageDialog(null, "No tienes objetos en tu inventario ");
                        break;
                        
                case 4: JOptionPane.showMessageDialog(null, campeon.getName()+" huye despavoridamente como un cobarde");
                        JOptionPane.showMessageDialog(null, campeon.getName()+ " por aquí no vuelvas payaso");
                        break;

            }
        }
    }

    public static void main(String[] args) {
        Escena x = new Escena();
        DPS Devas = new DPS("Mele", 0, 0, 0, 500, "Devas", "Aire", 5000, 0, 0, 1, 100, 0, 500, 1000, 1.00);
        Enemigo demon = new Enemigo();
        demon.generarEnemigo("Demonio");
        x.CombateDPS(Devas, demon);
    }
}
