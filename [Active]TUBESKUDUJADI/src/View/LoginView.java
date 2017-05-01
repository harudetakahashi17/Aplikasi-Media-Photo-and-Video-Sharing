/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;

/**
 *
 * @author Harude
 */
public class LoginView extends javax.swing.JPanel {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
    }
    
    public Object getBtnLogin(){
        return btnLogin;
    }
    
    public Object getBtnSignUp(){
        return btnSignUp;
    }
    
    public Object getBtnHelp(){
        return btnHelp;
    }
    
    public String getUname(){
        return tfUname.getText();
    }
    
    public String getPasswd(){
        return pfPasswd.getText();
    }
    
    public void addListener(ActionListener e) {
        btnSignUp.addActionListener(e);
        btnLogin.addActionListener(e);
        btnHelp.addActionListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        tfUname = new javax.swing.JTextField();
        pfPasswd = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(410, 230));

        Title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title.setText("MEDIA SHARING");

        Username.setText("Username");

        Password.setText("Password");

        tfUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnameActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnHelp.setText("Help");

        btnSignUp.setText("Sign Up");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(0, 275, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSignUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHelp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Username)
                                .addGap(18, 18, 18)
                                .addComponent(tfUname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Password)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLogin)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(pfPasswd))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(tfUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(pfPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHelp)
                    .addComponent(btnSignUp))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
//
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPasswordField pfPasswd;
    private javax.swing.JTextField tfUname;
    // End of variables declaration//GEN-END:variables
}
