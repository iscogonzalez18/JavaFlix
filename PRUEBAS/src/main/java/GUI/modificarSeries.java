/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Serie;
import Clases.Temporada;
import java.awt.Color;
import Clases.UtilJavaflix;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco
 */
public class modificarSeries extends javax.swing.JFrame {

    private consultaContenido padre;
    private ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
    private String nombreImagen, rutaImagen, extension = "jpg";
    private File file;
    private BufferedImage bimage;
    private Serie seriemodificar;
    private ImageIcon portadamodificar;

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public void addTemporadas(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    private void showTabla(ArrayList<Temporada> Temporadas) {
        System.out.println(Temporadas);
        int contador = 0;
        DefaultTableModel model = (DefaultTableModel) jTableTemporadas.getModel();
        for (Temporada temporadaactual : Temporadas) {
            model.addRow(new Object[]{null, null});
            jTableTemporadas.setValueAt(Temporadas.indexOf(temporadaactual) + 1, contador, 0);
            jTableTemporadas.setValueAt(temporadaactual.getCapitulos().size(), contador, 1);
            contador++;
        }
    }

    private void limpiarTabla() {
        DefaultTableModel dm = (DefaultTableModel) jTableTemporadas.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    public ImageIcon cargarFoto() {
        JFileChooser filechooser = new JFileChooser();
        filechooser.addChoosableFileFilter(new ImageFilter());
        filechooser.setAcceptAllFileFilterUsed(false);

        int option = filechooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = filechooser.getSelectedFile();
            rutaImagen = file.getAbsolutePath();
            nombreImagen = file.getName();
        } else {
            JOptionPane.showMessageDialog(this, "Ningún fichero seleccionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        ImageIcon portada = new ImageIcon(rutaImagen);
        return portada;
    }

    /**
     * Creates new form ventanaPrincipal
     */
    public modificarSeries(consultaContenido main, Serie seriemodificar) {
        padre = main;
        this.seriemodificar = seriemodificar;
        this.temporadas = seriemodificar.getTemporada();
        this.portadamodificar = seriemodificar.getPortada();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        fieldNombreS.setText(seriemodificar.getTitulo());
        fieldGeneroS.setText(seriemodificar.getGenero());
        fieldAnnoS.setText(String.valueOf(seriemodificar.getAnno()));
        fieldActoresS.setText(String.join(",", seriemodificar.getActores()));
        fieldSinopsisS.setText(seriemodificar.getSinopsis());
        ImageIcon portadaredimen = new ImageIcon(seriemodificar.getPortada().getImage().getScaledInstance(jLabelportadaserie.getWidth(), jLabelportadaserie.getHeight(), 1));
        jLabelportadaserie.setIcon(portadaredimen);
        showTabla(seriemodificar.getTemporada());
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
        jPanelventana = new javax.swing.JPanel();
        jPanelOpciones = new javax.swing.JPanel();
        jPanelCerrar = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jPanelAtras = new javax.swing.JPanel();
        jLabelAtras = new javax.swing.JLabel();
        jPanelModificar = new javax.swing.JPanel();
        jPanelSeries = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        fieldNombreS = new javax.swing.JTextField();
        jLabelSinopsis = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        fieldGeneroS = new javax.swing.JTextField();
        jLabelAnno = new javax.swing.JLabel();
        fieldAnnoS = new javax.swing.JTextField();
        jLabelActores = new javax.swing.JLabel();
        fieldActoresS = new javax.swing.JTextField();
        jScrollPaneTemporadas = new javax.swing.JScrollPane();
        jTableTemporadas = new javax.swing.JTable();
        jScrollPaneSinopsis = new javax.swing.JScrollPane();
        fieldSinopsisS = new javax.swing.JTextArea();
        jPanelActualizar = new javax.swing.JPanel();
        crearserie = new javax.swing.JLabel();
        jPanelFoto = new javax.swing.JPanel();
        jLabelportadaserie = new javax.swing.JLabel();
        jButtonFoto = new javax.swing.JButton();
        jPanelEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelJAVAFLIX = new javax.swing.JLabel();
        jLabelJAVAFLIXSombra = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1239, 725));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseExited(evt);
            }
        });
        jPanelCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setText("X");
        jPanelCerrar.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelOpciones.add(jPanelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanelAtras.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAtrasMouseExited(evt);
            }
        });
        jPanelAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAtras.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAtras.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabelAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtras.setText("< ");
        jPanelAtras.add(jLabelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jPanelOpciones.add(jPanelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 30));

        jPanelventana.add(jPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        jPanelModificar.setBackground(new java.awt.Color(255, 255, 255));

        jPanelSeries.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setText("Nombre:");
        jPanelSeries.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));
        jPanelSeries.add(fieldNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 105, -1));

        jLabelSinopsis.setText("Sinopsis:");
        jPanelSeries.add(jLabelSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, 20));

        jLabelGenero.setText("Genero:");
        jPanelSeries.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));
        jPanelSeries.add(fieldGeneroS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 105, -1));

        jLabelAnno.setText("Año:");
        jPanelSeries.add(jLabelAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));
        jPanelSeries.add(fieldAnnoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 105, -1));

        jLabelActores.setText("Actores(separados por ,):");
        jPanelSeries.add(jLabelActores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));
        jPanelSeries.add(fieldActoresS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 320, -1));

        jTableTemporadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Temporada", "Capitulos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTemporadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTemporadasMouseClicked(evt);
            }
        });
        jScrollPaneTemporadas.setViewportView(jTableTemporadas);

        jPanelSeries.add(jScrollPaneTemporadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 220, 144));

        fieldSinopsisS.setColumns(20);
        fieldSinopsisS.setLineWrap(true);
        fieldSinopsisS.setRows(5);
        fieldSinopsisS.setWrapStyleWord(true);
        jScrollPaneSinopsis.setViewportView(fieldSinopsisS);

        jPanelSeries.add(jScrollPaneSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 210, 90));

        jPanelActualizar.setBackground(new java.awt.Color(180, 45, 49));

        crearserie.setBackground(new java.awt.Color(255, 255, 255));
        crearserie.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        crearserie.setForeground(new java.awt.Color(255, 255, 255));
        crearserie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearserie.setText("ACTUALIZAR SERIE");
        crearserie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearserieMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelActualizarLayout = new javax.swing.GroupLayout(jPanelActualizar);
        jPanelActualizar.setLayout(jPanelActualizarLayout);
        jPanelActualizarLayout.setHorizontalGroup(
            jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearserie, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        jPanelActualizarLayout.setVerticalGroup(
            jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearserie, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanelSeries.add(jPanelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 720, 80));

        jPanelFoto.setBackground(new java.awt.Color(130, 130, 130));

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadaserie, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelportadaserie, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jPanelSeries.add(jPanelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jButtonFoto.setText("Subir Foto");
        jButtonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFotoActionPerformed(evt);
            }
        });
        jPanelSeries.add(jButtonFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 89, -1));

        javax.swing.GroupLayout jPanelModificarLayout = new javax.swing.GroupLayout(jPanelModificar);
        jPanelModificar.setLayout(jPanelModificarLayout);
        jPanelModificarLayout.setHorizontalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSeries, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelModificarLayout.setVerticalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSeries, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelventana.add(jPanelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 900, 480));

        jPanelEliminar.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminar.setText("ELIMINAR SERIE");
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelEliminarLayout = new javax.swing.GroupLayout(jPanelEliminar);
        jPanelEliminar.setLayout(jPanelEliminarLayout);
        jPanelEliminarLayout.setHorizontalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanelEliminarLayout.setVerticalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanelventana.add(jPanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 260, -1));

        jLabelJAVAFLIX.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIX.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJAVAFLIX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIX.setText("JAVAFLIX");
        jPanelventana.add(jLabelJAVAFLIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, 130));

        jLabelJAVAFLIXSombra.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        jLabelJAVAFLIXSombra.setForeground(new java.awt.Color(112, 101, 101));
        jLabelJAVAFLIXSombra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJAVAFLIXSombra.setText("JAVAFLIX");
        jPanelventana.add(jLabelJAVAFLIXSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 810, 130));

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitasbienrojo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel2");
        jPanelventana.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1239, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelventana, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        UtilJavaflix.guardarDatos();
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jPanelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseEntered
        // TODO add your handling code here:
        jPanelCerrar.setBackground(new Color(232, 17, 35));
        jLabelCerrar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanelCerrarMouseEntered

    private void jPanelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseExited
        // TODO add your handling code here:
        jPanelCerrar.setBackground(new Color(255, 255, 255));
        jLabelCerrar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelCerrarMouseExited

    private void jPanelAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseEntered
        // TODO add your handling code here:
        jPanelAtras.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_jPanelAtrasMouseEntered

    private void jPanelAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseExited
        // TODO add your handling code here:
        jPanelAtras.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanelAtrasMouseExited

    private void jPanelAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasMouseClicked
        // TODO add your handling code here:
        this.dispose();
        padre.setEnabled(true);
        padre.setVisible(true);
    }//GEN-LAST:event_jPanelAtrasMouseClicked

    private void jPanelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseClicked
        // TODO add your handling code here:      
        UtilJavaflix.cerrarPrograma();

    }//GEN-LAST:event_jPanelCerrarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (this.temporadas.size() > 0) {
            limpiarTabla();
            showTabla(temporadas);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButtonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFotoActionPerformed
        // TODO add your handling code here:
        this.portadamodificar = cargarFoto();
        ImageIcon imgRedimensionada = new ImageIcon(portadamodificar.getImage().getScaledInstance(jLabelportadaserie.getWidth(), jLabelportadaserie.getHeight(), 1));
        jLabelportadaserie.setIcon(imgRedimensionada);
    }//GEN-LAST:event_jButtonFotoActionPerformed

    private void crearserieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearserieMouseClicked
        // TODO add your handling code here:
        try {
            Serie serieasustituir = new Serie(temporadas, fieldNombreS.getText(), fieldSinopsisS.getText(), fieldGeneroS.getText(), Integer.parseInt(fieldAnnoS.getText()),
                    UtilJavaflix.parseActores(fieldActoresS.getText()), portadamodificar);
            ArrayList<Serie> listacompleta = UtilJavaflix.getSeries();
            int indexasustituir = listacompleta.indexOf(seriemodificar);
            listacompleta.set(indexasustituir, serieasustituir);
            UtilJavaflix.setSeries(listacompleta);
            UtilJavaflix.guardarDatos();
            JOptionPane.showMessageDialog(this, "Serie actualizada correctamente");
            this.dispose();
            padre.setVisible(true);
            padre.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al modificar la serie");
        }

    }//GEN-LAST:event_crearserieMouseClicked

    private void jTableTemporadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTemporadasMouseClicked
        // TODO add your handling code here:
        try {
            Temporada temporadaselect = seriemodificar.getTemporada().get(jTableTemporadas.getSelectedRow());
            modificarCapitulo modcapitulo = new modificarCapitulo(this, temporadaselect);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jTableTemporadasMouseClicked

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        // TODO add your handling code here:
        ArrayList<Serie> listacompleta = UtilJavaflix.getSeries();
        try {
            listacompleta.remove(seriemodificar);
            JOptionPane.showMessageDialog(this, "Serie eliminada correctamente");
            UtilJavaflix.setSeries(listacompleta);
            this.dispose();
            padre.setEnabled(true);
            padre.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al borrar la serie");
        }

    }//GEN-LAST:event_jLabelEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel crearserie;
    private javax.swing.JTextField fieldActoresS;
    private javax.swing.JTextField fieldAnnoS;
    private javax.swing.JTextField fieldGeneroS;
    private javax.swing.JTextField fieldNombreS;
    private javax.swing.JTextArea fieldSinopsisS;
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JLabel jLabelActores;
    private javax.swing.JLabel jLabelAnno;
    private javax.swing.JLabel jLabelAtras;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelJAVAFLIX;
    private javax.swing.JLabel jLabelJAVAFLIXSombra;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSinopsis;
    private javax.swing.JLabel jLabelportadaserie;
    private javax.swing.JPanel jPanelActualizar;
    private javax.swing.JPanel jPanelAtras;
    private javax.swing.JPanel jPanelCerrar;
    private javax.swing.JPanel jPanelEliminar;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JPanel jPanelModificar;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelSeries;
    private javax.swing.JPanel jPanelventana;
    private javax.swing.JScrollPane jScrollPaneSinopsis;
    private javax.swing.JScrollPane jScrollPaneTemporadas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTemporadas;
    // End of variables declaration//GEN-END:variables
}