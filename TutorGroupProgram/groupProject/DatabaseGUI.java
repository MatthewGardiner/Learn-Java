/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtableapp;

/**
 *
 * @author Andrew
 */
public class DatabaseGUI extends javax.swing.JFrame {

    //Creates new form DatabaseGUI
    public DatabaseGUI() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        databaseTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        //sets program to exit when the user closes
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
//sets layout to absolute layout
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
//sets contents of rows
        databaseTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null}
                },
                //sets contents of collumns titles

                new String[]{
                    "Tutor Name", "Tutor E-Mail", "Tutor UoB Number", "Student Name", "Student E-Mail", "Student UoB Number", "Year/Course", "Team Number"
                }
        ) {
            //makes the contents of the collumns uneditable
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(databaseTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 1110, 430));

        //sets colour of background
        jPanel1.setBackground(new java.awt.Color(138, 209, 255));

//sets names of buttons and creates action listners 
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUploadActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                
                //sets location and size of all buttons            
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(520, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 610));

        pack();
    }// </editor-fold>                        

//creates action listener for buttons
    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // put code to edit database data here:
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUploadActionPerformed
        // put code to upload new data here:
    }//GEN-LAST:event_BtnUploadActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        // add code for search function:
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void BtnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoadActionPerformed
        //add code for load function:
    }//GEN-LAST:event_BtnLoadActionPerformed

    public static void main(String args[]) {

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseGUI().setVisible(true);
            }
        });
    }

    // Declaring all variables 
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpload;
    private javax.swing.JTable databaseTable;
    private javax.swing.JPanel jPanel1;

    private javax.swing.JScrollPane jScrollPane2;
    }
