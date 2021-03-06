/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import picturemouse.backend.BECinemaTicket;

/**
 *
 * @author John
 */
public class FEModifyAccount extends javax.swing.JFrame {
    
    picturemouse.backend.BEModifyCustomerDetails action = new picturemouse.backend.BEModifyCustomerDetails();
    String oldUsername;
    ArrayList<BECinemaTicket> ticketsPurchased;
    boolean isAdmin;
    
    /**
     * Creates new form SignOn
     */
    public FEModifyAccount(picturemouse.backend.BEAccount account) {
        initComponents();
        this.oldUsername = account.getUsername();
        this.lblModifyAccount.setText("You are editing" + this.oldUsername + "'s account.");
        this.tbxUsername.setText(account.getUsername());
        this.tbxCredit.setText(String.valueOf(account.getCreditCardNo()));
        this.tbxPassword.setText(account.getPassword());
        this.tbxFirstName.setText(account.getFirstName());
        this.ticketsPurchased = account.getTicketsPurchased();
        this.isAdmin = account.getAdminSetting();
    }
    
    public FEModifyAccount() {
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
        lblModifyAccount = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblCredit = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        tbxFirstName = new javax.swing.JTextField();
        tbxCredit = new javax.swing.JTextField();
        tbxUsername = new javax.swing.JTextField();
        tbxPassword = new javax.swing.JPasswordField();
        bottomPanel = new javax.swing.JPanel();
        btnSaveModifications = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 153));
        setName("signOn"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(51, 102, 255));
        topPanel.setName("topPanel"); // NOI18N
        topPanel.setPreferredSize(new java.awt.Dimension(430, 80));

        lblWelcome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Hello Administrator! ");
        lblWelcome.setAlignmentX(0.5F);

        lblModifyAccount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblModifyAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyAccount.setText("You are editing <<OLD NAME>>'s account.");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblWelcome))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblModifyAccount)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(lblModifyAccount)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel);
        topPanel.getAccessibleContext().setAccessibleName("topPanel");

        centrePanel.setBackground(new java.awt.Color(51, 102, 255));
        centrePanel.setPreferredSize(new java.awt.Dimension(430, 150));
        centrePanel.setRequestFocusEnabled(false);

        lblFirstName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setText("First Name:");

        lblCredit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCredit.setForeground(new java.awt.Color(255, 255, 255));
        lblCredit.setText("Credit Card No:");

        lblUsername.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        tbxFirstName.setText("Currently held data for all.");
        tbxFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxFirstNameActionPerformed(evt);
            }
        });

        tbxCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxCreditActionPerformed(evt);
            }
        });

        tbxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(lblCredit)
                    .addComponent(lblFirstName)
                    .addComponent(lblUsername))
                .addGap(41, 41, 41)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbxUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(tbxFirstName)
                    .addComponent(tbxCredit)
                    .addComponent(tbxPassword))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCredit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(tbxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(centrePanel);

        bottomPanel.setBackground(new java.awt.Color(51, 102, 255));

        btnSaveModifications.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveModifications.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSaveModifications.setText("Save Modifications");
        btnSaveModifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveModificationsActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSaveModifications, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveModifications, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(bottomPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbxCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxCreditActionPerformed

    private void tbxFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxFirstNameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        new FEBrowseAccounts().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tbxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxPasswordActionPerformed

    private void btnSaveModificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveModificationsActionPerformed

        // Call Backend function to save new data
        action.doIt(this.oldUsername, this.tbxUsername.getText(), String.valueOf(this.tbxPassword.getPassword()), this.isAdmin, this.ticketsPurchased, this.tbxFirstName.getText(), Long.parseLong(this.tbxCredit.getText()));
        
    // Go back to BrowseAccounts
        this.setVisible(false);
        new FEBrowseAccounts().setVisible(true);
    }//GEN-LAST:event_btnSaveModificationsActionPerformed

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
            java.util.logging.Logger.getLogger(FEModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEModifyAccount().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSaveModifications;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblModifyAccount;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField tbxCredit;
    private javax.swing.JTextField tbxFirstName;
    private javax.swing.JPasswordField tbxPassword;
    private javax.swing.JTextField tbxUsername;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
