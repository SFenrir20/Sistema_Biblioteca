/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.sistema_biblioteca;

import Controllers.CategoriaController;
import Model.Categorias_US;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santi
 */
public class Edit_Categoria extends javax.swing.JInternalFrame {

    private DefaultTableModel dtmGenero = new DefaultTableModel();
    private CategoriaController CatController = new CategoriaController();
    private DefaultComboBoxModel Cbox = new DefaultComboBoxModel();
  
    
    
    
    public Edit_Categoria() {
        initComponents();
        llenarTabla();
        ListarTabla();
    }
    
     public void llenarTabla(){
        dtmGenero.addColumn("Codigo");
        dtmGenero.addColumn("Nombre Categoria");
        dtmGenero.addColumn("Descripcion");
    }
    public void ListarTabla(){
        dtmGenero.setRowCount(0);
        List<Categorias_US> lst = CatController.getLstGenerosController();
        for (int i=0;i<lst.size();i++){
            Object[] vec = new Object[3];
            vec[0] = lst.get(i).getId_Categoria();
            vec[1] = lst.get(i).getNombre_Categoria();
            vec[2] = lst.get(i).getDes_Categoria();
            
            dtmGenero.addRow(vec);
        }
        this.tb_Gen.setModel(dtmGenero);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Gen1 = new javax.swing.JTable();
        Btn_New1 = new javax.swing.JButton();
        Btn_Save1 = new javax.swing.JButton();
        Btn_Delete1 = new javax.swing.JButton();
        Btn_Edit1 = new javax.swing.JButton();
        txtCodigo2 = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtDes1 = new javax.swing.JTextField();
        Btn_Search1 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Gen = new javax.swing.JTable();
        Btn_New = new javax.swing.JButton();
        Btn_Save = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        Btn_Edit = new javax.swing.JButton();
        txtCodigo1 = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        Btn_Search = new javax.swing.JButton();
        Btn_New3 = new javax.swing.JButton();
        Btn_Save3 = new javax.swing.JButton();
        Btn_Delete3 = new javax.swing.JButton();
        Btn_Edit3 = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtName3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDes3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Btn_Search3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_Gen3 = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);

        jLabel8.setText("Codigo:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("Descripcion:");

        tb_Gen1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tb_Gen1);

        Btn_New1.setText("NEW");
        Btn_New1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_New1ActionPerformed(evt);
            }
        });

        Btn_Save1.setText("SAVE");
        Btn_Save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Save1ActionPerformed(evt);
            }
        });

        Btn_Delete1.setText("DELETE");
        Btn_Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Delete1ActionPerformed(evt);
            }
        });

        Btn_Edit1.setText("EDIT");
        Btn_Edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Edit1ActionPerformed(evt);
            }
        });

        Btn_Search1.setText("SEARCH");
        Btn_Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Search1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_New1)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(Btn_Save1)
                                .addGap(27, 27, 27)
                                .addComponent(Btn_Delete1))
                            .addComponent(txtCodigo2)
                            .addComponent(txtName1)
                            .addComponent(txtDes1))
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Edit1)
                            .addComponent(Btn_Search1))))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Search1))
                .addGap(19, 19, 19)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_New1)
                    .addComponent(Btn_Save1)
                    .addComponent(Btn_Delete1)
                    .addComponent(Btn_Edit1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setTitle("Editar Categoria");

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);

        jLabel5.setText("Codigo:");

        jLabel6.setText("Nombre:");

        jLabel7.setText("Descripcion:");

        tb_Gen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_Gen);

        Btn_New.setText("NEW");
        Btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NewActionPerformed(evt);
            }
        });

        Btn_Save.setText("SAVE");
        Btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SaveActionPerformed(evt);
            }
        });

        Btn_Delete.setText("DELETE");
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });

        Btn_Edit.setText("EDIT");
        Btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditActionPerformed(evt);
            }
        });

        Btn_Search.setText("SEARCH");
        Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_New)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(Btn_Save)
                                .addGap(27, 27, 27)
                                .addComponent(Btn_Delete))
                            .addComponent(txtCodigo1)
                            .addComponent(txtName)
                            .addComponent(txtDes))
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Edit)
                            .addComponent(Btn_Search))))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Search))
                .addGap(19, 19, 19)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_New)
                    .addComponent(Btn_Save)
                    .addComponent(Btn_Delete)
                    .addComponent(Btn_Edit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Btn_New3.setText("NEW");
        Btn_New3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_New3ActionPerformed(evt);
            }
        });

        Btn_Save3.setText("SAVE");
        Btn_Save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Save3ActionPerformed(evt);
            }
        });

        Btn_Delete3.setText("DELETE");
        Btn_Delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Delete3ActionPerformed(evt);
            }
        });

        Btn_Edit3.setText("EDIT");
        Btn_Edit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Edit3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        Btn_Search3.setText("SEARCH");
        Btn_Search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Search3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion:");

        tb_Gen3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tb_Gen3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 232, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 232, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btn_New3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_Save3)
                                    .addGap(27, 27, 27)
                                    .addComponent(Btn_Delete3))
                                .addComponent(txtCodigo)
                                .addComponent(txtName3)
                                .addComponent(txtDes3))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btn_Edit3)
                                .addComponent(Btn_Search3))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 266, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 266, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Search3))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtDes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_New3)
                        .addComponent(Btn_Save3)
                        .addComponent(Btn_Delete3)
                        .addComponent(Btn_Edit3))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText(CatController.GetCorrelativoController()+"");
        txtName.setText("");
        txtDes.setText("");
    }//GEN-LAST:event_Btn_NewActionPerformed

    private void Btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SaveActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        objGen.setNombre_Categoria(this.txtName.getText());
        objGen.setDes_Categoria(this.txtDes.getText());

        CatController.InsertarLibrosController(objGen);
        JOptionPane.showMessageDialog(this, "Registro correcto");
        ListarTabla();
    }//GEN-LAST:event_Btn_SaveActionPerformed

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        CatController.EliminarLibrosController(objGen);

        JOptionPane.showMessageDialog(this, "¿Deseas borrar registro?");
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void Btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        objGen.setNombre_Categoria(this.txtName.getText());
        objGen.setDes_Categoria(this.txtDes.getText());

        CatController.ActualizarGenerosController(objGen);
        JOptionPane.showMessageDialog(this, "Registro correcto");
        ListarTabla();
    }//GEN-LAST:event_Btn_EditActionPerformed

    private void Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SearchActionPerformed
        // TODO add your handling code here:
        List<Categorias_US> lst = CatController.BuscarCodigoController(Integer.parseInt(this.txtCodigo.getText()));
        for(Categorias_US x:lst){
            this.txtName.setText(x.getNombre_Categoria());
            // System.out.println("error 1");
            this.txtDes.setText(x.getDes_Categoria());

        }
    }//GEN-LAST:event_Btn_SearchActionPerformed

    private void Btn_New1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_New1ActionPerformed

    }//GEN-LAST:event_Btn_New1ActionPerformed

    private void Btn_Save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Save1ActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        objGen.setNombre_Categoria(this.txtName.getText());
        objGen.setDes_Categoria(this.txtDes.getText());

        CatController.InsertarLibrosController(objGen);
        JOptionPane.showMessageDialog(this, "Registro correcto");
        ListarTabla();
    }//GEN-LAST:event_Btn_Save1ActionPerformed

    private void Btn_Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Delete1ActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        CatController.EliminarLibrosController(objGen);

        JOptionPane.showMessageDialog(this, "¿Deseas borrar registro?");
    }//GEN-LAST:event_Btn_Delete1ActionPerformed

    private void Btn_Edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Edit1ActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        objGen.setNombre_Categoria(this.txtName.getText());
        objGen.setDes_Categoria(this.txtDes.getText());

        CatController.ActualizarGenerosController(objGen);
        JOptionPane.showMessageDialog(this, "Registro correcto");
        ListarTabla();
    }//GEN-LAST:event_Btn_Edit1ActionPerformed

    private void Btn_Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Search1ActionPerformed
        // TODO add your handling code here:
        List<Categorias_US> lst = CatController.BuscarCodigoController(Integer.parseInt(this.txtCodigo.getText()));
        for(Categorias_US x:lst){
            this.txtName.setText(x.getNombre_Categoria());
            // System.out.println("error 1");
            this.txtDes.setText(x.getDes_Categoria());

        }
    }//GEN-LAST:event_Btn_Search1ActionPerformed

    private void Btn_New3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_New3ActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText(CatController.GetCorrelativoController()+"");
        txtName.setText("");
        txtDes.setText("");
    }//GEN-LAST:event_Btn_New3ActionPerformed

    private void Btn_Save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Save3ActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        objGen.setNombre_Categoria(this.txtName.getText());
        objGen.setDes_Categoria(this.txtDes.getText());

        CatController.InsertarLibrosController(objGen);
        JOptionPane.showMessageDialog(this, "Registro correcto");
        ListarTabla();
    }//GEN-LAST:event_Btn_Save3ActionPerformed

    private void Btn_Delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Delete3ActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        CatController.EliminarLibrosController(objGen);

        JOptionPane.showMessageDialog(this, "¿Deseas borrar registro?");
    }//GEN-LAST:event_Btn_Delete3ActionPerformed

    private void Btn_Edit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Edit3ActionPerformed
        // TODO add your handling code here:
        Categorias_US objGen = new Categorias_US();
        objGen.setId_Categoria(Integer.parseInt(this.txtCodigo.getText()));
        objGen.setNombre_Categoria(this.txtName.getText());
        objGen.setDes_Categoria(this.txtDes.getText());

        CatController.ActualizarGenerosController(objGen);
        JOptionPane.showMessageDialog(this, "Registro correcto");
        ListarTabla();
    }//GEN-LAST:event_Btn_Edit3ActionPerformed

    private void Btn_Search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Search3ActionPerformed
        // TODO add your handling code here:
        List<Categorias_US> lst = CatController.BuscarCodigoController(Integer.parseInt(this.txtCodigo.getText()));
        for(Categorias_US x:lst){
            this.txtName.setText(x.getNombre_Categoria());
            // System.out.println("error 1");
            this.txtDes.setText(x.getDes_Categoria());

        }
    }//GEN-LAST:event_Btn_Search3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Delete;
    private javax.swing.JButton Btn_Delete1;
    private javax.swing.JButton Btn_Delete3;
    private javax.swing.JButton Btn_Edit;
    private javax.swing.JButton Btn_Edit1;
    private javax.swing.JButton Btn_Edit3;
    private javax.swing.JButton Btn_New;
    private javax.swing.JButton Btn_New1;
    private javax.swing.JButton Btn_New3;
    private javax.swing.JButton Btn_Save;
    private javax.swing.JButton Btn_Save1;
    private javax.swing.JButton Btn_Save3;
    private javax.swing.JButton Btn_Search;
    private javax.swing.JButton Btn_Search1;
    private javax.swing.JButton Btn_Search3;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tb_Gen;
    private javax.swing.JTable tb_Gen1;
    private javax.swing.JTable tb_Gen3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtDes1;
    private javax.swing.JTextField txtDes3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName3;
    // End of variables declaration//GEN-END:variables
}
