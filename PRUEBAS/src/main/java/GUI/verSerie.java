/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Contenido;
import Clases.Pelicula;
import Clases.Serie;
import Clases.Temporada;
import java.awt.Color;
import Clases.UtilJavaflix;
import static java.awt.Color.black;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class verSerie extends javax.swing.JFrame {

    private entradaUsuario padre;
    private Serie serierecibida;

    public verSerie(entradaUsuario main, Serie serierecibida) {
        padre = main;
        this.serierecibida = serierecibida;
        initComponents();
        if (!padre.getClientelogeado().getFavoritos().contains(serierecibida)) {
            jLabelCorazon.setVisible(false);
        }
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jLabelTitulo.setText("Titulo: " + serierecibida.getTitulo());
        jLabelActores.setText("Actores: " + String.join(",", serierecibida.getActores()));
        jTextAreaSinopsis.setText("Sinopsis: " + serierecibida.getSinopsis());
        ImageIcon portadaredim = new ImageIcon(serierecibida.getPortada().getImage().getScaledInstance(jLabelPortada.getWidth(), jLabelPortada.getHeight(), 1));
        jLabelPortada.setIcon(portadaredim);
        jLabelGenero.setText("Género: "+serierecibida.getGenero());
        jLabelAnno.setText("Año: "+String.valueOf(serierecibida.getAnno()));
        jLabelRate.setText(String.valueOf(serierecibida.getCalificacionMedia()) + "/10");
        if (serierecibida.getCalificaciones().keySet().contains(padre.getClientelogeado())) {
            setRate();
        } else {
            jComboBoxRate.setSelectedIndex(0);
        }
        for (int i = 0; i < serierecibida.getTemporada().size(); i++) {
            jComboBoxTemporadas.addItem("Temporada " + (i + 1));
        }
        DefaultListModel<String> model = new DefaultListModel<>();
        setTabla(0);
    }

    public void setRate() {
        try {
            jComboBoxRate.setSelectedIndex(serierecibida.getCalificacion(padre.getClientelogeado())+1);

        } catch (Exception ex) {

        }
    }

    public void setTabla(int temporada) {
        DefaultListModel<String> model = new DefaultListModel<String>();
        for (int i = 0; i < serierecibida.getTemporada().get(temporada).getCapitulos().size(); i++) {
            model.addElement(serierecibida.getTemporada().get(temporada).getCapitulos().get(i).toString());
        }
        jListCapitulos.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelverPelicula = new javax.swing.JPanel();
        jPanelOpcionesverPelicula = new javax.swing.JPanel();
        jPanelCerrarRegistro = new javax.swing.JPanel();
        jLabelCerrarRegistro = new javax.swing.JLabel();
        jPanelAtrasRegistro = new javax.swing.JPanel();
        jLabelAtrasRegistro = new javax.swing.JLabel();
        jPanelIntroDatosverPelicula = new javax.swing.JPanel();
        jLabelJAVAFLIXRegistro = new javax.swing.JLabel();
        jLabelJAVAFLIXSombraRegistro = new javax.swing.JLabel();
        jPanelSerie = new javax.swing.JPanel();
        jLabelPortada = new javax.swing.JLabel();
        jLabelActores = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelAnno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopsis = new javax.swing.JTextArea();
        jLabelCorazon = new javax.swing.JLabel();
        jLabelRate = new javax.swing.JLabel();
        jLabelCorazonVacio = new javax.swing.JLabel();
        jComboBoxRate = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCapitulos = new javax.swing.JList<>();
        jComboBoxTemporadas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelverPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpcionesverPelicula.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOpcionesverPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCerrarRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCerrarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCerrarRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCerrarRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCerrarRegistroMouseExited(evt);
            }
        });
        jPanelCerrarRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrarRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrarRegistro.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabelCerrarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrarRegistro.setText("X");
        jPanelCerrarRegistro.add(jLabelCerrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelOpcionesverPelicula.add(jPanelCerrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelAtrasRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtrasRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAtrasRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAtrasRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAtrasRegistroMouseExited(evt);
            }
        });
        jPanelAtrasRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAtrasRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAtrasRegistro.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabelAtrasRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtrasRegistro.setText("< ");
        jPanelAtrasRegistro.add(jLabelAtrasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jPanelOpcionesverPelicula.add(jPanelAtrasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 30));

        jPanelverPelicula.add(jPanelOpcionesverPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        jPanelIntroDatosverPelicula.setBackground(java.awt.Color.white);
        jPanelIntroDatosverPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJAVAFLIXRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJAVAFLIXRegistro.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabelJAVAFLIXRegistro.setForeground(new java.awt.Color(197, 49, 47));
        jLabelJAVAFLIXRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXRegistro.setText("JAVAFLIX");
        jPanelIntroDatosverPelicula.add(jLabelJAVAFLIXRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 100));

        jLabelJAVAFLIXSombraRegistro.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabelJAVAFLIXSombraRegistro.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombraRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombraRegistro.setText("JAVAFLIX");
        jPanelIntroDatosverPelicula.add(jLabelJAVAFLIXSombraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 110));

        jPanelverPelicula.add(jPanelIntroDatosverPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1240, 100));

        jPanelSerie.setBackground(new java.awt.Color(250, 250, 250));
        jPanelSerie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPortada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelSerie.add(jLabelPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 260));

        jLabelActores.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelActores.setText("ACTORES:");
        jPanelSerie.add(jLabelActores, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 640, 60));

        jLabelTitulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelTitulo.setText("TITULO: ");
        jPanelSerie.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 300, 60));

        jLabelGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelGenero.setText("GÉNERO:");
        jPanelSerie.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 190, 60));

        jLabelAnno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelAnno.setText("AÑO:");
        jPanelSerie.add(jLabelAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 190, 60));

        jTextAreaSinopsis.setColumns(20);
        jTextAreaSinopsis.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextAreaSinopsis.setLineWrap(true);
        jTextAreaSinopsis.setRows(5);
        jTextAreaSinopsis.setText("SINOPSIS:");
        jTextAreaSinopsis.setWrapStyleWord(true);
        jTextAreaSinopsis.setBorder(null);
        jTextAreaSinopsis.setFocusable(false);
        jScrollPane1.setViewportView(jTextAreaSinopsis);

        jPanelSerie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 640, 100));

        jLabelCorazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Corazon.png"))); // NOI18N
        jLabelCorazon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCorazonMouseClicked(evt);
            }
        });
        jPanelSerie.add(jLabelCorazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 60));

        jLabelRate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelRate.setText("X/10");
        jPanelSerie.add(jLabelRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 60, 40));

        jLabelCorazonVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CorazonVacio.png"))); // NOI18N
        jLabelCorazonVacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCorazonVacioMouseClicked(evt);
            }
        });
        jPanelSerie.add(jLabelCorazonVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 60));

        jComboBoxRate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jComboBoxRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rate", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxRateFocusLost(evt);
            }
        });
        jComboBoxRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRateActionPerformed(evt);
            }
        });
        jPanelSerie.add(jComboBoxRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, 40));

        jScrollPane3.setBackground(java.awt.Color.lightGray);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jListCapitulos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(jListCapitulos);

        jPanelSerie.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 640, 260));

        jComboBoxTemporadas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jComboBoxTemporadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTemporadasActionPerformed(evt);
            }
        });
        jPanelSerie.add(jComboBoxTemporadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 640, 30));

        jPanelverPelicula.add(jPanelSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1240, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelverPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelverPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilJavaflix.guardarDatos();
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jPanelCerrarRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarRegistroMouseEntered
        // TODO add your handling code here:
        jPanelCerrarRegistro.setBackground(new Color(232, 17, 35));
        jLabelCerrarRegistro.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanelCerrarRegistroMouseEntered

    private void jPanelCerrarRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarRegistroMouseExited
        // TODO add your handling code here:
        jPanelCerrarRegistro.setBackground(new Color(255, 255, 255));
        jLabelCerrarRegistro.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelCerrarRegistroMouseExited

    private void jPanelAtrasRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasRegistroMouseEntered
        // TODO add your handling code here:
        jPanelAtrasRegistro.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_jPanelAtrasRegistroMouseEntered

    private void jPanelAtrasRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasRegistroMouseExited
        // TODO add your handling code here:
        jPanelAtrasRegistro.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanelAtrasRegistroMouseExited

    private void jPanelAtrasRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasRegistroMouseClicked
        // TODO add your handling code here:
        this.dispose();
        padre.setVisible(true);
    }//GEN-LAST:event_jPanelAtrasRegistroMouseClicked

    private void jPanelCerrarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarRegistroMouseClicked
        // TODO add your handling code here:      
        UtilJavaflix.cerrarPrograma();
    }//GEN-LAST:event_jPanelCerrarRegistroMouseClicked

    private void jLabelCorazonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCorazonMouseClicked
        // TODO add your handling code here:
        padre.getClientelogeado().removeFavoritos(serierecibida);
        jLabelCorazonVacio.setVisible(true);
        jLabelCorazonVacio.setFocusable(true);
        jLabelCorazon.setVisible(false);
        jLabelCorazon.setFocusable(false);
        JOptionPane.showMessageDialog(this,"Contenido eliminado de favoritos");
    }//GEN-LAST:event_jLabelCorazonMouseClicked

    private void jLabelCorazonVacioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCorazonVacioMouseClicked
        // TODO add your handling code here:
        padre.getClientelogeado().addFavoritos(serierecibida);
        jLabelCorazonVacio.setVisible(false);
        jLabelCorazonVacio.setFocusable(false);
        jLabelCorazon.setVisible(true);
        jLabelCorazon.setFocusable(true);
        JOptionPane.showMessageDialog(this,"Contenido añadido a favoritos");
    }//GEN-LAST:event_jLabelCorazonVacioMouseClicked

    private void jComboBoxRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRateActionPerformed
        // TODO add your handling code here:
        if (!String.valueOf(jComboBoxRate.getSelectedItem()).equals("Rate")) {
            if (jComboBoxRate.getItemAt(0).equals("Rate")) {
                jComboBoxRate.removeItemAt(0);
            } else {
                try {
                    int valorSeleccionado = Integer.parseInt(String.valueOf(jComboBoxRate.getSelectedItem()));
                    if (serierecibida.getCalificaciones().keySet().contains(padre.getClientelogeado())) {
                        if (JOptionPane.showConfirmDialog(this, "¿Cambiar la calificacion a un " + valorSeleccionado + '?') == JOptionPane.YES_OPTION) {
                            serierecibida.cambiarCalificacion(padre.getClientelogeado(), valorSeleccionado);
                            jLabelRate.setText(String.valueOf(serierecibida.getCalificacionMedia()) + "/10");
                        }
                    } else {
                        if (JOptionPane.showConfirmDialog(this, "¿Calificar este contenido con un " + valorSeleccionado + '?') == JOptionPane.YES_OPTION) {
                            serierecibida.addCalificacion(padre.getClientelogeado(), valorSeleccionado);
                            jLabelRate.setText(String.valueOf(serierecibida.getCalificacionMedia()) + "/10");
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Elige una calificacion\n" + ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jComboBoxRateActionPerformed

    private void jComboBoxRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxRateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRateFocusLost

    private void jComboBoxTemporadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTemporadasActionPerformed
        // TODO add your handling code here:
        int valorSeleccionado = jComboBoxTemporadas.getSelectedIndex();
        setTabla(valorSeleccionado);
    }//GEN-LAST:event_jComboBoxTemporadasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBoxRate;
    private javax.swing.JComboBox<String> jComboBoxTemporadas;
    private javax.swing.JLabel jLabelActores;
    private javax.swing.JLabel jLabelAnno;
    private javax.swing.JLabel jLabelAtrasRegistro;
    private javax.swing.JLabel jLabelCerrarRegistro;
    private javax.swing.JLabel jLabelCorazon;
    private javax.swing.JLabel jLabelCorazonVacio;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelJAVAFLIXRegistro;
    private javax.swing.JLabel jLabelJAVAFLIXSombraRegistro;
    private javax.swing.JLabel jLabelPortada;
    private javax.swing.JLabel jLabelRate;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListCapitulos;
    private javax.swing.JPanel jPanelAtrasRegistro;
    private javax.swing.JPanel jPanelCerrarRegistro;
    private javax.swing.JPanel jPanelIntroDatosverPelicula;
    private javax.swing.JPanel jPanelOpcionesverPelicula;
    private javax.swing.JPanel jPanelSerie;
    private javax.swing.JPanel jPanelverPelicula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaSinopsis;
    // End of variables declaration//GEN-END:variables
}