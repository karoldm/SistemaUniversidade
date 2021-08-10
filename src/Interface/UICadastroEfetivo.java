/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controlador.Controlador;
import Interface.Utils.Utils;
import Modelo.Departamento;
import Modelo.Efetivo;
import Modelo.Funcionario;
import Modelo.Substituto;
import Modelo.Tecnico;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author karol
 */
public class UICadastroEfetivo extends javax.swing.JDialog {

    Controlador controller;

    /**
     * Creates new form UICadastroEfetivo
     */
    public UICadastroEfetivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controller = new Controlador();
        LabelCadastro.setVisible(false);
        Departamento[] Dep = controller.getDep();
        if (Dep[0] != null) {
            for (int i = 0; Dep[i] != null; i++) {
                ComboBoxDep.addItem(Dep[i].getNome());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nnenhum departamento cadastrado! "
                    + "Para continuar cadastre um departamento primeiro", "Atenção", JOptionPane.ERROR_MESSAGE);
            TextFieldCodigo.setEnabled(false);
            TextFieldNome.setEnabled(false);
            TextFieldSalario.setEnabled(false);
            TextFieldTitulacao.setEnabled(false);
            TextFieldArea.setEnabled(false);
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

        LabelCadastro = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JTextField();
        TextFieldCodigo = new javax.swing.JTextField();
        ButtonCadastro = new javax.swing.JButton();
        LabelCod = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        TextFieldTitulacao = new javax.swing.JTextField();
        LabelSalario = new javax.swing.JLabel();
        LabelNivel = new javax.swing.JLabel();
        ComboBoxNivel = new javax.swing.JComboBox<>();
        LabelTitulacao = new javax.swing.JLabel();
        TextFieldSalario = new javax.swing.JTextField();
        LabelArea = new javax.swing.JLabel();
        TextFieldArea = new javax.swing.JTextField();
        LabelDep = new javax.swing.JLabel();
        ComboBoxDep = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Docente Efetivo");
        setResizable(false);

        LabelCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCadastro.setForeground(new java.awt.Color(255, 0, 0));
        LabelCadastro.setText("Ops! Funcionário já cadastrado!");

        TextFieldNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        ButtonCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonCadastro.setText("Cadastrar");
        ButtonCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastroActionPerformed(evt);
            }
        });

        LabelCod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelCod.setText("Código ");

        LabelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelNome.setText("Nome ");

        TextFieldTitulacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelSalario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelSalario.setText("Salário ");

        LabelNivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelNivel.setText("Nível");

        ComboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D1", "D2", "D3" }));
        ComboBoxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNivelActionPerformed(evt);
            }
        });

        LabelTitulacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelTitulacao.setText("Titulação");

        TextFieldSalario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSalarioActionPerformed(evt);
            }
        });

        LabelArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelArea.setText("Área");

        TextFieldArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelDep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelDep.setText("Departamento");

        ComboBoxDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDepActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDep)
                            .addComponent(ComboBoxDep, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNome))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelNivel)
                                    .addComponent(ComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTitulacao)
                                    .addComponent(TextFieldTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelArea)
                                    .addComponent(TextFieldArea)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelCod)
                                            .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelSalario))))))
                        .addGap(37, 37, 37))))
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
                    .addComponent(LabelCod)
                    .addComponent(LabelSalario)
                    .addComponent(LabelDep, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(ButtonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(LabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastroActionPerformed
        // TODO add your handling code here:
        String codigo = TextFieldCodigo.getText();
        String nome = TextFieldNome.getText();
        String salario = TextFieldSalario.getText();
        String titulacao = TextFieldTitulacao.getText();
        String area = TextFieldArea.getText();
        String nivel = (String) ComboBoxNivel.getSelectedItem();
        String dep = controller.buscarDepartamentoNome((String) ComboBoxDep.getSelectedItem()).getCodigo();
        String[] values = {codigo, nome, salario, titulacao, area, dep};
        if (Utils.hasNull(values)) {
            JOptionPane.showMessageDialog(this, "Todos os campos precisam ser preenchidos!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (!Utils.isFloat(salario)) {
            JOptionPane.showMessageDialog(this, "Salário precisa ser um valor numérico!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
            TextFieldSalario.setText("");
        } else {
            controller.addEfetivo(codigo, nome, Double.parseDouble(salario), nivel, titulacao, area, dep);
            TextFieldCodigo.setText("");
            TextFieldNome.setText("");
            TextFieldSalario.setText("");
            TextFieldTitulacao.setText("");
            TextFieldArea.setText("");
            JOptionPane.showMessageDialog(this, "Docente cadastrado com sucesso!",
                    "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_ButtonCadastroActionPerformed


    private void ComboBoxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxNivelActionPerformed

    private void TextFieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSalarioActionPerformed

    private void TextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoActionPerformed

    private void ComboBoxDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDepActionPerformed

    private void TextFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCodigoFocusLost
        // TODO add your handling code here:
        String codigo = TextFieldCodigo.getText();
        String dep = controller.buscarDepartamentoNome((String) ComboBoxDep.getSelectedItem()).getCodigo();
        Funcionario F = controller.getFuncionario(dep, codigo);
        if (F != null) {
            LabelCadastro.setVisible(true);
            TextFieldCodigo.setText(F.getCodigo());
            TextFieldNome.setText(F.getNome());
            TextFieldSalario.setText(Float.toString((float) F.getSalario()));
            ComboBoxNivel.getModel().setSelectedItem(F.getNivel());
            ButtonCadastro.setEnabled(false);
            if (F instanceof Efetivo) {
                Efetivo E = (Efetivo) F;
                TextFieldTitulacao.setText(E.getTitulacao());
                TextFieldArea.setText(E.getArea());
            } else if (F instanceof Substituto) {
                Substituto S = (Substituto) F;
                TextFieldTitulacao.setText(S.getTitulacao());
                LabelArea.setText("Carga Horária");
                TextFieldArea.setText(Integer.toString(S.getCargaHoraria()));
            } else if (F instanceof Tecnico) {
                Tecnico T = (Tecnico) F;
                LabelArea.setEnabled(false);
                TextFieldArea.setEnabled(false);
                LabelTitulacao.setText("Função");
                TextFieldTitulacao.setText(T.getFuncao());
            }
        }
    }//GEN-LAST:event_TextFieldCodigoFocusLost

    private void TextFieldCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCodigoFocusGained
        // TODO add your handling code here:
        LabelArea.setEnabled(true);
        TextFieldArea.setEnabled(true);
        LabelArea.setText("Área");
        ButtonCadastro.setEnabled(true);
        LabelCadastro.setVisible(false);
        LabelTitulacao.setText("Titulacao");
        TextFieldCodigo.setText("");
        TextFieldNome.setText("");
        TextFieldSalario.setText("");
        TextFieldTitulacao.setText("");
        TextFieldArea.setText("");
    }//GEN-LAST:event_TextFieldCodigoFocusGained

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
            java.util.logging.Logger.getLogger(UICadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UICadastroEfetivo dialog = new UICadastroEfetivo(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel LabelArea;
    private javax.swing.JLabel LabelCadastro;
    private javax.swing.JLabel LabelCod;
    private javax.swing.JLabel LabelDep;
    private javax.swing.JLabel LabelNivel;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JLabel LabelTitulacao;
    private javax.swing.JTextField TextFieldArea;
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldSalario;
    private javax.swing.JTextField TextFieldTitulacao;
    // End of variables declaration//GEN-END:variables
}
