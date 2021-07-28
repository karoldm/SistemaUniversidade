
package Interface;

/**
 *
 * @author karol
 */
public class UIHome extends javax.swing.JFrame {

    /**
     * Creates new form UIHome
     */
    public UIHome() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuDep = new javax.swing.JMenu();
        MenuAddDep = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuAddEfetivo = new javax.swing.JMenuItem();
        MenuAddTecnico = new javax.swing.JMenuItem();
        MenuAddSub = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/images/imageBackground.jpeg"))); // NOI18N

        MenuDep.setText("Cadastrar Departamento");
        MenuDep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDepActionPerformed(evt);
            }
        });

        MenuAddDep.setText("Cadastrar em UNESP");
        MenuAddDep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddDepActionPerformed(evt);
            }
        });
        MenuDep.add(MenuAddDep);

        jMenuBar1.add(MenuDep);

        jMenu2.setText("Cadastrar Funcionário");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MenuAddEfetivo.setText("Efetivo");
        MenuAddEfetivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddEfetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddEfetivoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAddEfetivo);

        MenuAddTecnico.setText("Técnico");
        MenuAddTecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddTecnicoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAddTecnico);

        MenuAddSub.setText("Substituto");
        MenuAddSub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddSubActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAddSub);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem4.setText("Departamentos");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Funcionários");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Buscar");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem6.setText("Departamento");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Funcionário");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void MenuDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDepActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_MenuDepActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void MenuAddEfetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddEfetivoActionPerformed
        UICadastroEfetivo CadastroEfetivo = new UICadastroEfetivo(this, true);
        CadastroEfetivo.setLocationRelativeTo(null);
        CadastroEfetivo.setVisible(true);
    }//GEN-LAST:event_MenuAddEfetivoActionPerformed

    private void MenuAddDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddDepActionPerformed
        // TODO add your handling code here:
        UICadastroDep CadastroDep = new UICadastroDep(this, true);
        CadastroDep.setLocationRelativeTo(null);
        CadastroDep.setVisible(true);
    }//GEN-LAST:event_MenuAddDepActionPerformed

    private void MenuAddTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddTecnicoActionPerformed
        // TODO add your handling code here:
        UICadastroTecnico CadastroTec = new UICadastroTecnico(this, true);
        CadastroTec.setLocationRelativeTo(null);
        CadastroTec.setVisible(true);
    }//GEN-LAST:event_MenuAddTecnicoActionPerformed

    private void MenuAddSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddSubActionPerformed
        // TODO add your handling code here:
        UICadastroSub CadastroSub = new UICadastroSub(this, true);
        CadastroSub.setLocationRelativeTo(null);
        CadastroSub.setVisible(true);
    }//GEN-LAST:event_MenuAddSubActionPerformed

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
            java.util.logging.Logger.getLogger(UIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAddDep;
    private javax.swing.JMenuItem MenuAddEfetivo;
    private javax.swing.JMenuItem MenuAddSub;
    private javax.swing.JMenuItem MenuAddTecnico;
    private javax.swing.JMenu MenuDep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
