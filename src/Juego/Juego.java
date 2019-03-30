/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author peper
 */
//Juego será una extensión de la clase Canvas que nos ayudará a generar la Ventana entre otra muchas cosas
public class Juego extends Canvas implements Runnable{
    
        private static final int ANCHO=800;//Ancho pantalla
        private static final int ALTO=600;//Alto pantalla
        private static final String NOMBRE="BattleForPriskya. Por Devas";//Nombre de la ventana
        private JFrame ventana;//JFrame que será la ventana
        private Thread thread;
        
        
        //Constructor
        
        public Juego(){
            setPreferredSize(new Dimension(ANCHO,ALTO));//Da un tamaño a nuestra ventana
            ventana = new JFrame(NOMBRE);//Instanciamos la ventana y le damos un nombre
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Opcion por defecto para cerrar la ventana
            ventana.setResizable(false);//Impedir el reajuste de la pantalla
            ventana.setLayout(new BorderLayout());  //Diseño de los bordes
            ventana.add( this, BorderLayout.CENTER);
            ventana.pack();//Impide que pasen cosas raras con el tamaño de la ventana
            ventana.setLocationRelativeTo(null);//Ajusta la ventana al centro del escritorio
            ventana.setVisible(true);//Hacer visible la ventana
            
        }
        public static void main(String[] args) {
        Juego x = new Juego();
        x.iniciar();
    }
        
    public void iniciar(){//Método que iniciar nuestro primer Thread que controlará los Gráficos del juego
                thread= new Thread(this,"Graficos");
                thread.start();//De esta manera todo lo que valla dentro de nuestro metodo Run se repetirá de manera secuencial
    }
    public void detener(){
    }
    public void run() {//Metodo que ejecutará el segundo Thread
        System.out.println("El thread 2 se está ejecutando");
    }
}
