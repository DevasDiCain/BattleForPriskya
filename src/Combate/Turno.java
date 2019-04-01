/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combate;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author José Rodríguez Fernández
 */
public class Turno {
    
        public int Accion(){
            int opcion = 0 ;
            Scanner sn = new Scanner (System.in);
            do{
           opcion =Integer.parseInt(JOptionPane.showInputDialog(null,"1-Golpear \n2-Habilidades \n3-Objetos \n4-Huir "));
            } while(opcion == 0);
            return opcion;
        }
}
