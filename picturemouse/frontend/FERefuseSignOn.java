/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class FERefuseSignOn extends javax.swing.JFrame {
    
    /**
     * Creates new form SignOn
     */
    public FERefuseSignOn() {
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

        topPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblRefuseSignOn = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        tbxUsername = new javax.swing.JTextField();
        tbxPassword = new javax.swing.JPasswordField();
        bottomPanel = new javax.swing.JPanel();
        btnSignOn = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 153));
        setName("signOn"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(51, 102, 255));
        topPanel.setName("topPanel"); // NOI18N
        topPanel.setPreferredSize(new java.awt.Dimension(421, 95));

        lblWelcome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome to the PictureMouse Cinema Self Service!");
        lblWelcome.setAlignmentX(0.5F);

        lblRefuseSignOn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblRefuseSignOn.setForeground(new java.awt.Color(255, 255, 255));
        lblRefuseSignOn.setText("The password entered was incorrect.");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                        .addComponent(lblRefuseSignOn)
                        .addGap(111, 111, 111))))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRefuseSignOn)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel);
        topPanel.getAccessibleContext().setAccessibleName("topPanel");

        centrePanel.setBackground(new java.awt.Color(51, 102, 255));
        centrePanel.setPreferredSize(new java.awt.Dimension(421, 86));

        lblUsername.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbxUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(tbxPassword))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(tbxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(tbxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(centrePanel);

        bottomPanel.setBackground(new java.awt.Color(51, 102, 255));
        bottomPanel.setPreferredSize(new java.awt.Dimension(421, 70));

        btnSignOn.setBackground(new java.awt.Color(255, 255, 255));
        btnSignOn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSignOn.setText("Sign On");
        btnSignOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOnActionPerformed(evt);
            }
        });

        btnCreateAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(255, 255, 255));
        btnQuit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.setPreferredSize(new java.awt.Dimension(119, 25));
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCreateAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnSignOn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignOn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(bottomPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOnActionPerformed
        // TODO add your handling code here:
        // Put this after calling doIt() SignOn in backend.
        String username = this.tbxUsername.getText(); 
        char[] charPassword = this.tbxPassword.getPassword();
        String password = "";
        for(int i = 0; i < charPassword.length; i++)
        {
            password += charPassword[i];
            charPassword[i] = 0;
        }
        picturemouse.backend.BESignOn signOnInstance = new picturemouse.backend.BESignOn();
        if (signOnInstance.doIt(username, password))
        {
            if(username.equals("Administrator"))
            {
                this.setVisible(false);
                new FEAdministratorOptions().setVisible(true);
            }
            else
            {
                this.setVisible(false);
                new FECustomerOptions().setVisible(true);
            }
        }
        else
        {
            this.setVisible(false);
            new FERefuseSignOn().setVisible(true);
        }
        
    }//GEN-LAST:event_btnSignOnActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FENewUser().setVisible(true);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        System.out.println("Quitting Application");
        int result = JOptionPane.showConfirmDialog(this, "Are you sure that "
                + "you want to Quit this Application?", "Quit Confirmation", 
                JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(FERefuseSignOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FERefuseSignOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FERefuseSignOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FERefuseSignOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FERefuseSignOn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSignOn;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRefuseSignOn;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPasswordField tbxPassword;
    private javax.swing.JTextField tbxUsername;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
