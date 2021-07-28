/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controlador.Controlador;
import Interface.Utils.Utils;
import Modelo.Departamento;
import Modelo.Substituto;
import javax.swing.JOptionPane;

/**
 *
 * @author karol
 */
public class UICadastroSub extends javax.swing.JDialog {
    Controlador controller;
    /**
     * Creates new form UICadastroSub
     */
    public UICadastroSub(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controller = new Controlador();
        LabelCadastro.setVisible(false);
        Departamento[] Dep = controller.getDep();
        if(Dep[0] != null){   
            for (int i = 0; Dep[i] != null; i++) {
                ComboBoxDep.addItem(Dep[i].getNome());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Nnenhum departamento cadastrado! "
                    + "Para continuar cadastre um departamento primeiro", "Atenção", JOptionPane.ERROR_MESSAGE);
            TextFieldCodigo.setEnabled(false);
            TextFieldNome.setEnabled(false);
            TextFieldSalario.setEnabled(false);
            TextFieldTitulacao.setEnabled(false);
            TextFieldCH.setEnabled(false);
            ComboBoxDep.setEnabled(false);
            ComboBoxNivel.setEnabled(false);
            ButtonCadastro.setEnabled(false);
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

        TextFieldNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextFieldCodigo = new javax.swing.JTextField();
        TextFieldCH = new javax.swing.JTextField();
        ButtonCadastro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxDep = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TextFieldTitulacao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxNivel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        LabelCadastro = new javax.swing.JLabel();
        TextFieldSalario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Duncionário Técnico");
        setPreferredSize(new java.awt.Dimension(403, 347));
        setResizable(false);

        TextFieldNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Carga horária");

        TextFieldCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldCodigoFocusLost(evt);
            }
        });
        TextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoActionPerformed(evt);
            }
        });

        TextFieldCH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ButtonCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonCadastro.setText("Cadastrar");
        ButtonCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Departamento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Código ");

        ComboBoxDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDepActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nome ");

        TextFieldTitulacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Salário ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nível");

        ComboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D1", "D2", "D3" }));
        ComboBoxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNivelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Titulação");

        LabelCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCadastro.setForeground(new java.awt.Color(255, 0, 0));
        LabelCadastro.setText("Ops! Docente já cadastrado!");

        TextFieldSalario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(ComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(TextFieldCH)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(ComboBoxDep, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(LabelCadastro)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(ButtonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCodigoFocusGained
        // TODO add your handling code here:
        TextFieldCodigo.setText("");
        ButtonCadastro.setEnabled(true);
        LabelCadastro.setVisible(false);
    }//GEN-LAST:event_TextFieldCodigoFocusGained

    private void TextFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCodigoFocusLost
        // TODO add your handling code here:
        String codigo = TextFieldCodigo.getText();
        String dep = controller.buscarDepartamentoNome((String)ComboBoxDep.getSelectedItem()).getCodigo();
        Substituto S = (Substituto)controller.getFuncionario(dep, codigo);
        if(S != null){
            LabelCadastro.setVisible(true);
            ComboBoxNivel.getModel().setSelectedItem(S.getNivel());
            TextFieldCodigo.setText(S.getCodigo());
            TextFieldNome.setText(S.getNome());
            TextFieldSalario.setText(Float.toString((float) S.getSalario()));
            TextFieldTitulacao.setText(S.getTitulacao());
            TextFieldCH.setText(Integer.toString(S.getCargaHoraria()));
            ButtonCadastro.setEnabled(false);
        }
    }//GEN-LAST:event_TextFieldCodigoFocusLost

    private void TextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoActionPerformed

    private void ButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastroActionPerformed
        // TODO add your handling code here:
        String codigo = TextFieldCodigo.getText();
        String nome = TextFieldNome.getText();
        String salario = TextFieldSalario.getText();
        String titulacao = TextFieldTitulacao.getText();
        String CH = TextFieldCH.getText();
        String nivel = (String)ComboBoxNivel.getSelectedItem();
        String dep = controller.buscarDepartamentoNome((String)ComboBoxDep.getSelectedItem()).getCodigo();
        String[] values = {codigo, nome, salario, titulacao, CH, dep};
        if(Utils.hasNull(values)){
            JOptionPane.showMessageDialog(this, "Todos os campos precisam ser preenchidos!",
                "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else if(!Utils.isFloat(salario)){
            JOptionPane.showMessageDialog(this, "Salário precisa ser um valor numérico!",
                "Atenção", JOptionPane.WARNING_MESSAGE);
            TextFieldSalario.setText("");
        }
        else if(!Utils.isFloat(CH)){
            JOptionPane.showMessageDialog(this, "Formato inválido para carga horária! "
                    + "Introduza um valor númerico.",
                "Atenção", JOptionPane.WARNING_MESSAGE);
            TextFieldSalario.setText("");
        }
        else{
            controller.addSubstituto(codigo, nome, Double.parseDouble(salario), nivel, titulacao, Integer.parseInt(CH), dep);
            TextFieldCodigo.setText("");
            TextFieldNome.setText("");
            TextFieldSalario.setText("");
            TextFieldTitulacao.setText("");
            JOptionPane.showConfirmDialog(this, "Docente cadastrado com sucesso!",
                "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_ButtonCadastroActionPerformed

    private void ComboBoxDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDepActionPerformed

    private void ComboBoxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxNivelActionPerformed

    private void TextFieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(UICadastroSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICadastroSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICadastroSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICadastroSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UICadastroSub dialog = new UICadastroSub(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastro;
    private javax.swing.JComboBox<String> ComboBoxDep;
    private javax.swing.JComboBox<String> ComboBoxNivel;
    private javax.swing.JLabel LabelCadastro;
    private javax.swing.JTextField TextFieldCH;
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldSalario;
    private javax.swing.JTextField TextFieldTitulacao;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
