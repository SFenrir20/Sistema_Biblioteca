/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_biblioteca;

/**
 *
 * @author santi
 */
public class Principall extends javax.swing.JFrame {

    /**
     * Creates new form Principall
     */
    public Principall() {
        initComponents();
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
        jMenu1 = new javax.swing.JMenu();
        opRegistrarUsuario = new javax.swing.JMenuItem();
        Libros = new javax.swing.JMenu();
        opRegistrarLibros = new javax.swing.JMenuItem();
        opGeneros = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opTramites = new javax.swing.JMenuItem();
        opCatalogo = new javax.swing.JMenuItem();
        opHistorial = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jMenu1.setText("Admin");

        opRegistrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opRegistrarUsuario.setText("Registrar Usuarios");
        opRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(opRegistrarUsuario);

        jMenuBar1.add(jMenu1);

        Libros.setText("Libros");

        opRegistrarLibros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opRegistrarLibros.setText("Registrar Libros");
        opRegistrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarLibrosActionPerformed(evt);
            }
        });
        Libros.add(opRegistrarLibros);

        opGeneros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opGeneros.setText("Registrar Generos");
        opGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGenerosActionPerformed(evt);
            }
        });
        Libros.add(opGeneros);

        jMenuBar1.add(Libros);

        jMenu3.setText("Transaccion");

        opTramites.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opTramites.setText("Tramites");
        opTramites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTramitesActionPerformed(evt);
            }
        });
        jMenu3.add(opTramites);

        opCatalogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opCatalogo.setText("Catalogo");
        opCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCatalogoActionPerformed(evt);
            }
        });
        jMenu3.add(opCatalogo);

        opHistorial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opHistorial.setText("Historial");
        opHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opHistorialActionPerformed(evt);
            }
        });
        jMenu3.add(opHistorial);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Edit");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem5.setText("edit_estados");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("edit_categorias");
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void opCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCatalogoActionPerformed
        // TODO add your handling code here:
        Ver_Catalogo verCat = new Ver_Catalogo();
        escritorio.add(verCat);
        verCat.show();
    }//GEN-LAST:event_opCatalogoActionPerformed

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
    private javax.swing.JMenu Libros;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem opCatalogo;
    private javax.swing.JMenuItem opGeneros;
    private javax.swing.JMenuItem opHistorial;
    private javax.swing.JMenuItem opRegistrarLibros;
    private javax.swing.JMenuItem opRegistrarUsuario;
    private javax.swing.JMenuItem opTramites;
    // End of variables declaration//GEN-END:variables
}
