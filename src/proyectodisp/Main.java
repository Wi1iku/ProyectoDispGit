/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectodisp;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

/**
 *
 * @author Wiku
 */
public class Main extends javax.swing.JFrame {
    GridBagLayout dinamico = new GridBagLayout();
    PanelJuegosgrid panelJuegos;
    PanelNoticias panelStreams;
    PanelLogin panelLogin;
    PanelInfo panelForos;
    PanelRegister panelRegister;
    PanelMain panelMain;
    Color colormain = new Color(255, 204, 255);
    public Main() {
        initComponents();
        panelJuegos= new PanelJuegosgrid();
        panelForos = new PanelInfo();
        panelRegister = new PanelRegister();
        panelLogin = new PanelLogin();
        panelStreams = new PanelNoticias();
        panelMain = new PanelMain();
        jPanelDin.setLayout(dinamico);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy= 0;
        jPanelDin.add(panelJuegos,c);
        c.gridx = 0;
        c.gridy= 0;
        jPanelDin.add(panelForos,c);
        c.gridx = 0;
        c.gridy= 0;
        jPanelDin.add(panelStreams,c);
        c.gridx = 0;
        c.gridy= 0;
        jPanelDin.add(panelLogin,c);
        c.gridx = 0;
        c.gridy= 0;
        jPanelDin.add(panelRegister,c);
        c.gridx = 0;
        c.gridy= 0;
        jPanelDin.add(panelMain, c);
        c.gridx=0;
        c.gridy=0;
        panelMain.setVisible(true);
        panelForos.setVisible(false);
        panelJuegos.setVisible(false);
        panelLogin.setVisible(false);
        panelRegister.setVisible(false);
        panelStreams.setVisible(false);  
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanelDin = new javax.swing.JPanel();
        jPanelDin.setVisible(true);
        jPanel2 = new javax.swing.JPanel();
        jLabelMain = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JLabelJuegos = new javax.swing.JLabel();
        jLabelStreams = new javax.swing.JLabel();
        jLabelForos = new javax.swing.JLabel();
        jTexBbuscar = new javax.swing.JTextField();
        jLabelAutentificacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(130, 100, 1280, 720));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jPanelDin.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDin.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelDinLayout = new javax.swing.GroupLayout(jPanelDin);
        jPanelDin.setLayout(jPanelDinLayout);
        jPanelDinLayout.setHorizontalGroup(
            jPanelDinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDinLayout.setVerticalGroup(
            jPanelDinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 166));

        jLabelMain.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMain.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMain.setText("Speedrun.com");
        jLabelMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMainMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMainMouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JLabelJuegos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLabelJuegos.setForeground(new java.awt.Color(0, 0, 0));
        JLabelJuegos.setText("Juegos");
        JLabelJuegos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLabelJuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelJuegosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLabelJuegosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLabelJuegosMouseExited(evt);
            }
        });

        jLabelStreams.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelStreams.setForeground(new java.awt.Color(0, 0, 0));
        jLabelStreams.setText("Info");
        jLabelStreams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelStreams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStreamsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelStreamsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelStreamsMouseExited(evt);
            }
        });

        jLabelForos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelForos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelForos.setText("Noticias");
        jLabelForos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelForos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelForosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelForosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelForosMouseExited(evt);
            }
        });

        jTexBbuscar.setForeground(new java.awt.Color(51, 51, 51));
        jTexBbuscar.setText("Buscar juegos o usuarios.."); // NOI18N
        jTexBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTexBbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTexBbuscarMouseClicked(evt);
            }
        });
        jTexBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexBbuscarActionPerformed(evt);
            }
        });

        jLabelAutentificacion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelAutentificacion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAutentificacion.setText("Autentificacion");
        jLabelAutentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAutentificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAutentificacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAutentificacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAutentificacionMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodisp/imageicos/botonmainfase1.png"))); // NOI18N
        jLabel1.setToolTipText("Subir Speedrun");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodisp/imageicos/logito.png"))); // NOI18N

        jComboBox1.setBackground(new java.awt.Color(255, 0, 51));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "English", "Polski", "Français", "Nederlands", "中文 (简体)", "中文 (繁體)", "日本語", "Deutsch", "Italiano", "Čeština", "ελληνικά", "Svenska", "български", "Русский", "Portugês" }));
        jComboBox1.setBorder(null);
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelJuegos)
                .addGap(18, 18, 18)
                .addComponent(jLabelStreams)
                .addGap(18, 18, 18)
                .addComponent(jLabelForos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTexBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAutentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTexBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabelJuegos)
                            .addComponent(jLabelStreams)
                            .addComponent(jLabelForos)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAutentificacion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
            .addComponent(jPanelDin, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTexBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexBbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexBbuscarActionPerformed

    private void jTexBbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTexBbuscarMouseClicked
    String texto = jTexBbuscar.getText();
    if ("Buscar juegos o usuarios..".equals(texto)){
    jTexBbuscar.setText("");
        repaint();          //No se lo que hacen estas
        revalidate();       // dos lineas, pero al parecer es buena idea ponerlos
    }else{
        System.out.println("No hay texto en jtextfield1");
    }
            
    }//GEN-LAST:event_jTexBbuscarMouseClicked

    private void JLabelJuegosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelJuegosMouseEntered
        JLabelJuegos.setForeground(Color.white);
        JLabelJuegos.setBackground(Color.white);
        //System.out.println("Testodes");
    }//GEN-LAST:event_JLabelJuegosMouseEntered

    private void JLabelJuegosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelJuegosMouseExited
       JLabelJuegos.setForeground(Color.black);
        JLabelJuegos.setBackground(Color.black);
    }//GEN-LAST:event_JLabelJuegosMouseExited

    private void jLabelStreamsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStreamsMouseEntered
        jLabelStreams.setForeground(Color.white);
        jLabelStreams.setBackground(Color.white);
    }//GEN-LAST:event_jLabelStreamsMouseEntered

    private void jLabelStreamsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStreamsMouseExited
        jLabelStreams.setForeground(Color.black);
        jLabelStreams.setBackground(Color.black);
    }//GEN-LAST:event_jLabelStreamsMouseExited

    private void jLabelForosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForosMouseEntered
                                                  
        jLabelForos.setForeground(Color.white);
        jLabelForos.setBackground(Color.white);
    }//GEN-LAST:event_jLabelForosMouseEntered

    private void jLabelForosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForosMouseExited
                                                  
        jLabelForos.setForeground(Color.black);
        jLabelForos.setBackground(Color.black);
    }//GEN-LAST:event_jLabelForosMouseExited

    private void jLabelAutentificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAutentificacionMouseEntered
       jLabelAutentificacion.setForeground(Color.white);
        jLabelAutentificacion.setBackground(Color.white);
    }//GEN-LAST:event_jLabelAutentificacionMouseEntered

    private void jLabelAutentificacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAutentificacionMouseExited
                                                  
        jLabelAutentificacion.setForeground(Color.black);
        jLabelAutentificacion.setBackground(Color.black);
    }//GEN-LAST:event_jLabelAutentificacionMouseExited

    private void JLabelJuegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelJuegosMouseClicked
        panelForos.setVisible(false);
        panelJuegos.setVisible(true);
        panelLogin.setVisible(false);
        panelRegister.setVisible(false);
        panelStreams.setVisible(false);
        panelMain.setVisible(false);
    }//GEN-LAST:event_JLabelJuegosMouseClicked

    private void jLabelStreamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStreamsMouseClicked
        panelForos.setVisible(true);
        panelJuegos.setVisible(false);
        panelLogin.setVisible(false);
        panelRegister.setVisible(false);
        panelStreams.setVisible(false);
        panelMain.setVisible(false);
    }//GEN-LAST:event_jLabelStreamsMouseClicked

    private void jLabelForosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForosMouseClicked
        panelForos.setVisible(false);
        panelJuegos.setVisible(false);
        panelLogin.setVisible(false);
        panelRegister.setVisible(false);
        panelStreams.setVisible(true);
        panelMain.setVisible(false);
    }//GEN-LAST:event_jLabelForosMouseClicked

    private void jLabelAutentificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAutentificacionMouseClicked
       panelForos.setVisible(false);
        panelJuegos.setVisible(false);
        panelLogin.setVisible(true);
        panelRegister.setVisible(false);
        panelStreams.setVisible(false);
        panelMain.setVisible(false);
    }//GEN-LAST:event_jLabelAutentificacionMouseClicked

    private void jLabelMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMainMouseClicked
        panelForos.setVisible(false);
        panelJuegos.setVisible(false);
        panelLogin.setVisible(false);
        panelRegister.setVisible(false);
        panelStreams.setVisible(false);
        panelMain.setVisible(true);
    }//GEN-LAST:event_jLabelMainMouseClicked

    private void jLabelMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMainMouseEntered
      
        jLabelMain.setForeground(colormain);
        jLabelMain.setBackground(colormain);
    }//GEN-LAST:event_jLabelMainMouseEntered

    private void jLabelMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMainMouseExited
                                              
        jLabelMain.setForeground(Color.black);
        jLabelMain.setBackground(Color.black);
    }//GEN-LAST:event_jLabelMainMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        
        try{
           ImageIcon imgfase2= new ImageIcon(getClass().getResource("/proyectodisp/imageicos/botonmainfase2.png"));
            jLabel1.setIcon(imgfase2);
        }
        catch(Exception e){ 
            System.out.println("Error en imagen ico");
        }
        
        
        
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
       
        try{
           ImageIcon imgfase2= new ImageIcon(getClass().getResource("/proyectodisp/imageicos/botonmainfase1.png"));
            jLabel1.setIcon(imgfase2);
        }
        catch(Exception e){ 
            System.out.println("Error en imagen ico");
        }
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelJuegos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAutentificacion;
    private javax.swing.JLabel jLabelForos;
    private javax.swing.JLabel jLabelMain;
    private javax.swing.JLabel jLabelStreams;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDin;
    private javax.swing.JTextField jTexBbuscar;
    // End of variables declaration//GEN-END:variables
}
