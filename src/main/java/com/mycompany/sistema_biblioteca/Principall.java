/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_biblioteca;

import Model.Usuario;

/**
 *
 * @author santi
 */
public class Principall extends javax.swing.JFrame {
    Usuario us;
    /**
     * Creates new form Principall
     */
    public Principall() {
        initComponents();
    }

    public Principall(Usuario us) {
        initComponents();
        this.us = us;
        switch(us.getId_Cat()){
            case 1:
                break;
            case 2:
                opEditEstados.setVisible(false);
                break;
            case 3:
                Jadmin.setVisible(false);
                Jlibros.setVisible(false);
                opEditEstados.setVisible(false);
                opTramites.setVisible(false);
                Ver_Debolucion.setVisible(false);
                opHistorial.setVisible(false);
                        
                break;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jadmin = new javax.swing.JMenu();
        opRegistrarUsuario = new javax.swing.JMenuItem();
        Jlibros = new javax.swing.JMenu();
        opRegistrarLibros = new javax.swing.JMenuItem();
        opGeneros = new javax.swing.JMenuItem();
        Jtrans = new javax.swing.JMenu();
        opTramites = new javax.swing.JMenuItem();
        Ver_Debolucion = new javax.swing.JMenuItem();
        opCatalogo = new javax.swing.JMenuItem();
        opHistorial = new javax.swing.JMenuItem();
        opEditEstados = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        opEditCat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN PRINCIPAL");
        setExtendedState(6);

        escritorio.setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        Jadmin.setText("Admin");
        Jadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JadminMouseClicked(evt);
            }
        });

        opRegistrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opRegistrarUsuario.setText("Registrar Usuarios");
        opRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarUsuarioActionPerformed(evt);
            }
        });
        Jadmin.add(opRegistrarUsuario);

        jMenuBar1.add(Jadmin);

        Jlibros.setText("Libros");

        opRegistrarLibros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opRegistrarLibros.setText("Registrar Libros");
        opRegistrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarLibrosActionPerformed(evt);
            }
        });
        Jlibros.add(opRegistrarLibros);

        opGeneros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opGeneros.setText("Registrar Generos");
        opGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGenerosActionPerformed(evt);
            }
        });
        Jlibros.add(opGeneros);

        jMenuBar1.add(Jlibros);

        Jtrans.setText("Transaccion");

        opTramites.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opTramites.setText("Tramites");
        opTramites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTramitesActionPerformed(evt);
            }
        });
        Jtrans.add(opTramites);

        Ver_Debolucion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Ver_Debolucion.setText("Debolucion");
        Ver_Debolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_DebolucionActionPerformed(evt);
            }
        });
        Jtrans.add(Ver_Debolucion);

        opCatalogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opCatalogo.setText("Catalogo");
        opCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCatalogoActionPerformed(evt);
            }
        });
        Jtrans.add(opCatalogo);

        opHistorial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opHistorial.setText("Historial");
        opHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opHistorialActionPerformed(evt);
            }
        });
        Jtrans.add(opHistorial);

        jMenuBar1.add(Jtrans);

        opEditEstados.setText("Edit");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem5.setText("edit_estados");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        opEditEstados.add(jMenuItem5);

        opEditCat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opEditCat.setText("edit_categorias");
        opEditCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEditCatActionPerformed(evt);
            }
        });
        opEditEstados.add(opEditCat);

        jMenuBar1.add(opEditEstados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistrarUsuarioActionPerformed
        // TODO add your handling code here:
        Registar_Usuarios verRestriar = new Registar_Usuarios();
        escritorio.add(verRestriar);
        verRestriar.show();
        
        
    }//GEN-LAST:event_opRegistrarUsuarioActionPerformed

    private void opRegistrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistrarLibrosActionPerformed
        // TODO add your handling code here:
        Registar_Libros verLibros = new Registar_Libros();
        escritorio.add(verLibros);
        verLibros.show();
    }//GEN-LAST:event_opRegistrarLibrosActionPerformed

    private void opGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGenerosActionPerformed
        // TODO add your handling code here:
        Registrar_Generos vGeneros = new Registrar_Generos();
        escritorio.add(vGeneros);
        vGeneros.show();
    }//GEN-LAST:event_opGenerosActionPerformed

    private void opTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTramitesActionPerformed
        // TODO add your handling code here:
        Registrar_Tramites vertrTramites = new Registrar_Tramites();
        escritorio.add(vertrTramites);
        vertrTramites.show();
    }//GEN-LAST:event_opTramitesActionPerformed

    private void opHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opHistorialActionPerformed
        // TODO add your handling code here:
        Ver_Historial verHisto = new Ver_Historial();
        escritorio.add(verHisto);
        verHisto.show();
    }//GEN-LAST:event_opHistorialActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Edit_estados Es = new Edit_estados();
        escritorio.add(Es);
        Es.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void opCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCatalogoActionPerformed
        // TODO add your handling code here:
        Ver_Catalogo verCat = new Ver_Catalogo();
        escritorio.add(verCat);
        verCat.show();
    }//GEN-LAST:event_opCatalogoActionPerformed

    private void Ver_DebolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_DebolucionActionPerformed
        // TODO add your handling code here:
        Registrar_Debolucion RB = new Registrar_Debolucion();
        escritorio.add(RB);
        RB.show();
    }//GEN-LAST:event_Ver_DebolucionActionPerformed

    private void JadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JadminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JadminMouseClicked

    private void opEditCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEditCatActionPerformed
        // TODO add your handling code here:
        Edit_Categoria EC = new Edit_Categoria();
        escritorio.add(EC);
        EC.show();
    }//GEN-LAST:event_opEditCatActionPerformed

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
            java.util.logging.Logger.getLogger(Principall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jadmin;
    private javax.swing.JMenu Jlibros;
    private javax.swing.JMenu Jtrans;
    private javax.swing.JMenuItem Ver_Debolucion;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem opCatalogo;
    private javax.swing.JMenuItem opEditCat;
    private javax.swing.JMenu opEditEstados;
    private javax.swing.JMenuItem opGeneros;
    private javax.swing.JMenuItem opHistorial;
    private javax.swing.JMenuItem opRegistrarLibros;
    private javax.swing.JMenuItem opRegistrarUsuario;
    private javax.swing.JMenuItem opTramites;
    // End of variables declaration//GEN-END:variables
}
