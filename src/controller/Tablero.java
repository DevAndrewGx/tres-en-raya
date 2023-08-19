/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import views.FormTikTacToe;

/**
 *
 * @author Andrey
 */
public class Tablero extends JPanel{
    private int anchoCI; 
    private int alturaCI;
    private int margen;
    private Color colorTablero; 
    private Color colorCI;
    
    private TipoImagen jugadorActual;
    
    private Jugador jugador1;
    private Jugador jugador2;
    
    
    private ArrayList<Cuadro> cuadros;
    
    public Tablero() {
        init();
    }
    
    private void init() {
        anchoCI = 80;
        alturaCI = 80;
        colorCI = Color.BLUE;
        colorTablero = Color.RED;
        margen = 6;
        jugador1 = new Jugador();
        jugador2 = new Jugador();  
        cuadros = new ArrayList();
        jugadorActual = TipoImagen.EQUIS; 
    }
    
    public void crearTablero() {
        setLayout(null);
        setSize(anchoCI *3 +margen* 4, alturaCI*3+margen*4);
        setBackground(colorTablero);
        crearCuadrosInternos();
    }
    
    private void crearCuadrosInternos() {
        int x =  margen;
        int y = margen;
        
        
        for(int i = 0; i<3; i++) {
            
            x = margen;   
            for(int j = 0; j<3; j++) {
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, colorCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR) {
                });
                cuadro.setLocation(x, y);
                add(cuadro);
                
                cuadros.add(cuadro);
                
                crearEventosCuadros(cuadro);
                x += (anchoCI + margen);
                
            }
            y += (alturaCI+margen);
        }
    }
    
    
    public void crearEventosCuadros(Cuadro cuadro) {
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
                
                if(cuadro.isDibujado()) return;
                
                if(jugadorActual == TipoImagen.EQUIS) {
                    cuadro.setTipoImagen(TipoImagen.EQUIS);
                    jugadorActual = TipoImagen.CIRCULO;
                    cambiarEstilos(TipoImagen.CIRCULO);
                }else if(jugadorActual == TipoImagen.CIRCULO) {
                    
                    cuadro.setTipoImagen(TipoImagen.CIRCULO);
                    jugadorActual = TipoImagen.EQUIS; 
                    cambiarEstilos(TipoImagen.EQUIS);
                }
                
                cuadro.setDibujado(true);
                cuadro.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        
        cuadro.addMouseListener(evento);
    }
    
    
    public void cambiarEstilos(TipoImagen jugadorActual) {
        if(jugadorActual == TipoImagen.CIRCULO) {
            FormTikTacToe.imagenJugadorEquis.setRuta(Ruta.JUGADORAUXILIAR);
            FormTikTacToe.imagenJugadorEquis.repaint();
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(240,240, 240,100));
            
            FormTikTacToe.imagenJugadorCirculo.setRuta(Ruta.JUGADORCIRCULO);
            FormTikTacToe.imagenJugadorCirculo.repaint();
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(255, 200, 255));
        }else if(jugadorActual == TipoImagen.EQUIS) {
            FormTikTacToe.imagenJugadorCirculo.setRuta(Ruta.JUGADORAUXILIAR);
            FormTikTacToe.imagenJugadorCirculo.repaint();
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(240,240, 240,100));
            
            FormTikTacToe.imagenJugadorEquis.setRuta(Ruta.JUGADOREQUIS);
            FormTikTacToe.imagenJugadorEquis.repaint();
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(180, 232, 255));
        }
    }

    public TipoImagen getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(TipoImagen jugadorActual) {
        this.jugadorActual = jugadorActual;
    }
    
    
    
    public ArrayList<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }
    
    

    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAlturaCI() {
        return alturaCI;
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    
}
