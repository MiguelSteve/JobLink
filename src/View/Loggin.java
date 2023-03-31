/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import javax.swing.JOptionPane;
import View.TelaCriador;
import dao.Banco;

import javax.swing.JDesktopPane;
import org.w3c.dom.UserDataHandler;

/**
 *
 * @author Migue
 */
public class Loggin extends javax.swing.JFrame {

    Banco ObjBanco = new Banco();
    

    public Loggin() {
        initComponents();
    }
    

         TelaCriador CadastroUser = new TelaCriador();
                   boolean found =false;

                   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextUser = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
        BoxUser = new javax.swing.JComboBox<>();
        BotaoLoggin = new javax.swing.JButton();
        UserLabel = new javax.swing.JLabel();
        SenhaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        TextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserActionPerformed(evt);
            }
        });

        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });

        BoxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">>>Selecione uma opcao<<<", "Criador", "Secretaria", "Aluno", "Empresa", " " }));
        BoxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxUserActionPerformed(evt);
            }
        });

        BotaoLoggin.setText("Loggin");
        BotaoLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogginActionPerformed(evt);
            }
        });

        UserLabel.setBackground(new java.awt.Color(0, 0, 0));
        UserLabel.setForeground(new java.awt.Color(0, 0, 0));
        UserLabel.setText("User");
        UserLabel.setToolTipText("");

        SenhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        SenhaLabel.setText("Senha");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cargo");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(BotaoLoggin)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(SenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextUser))
                            .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UserLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(SenhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoLoggin)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

          

    private void TextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextUserActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

    private void BotaoLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogginActionPerformed
        // TODO add your handling code here:
        
        if (BoxUser.getSelectedIndex()==1 && TextUser.getText().equals("Miguel") && TextSenha.getText().equals("1234")) {
            CadastroUser.setVisible(true);
            
            
        }
 
                
                

        if(BoxUser.getSelectedIndex()==2 && TextUser.getText().equals(CadastroUser.user[1]) &&TextSenha.getText().equals(CadastroUser.senha[1]) ){
            JOptionPane.showMessageDialog(null, "BEM VINDO SECRETARIA");
            
        }
                if(BoxUser.getSelectedIndex()==3 && TextUser.getText().equals(CadastroUser.user[2]) &&TextSenha.getText().equals(CadastroUser.senha[2]) ){
            JOptionPane.showMessageDialog(null, "BEM VINDO ALUNO");
            
        }
                        if(BoxUser.getSelectedIndex()==4 && TextUser.getText().equals(CadastroUser.user[3]) &&TextSenha.getText().equals(CadastroUser.senha[3]) ){
            JOptionPane.showMessageDialog(null, "BEM VINDA EMPRESA");
            
        }
        if (BoxUser.getSelectedIndex()==0) {
        
            JOptionPane.showMessageDialog(null, "SELECIONE UM CARGO");
        }

        
        //if(TextUser.getText().equals(ObjUsuarios.usersecretaria[0]) && BoxUser.getSelectedIndex()==2){
            
          //              JOptionPane.showMessageDialog(null, "BEM VINDO SECRETARIA");

        //}


  
    }//GEN-LAST:event_BotaoLogginActionPerformed

    private void BoxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxUserActionPerformed
        // TODO add your handling code here:
        switch(BoxUser.getSelectedIndex()){
           case 0:
                 break;
             case 1:
                UserLabel.setText("Usuario");
                break;
            case 2:
                UserLabel.setText("CPF");

                                break;

            case 3:
                UserLabel.setText("RA");

                                break;

            case 4:
                UserLabel.setText("CNPJ");

                                break;

        }

        

    }//GEN-LAST:event_BoxUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                            boolean loginValido = false;

         for (int i = 0; i < ObjBanco.usuarios.length; i++) {
        if (ObjBanco.usuarios[i][0].equals(TextUser.getText()) && ObjBanco.usuarios[i][1].equals(TextSenha.getText())) {
                            loginValido = true;
                            
                        }
                    }

                    if (loginValido == true) {
                        JOptionPane.showMessageDialog(null,"Login efetuado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos!");
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLoggin;
    private javax.swing.JComboBox<String> BoxUser;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUser;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
