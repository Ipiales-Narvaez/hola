/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectoSemillero.ventanas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Semilleros extends javax.swing.JPanel {
    DefaultTableModel modelo;
    
    /**
     * Creates new form Semilleros
     */
    public Semilleros() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Semillero");
        modelo.addColumn("Nombre");
        modelo.addColumn("Sede");
        modelo.addColumn("Correo");
        modelo.addColumn("Coordinador");
        this.jTableSemro.setModel(modelo);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jp_semilleros = new javax.swing.JPanel();
        jp_semilleros1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtSede = new javax.swing.JTextField();
        txtNomSemro = new javax.swing.JTextField();
        txtCoord = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSemro = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        jp_semilleros.setBackground(new java.awt.Color(0, 204, 204));

        jp_semilleros1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Sede");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Correo");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Coordinador");

        txtEmail.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtSede.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        txtSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSedeActionPerformed(evt);
            }
        });

        txtNomSemro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        txtNomSemro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomSemroActionPerformed(evt);
            }
        });

        txtCoord.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        txtCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoordActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jTextField2.setText("Consultar");

        javax.swing.GroupLayout jp_semilleros1Layout = new javax.swing.GroupLayout(jp_semilleros1);
        jp_semilleros1.setLayout(jp_semilleros1Layout);
        jp_semilleros1Layout.setHorizontalGroup(
            jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_semilleros1Layout.createSequentialGroup()
                .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_semilleros1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_semilleros1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSede)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomSemro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail)
                            .addComponent(txtCoord, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jp_semilleros1Layout.setVerticalGroup(
            jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_semilleros1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomSemro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jp_semilleros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTableSemro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jTableSemro.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableSemro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSemroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSemro);

        javax.swing.GroupLayout jp_semillerosLayout = new javax.swing.GroupLayout(jp_semilleros);
        jp_semilleros.setLayout(jp_semillerosLayout);
        jp_semillerosLayout.setHorizontalGroup(
            jp_semillerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_semillerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jp_semilleros1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_semillerosLayout.setVerticalGroup(
            jp_semillerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_semillerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_semilleros1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_semilleros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_semilleros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSedeActionPerformed

    private void txtNomSemroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomSemroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomSemroActionPerformed

    private void txtCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoordActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String []semro=new String[5];
        semro[0]=txtID.getText();
        semro[1]=txtNomSemro.getText();
        semro[2]=txtSede.getText();
        semro[3]=txtEmail.getText();
        semro[4]=txtCoord.getText();
        modelo.addRow(semro);
        
        txtID.setText("");
        txtNomSemro.setText("");
        txtSede.setText("");
        txtEmail.setText("");
        txtCoord.setText("");
        
       // Conexion prueba = new Conexion();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTableSemroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSemroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableSemroMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = jTableSemro.getRowCount();
        for (int i = fila-1; i>=0; i--){
            modelo.removeRow(i);
          
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSemro;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jp_semilleros;
    private javax.swing.JPanel jp_semilleros1;
    private javax.swing.JTextField txtCoord;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomSemro;
    private javax.swing.JTextField txtSede;
    // End of variables declaration//GEN-END:variables
}
