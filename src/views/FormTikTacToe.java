/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.Jugador;
import controller.Tablero;
import controller.Imagen;
import controller.TipoImagen;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Andrey
 */
public class FormTikTacToe extends javax.swing.JFrame {
    
    public static Imagen imagenJugadorEquis;
    public static Imagen imagenJugadorCirculo; 
    public static JLabel nombreJugadorEquis;
    public static JLabel nombreJugadorCirculo;
    
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    
    public FormTikTacToe(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2  = jugador2;
        init();
        
        imagenJugadorEquis = jugadorEquis;
        imagenJugadorCirculo = jugadorCirculo;
        nombreJugadorEquis = lblNombreJ1;
        nombreJugadorCirculo = lblNombreJ2;
        
        tablero.cambiarEstilos(TipoImagen.EQUIS);
        
        lblNombreJ1.setText(jugador1.getNombre());
        lblNombreJ2.setText(jugador2.getNombre());
    } 
    
    public void init() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        tablero = new Tablero();
        tablero.setJugador1(jugador1);
        tablero.setJugador1(jugador2);
        tablero.setAlturaCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setColorCI(new Color(14, 19, 43));
        tablero.setColorTablero(new Color(239, 180, 255));
        tablero.setLocation(40, 150);
        tablero.crearTablero();
        tablero.setVisible(true);
        
        panelBackground.add(tablero);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jugadorCirculo = new controller.Imagen();
        jugadorEquis = new controller.Imagen();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBackground.setBackground(new java.awt.Color(14, 19, 43));
        panelBackground.setPreferredSize(new java.awt.Dimension(400, 500));
        panelBackground.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelBackground.add(lblCierre);
        lblCierre.setBounds(370, 10, 37, 16);

        jugadorCirculo.setText("imagen1");
        jugadorCirculo.setRuta("/resources/JugadorCirculo.png");
        panelBackground.add(jugadorCirculo);
        jugadorCirculo.setBounds(275, 50, 50, 50);

        jugadorEquis.setText("imagen1");
        jugadorEquis.setRuta("/resources/JugadorEquis.png");
        panelBackground.add(jugadorEquis);
        jugadorEquis.setBounds(75, 50, 50, 50);

        lblNombreJ2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 200, 255));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("NAME");
        panelBackground.add(lblNombreJ2);
        lblNombreJ2.setBounds(255, 100, 90, 30);

        lblNombreJ1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(180, 232, 255));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("NAME");
        panelBackground.add(lblNombreJ1);
        lblNombreJ1.setBounds(55, 100, 90, 30);

        lblPuntajeJ2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        panelBackground.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 50, 60, 60);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        panelBackground.add(jLabel2);
        jLabel2.setBounds(190, 50, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        panelBackground.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited

        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

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

    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private controller.Imagen jugadorCirculo;
    private controller.Imagen jugadorEquis;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JPanel panelBackground;
    // End of variables declaration//GEN-END:variables
}
