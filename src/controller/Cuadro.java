/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Andrey
 */
public class Cuadro extends JPanel {
    private int altura; 
    private int ancho;
    private Color color;
    private TipoImagen tipoImagen;
    private boolean dibujado;
    private int i;
    private int j;
    
    public Cuadro(int altura, int ancho, Color color) { 
        this.altura = altura;
        this.ancho = ancho;
        this.color = color;
        dibujado = false;
        init(); 
    }
    
    
    private void init() {
        setSize(ancho, altura);
        setBackground(color);
    }

    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg); 
        Graphics2D g = (Graphics2D)gg;
        
        
        ImageIcon imagen = new ImageIcon();
        if(tipoImagen == TipoImagen.CIRCULO) {
            imagen = new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        }else if(tipoImagen  == TipoImagen.EQUIS) {
            imagen = new ImageIcon(getClass().getResource(Ruta.EQUIS));
        }else if(tipoImagen == TipoImagen.LINEA1) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA1));
        }
        else if(tipoImagen == TipoImagen.LINEA2) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA2));
        }
        else if(tipoImagen == TipoImagen.LINEA3) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA3));
        }
        else if(tipoImagen == TipoImagen.LINEA4) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA4));
        }
        else if(tipoImagen == TipoImagen.LINEA5) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA5));
        }
        else if(tipoImagen == TipoImagen.LINEA6) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA6));
        }
        else if(tipoImagen == TipoImagen.LINEA7) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA7));
        }
        else if(tipoImagen == TipoImagen.LINEA8) {
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA8));
        }
        
        
        g.drawImage(imagen.getImage(),0,0, this.getWidth(),this.getHeight(), null);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
    

    public boolean isDibujado() {
        return dibujado;
    }
    
    

    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }
    
    
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
    
    
}
