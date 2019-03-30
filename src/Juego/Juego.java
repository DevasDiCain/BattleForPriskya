/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Devas
 */
//Juego será una extensión de la clase Canvas que nos ayudará a generar la Ventana entre otra muchas cosas
public class Juego extends Canvas implements Runnable {

    private static final int ANCHO = 800;//Ancho pantalla
    private static final int ALTO = 600;//Alto pantalla
    
    private static final String NOMBRE = "BattleForPriskya. Por Devas";//Nombre de la ventana
    
    private int aps=0;//Actualiaciones por segundo
    private int fps=0;//Frames por segundo 
    
    private JFrame ventana;//JFrame que será la ventana
    private Thread thread;
    
    private static volatile boolean enFuncionamiento = false;//Nos dice si el juego está funcionando o no.//// VOLATILE impide que se pueda utilizar esta variable por varios Thread

    //Constructor
    public Juego() {
        setPreferredSize(new Dimension(ANCHO, ALTO));//Da un tamaño a nuestra ventana
        ventana = new JFrame(NOMBRE);//Instanciamos la ventana y le damos un nombre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Opcion por defecto para cerrar la ventana
        ventana.setResizable(false);//Impedir el reajuste de la pantalla
        ventana.setLayout(new BorderLayout());  //Diseño de los bordes
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();//Impide que pasen cosas raras con el tamaño de la ventana
        ventana.setLocationRelativeTo(null);//Ajusta la ventana al centro del escritorio
        ventana.setVisible(true);//Hacer visible la ventana

    }

    public static void main(String[] args) {
        Juego x = new Juego();
        x.iniciar();
    }
    //Synchronized asegura que ninguno de estos métodos puedan variar la variable "volatile"

    public synchronized void iniciar() {//Método que iniciar nuestro primer Thread que controlará los Gráficos del juego
        enFuncionamiento = true;
        thread = new Thread(this, "Graficos");
        thread.start();//De esta manera todo lo que valla dentro de nuestro metodo Run se repetirá de manera secuencial
    }

    public synchronized void detener() {
        enFuncionamiento = false;
        try {//Usamos Join (Que espera que el thread termine de hacer lo que esté haciendo)por que Stop corta de golpe la ejecución
            thread.join();//Utilizarlo es peligroso para el programa y Java nos obliga a utlizar un Try/Catch
        } catch (InterruptedException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);//El sistema no se colgaría
        }
    }

    private void actualizar() {//Aquí vendrá todo lo necesario para actualizar las variables del juego como la posicion del jugador , los stats ,etc...
        aps++;
    }

    private void mostrar() {//Metodos necesarios para ir redibujando nuestros graficos
        fps++;
    }

    public void run() {//Metodo que ejecutará el segundo Thread se inicia con el metodo Iniciar
        final int NS_POR_SEGUNDO=1000000000;
        final byte APS_OBJETIVO=60;//-128...127+...Cuanto mas bajo sea este numero mejor porque menos veces cargará el juego (si lo es demasiado estará lastrado)
        final double NS_POR_ACTUALIACION=NS_POR_SEGUNDO/APS_OBJETIVO; //Descubrimos cuantnos nanosegundos deben transcurrir para que sigamos el objetivo de actualizar 60 veces por segundo
        
        long referenciaActualizacion=System.nanoTime();  //Guardamos en esta variable los nanossegundos exacto del momento en el que se genera el metodo
        long referenciaContador = System.nanoTime();// Contador para indicar los FPS
        
        double tiempoTranscurrido;//Se guardará el momento exacto en el que se ejecuta el metodo
        double delta = 0   ;//La cantidad de tiempo que ha transcurrido hasta que se ejecuta una actualizacion
        //System.nanotime()----Método que controla las veces que se actualiza tanto las variables como el juego
        //Si no lo usamos la experiencia de juego se vería afectada por el sistema que lo ejecutase
        while (enFuncionamiento = true) {
            final long inicioBucle = System.nanoTime();//Momento exacto en el que se genera el bucle
            
            tiempoTranscurrido= inicioBucle - referenciaActualizacion;//Tiempo transcurrido desde que se genera el bucle
            referenciaActualizacion = inicioBucle;
            
            delta += tiempoTranscurrido/NS_POR_SEGUNDO;
            
            while(delta >= 1){//Este bucle se ejecutará unas 60 veces por segundo (APS_OBJETIVO)
             actualizar();
             delta--;
            }
            
            
            mostrar();
            
            if(System.nanoTime()-referenciaContador > NS_POR_SEGUNDO){//Cada segundo se mostrará por ventana
                ventana.setTitle(NOMBRE+" || APS: "+aps+" || FPS: "+fps);//Los FPS
                aps=0;//Reiniciamos los FPS Y LAS APS
                fps=0;//Si no el numero crecería hasta el infinito
                referenciaContador=System.nanoTime();//Nueva mediciion del tiempo
            }
        }
    }
}