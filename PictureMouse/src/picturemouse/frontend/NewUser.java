/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import picturemouse.backend.CreateAccount;
import picturemouse.backend.Database;

/**
 *
 * @author John
 */
public class NewUser extends javax.swing.JFrame {

    Database d1 = Database.getInstance();
    /**
     * Creates new form SignOn
     */
    public NewUser() {
        initComponents();
        this.lblProblems.setVisible(false);
    }
    
    public String changePasswordIntoString(char[] charPassword)
    {
        String password = "";
        for(int i = 0; i < charPassword.length; i++)
        {
            password += charPassword[i];
            charPassword[i] = 0;
        }
        return password;
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
        lblCreateAccount = new javax.swing.JLabel();
        lblProblems = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblCredit = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPasswordConfirm = new javax.swing.JLabel();
        tbxFirstName = new javax.swing.JTextField();
        tbxCredit = new javax.swing.JTextField();
        tbxUsername = new javax.swing.JTextField();
        tbxPassword = new javax.swing.JPasswordField();
        tbxPasswordConfirm = new javax.swing.JPasswordField();
        bottomPanel = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 153));
        setName("signOn"); // NOI18N
        setPreferredSize(new java.awt.Dimension(430, 340));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(51, 102, 255));
        topPanel.setName("topPanel"); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome New User!");
        lblWelcome.setAlignmentX(0.5F);

        lblCreateAccount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccount.setText("Please enter your details to create an account.");

        lblProblems.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblProblems.setForeground(new java.awt.Color(255, 255, 255));
        lblProblems.setText("You have entered invalid fields. These have been coloured black.");

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
                        .addGap(83, 83, 83)
                        .addComponent(lblCreateAccount))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblProblems)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCreateAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProblems)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel);
        topPanel.getAccessibleContext().setAccessibleName("topPanel");

        centrePanel.setBackground(new java.awt.Color(51, 102, 255));
        centrePanel.setPreferredSize(new java.awt.Dimension(430, 180));

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

        lblPasswordConfirm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPasswordConfirm.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordConfirm.setText("Confirm Password:");

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(lblPasswordConfirm)
                    .addComponent(lblCredit)
                    .addComponent(lblFirstName)
                    .addComponent(lblUsername))
                .addGap(23, 23, 23)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbxUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(tbxFirstName)
                    .addComponent(tbxCredit)
                    .addComponent(tbxPasswordConfirm)
                    .addComponent(tbxPassword))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(tbxFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCredit)
                    .addComponent(tbxCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordConfirm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(centrePanel);

        bottomPanel.setBackground(new java.awt.Color(51, 102, 255));
        bottomPanel.setPreferredSize(new java.awt.Dimension(430, 80));

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(bottomPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        this.lblCredit.setForeground(Color.white);
        this.lblPasswordConfirm.setForeground(Color.white);
        this.lblPassword.setForeground(Color.white);
        this.lblFirstName.setForeground(Color.white);
        this.lblUsername.setForeground(Color.white);
        boolean valid = true;
        String password = this.changePasswordIntoString(this.tbxPassword.getPassword());
        String passwordConfirm = this.changePasswordIntoString(this.tbxPasswordConfirm.getPassword());
        String firstName = this.tbxFirstName.getText();
        CreateAccount newUser = new CreateAccount();
        Pattern patternObj = Pattern.compile("\\d+");
        Matcher matcherObj = patternObj.matcher(password);
        
        if(this.tbxCredit.getText().length() != 16)
        {
            this.lblCredit.setForeground(Color.black);
            valid = false;
        }
            
        if(!(passwordConfirm.equals(password)))
        {
            this.lblPasswordConfirm.setForeground(Color.black);
            valid = false;
        }
            
        if((password.length() < 8) || ((password.toLowerCase().equals(password)) && !matcherObj.lookingAt()))
        {
            this.lblPassword.setForeground(Color.black);
            valid = false;
        }
            
        if(firstName.length() > 20)
        {
            this.lblFirstName.setForeground(Color.black);
            valid = false;
        }
        

        if(valid)
        {    
            if(newUser.doIt(this.tbxUsername.getText(), password, false, firstName, Long.valueOf(this.tbxCredit.getText())))
            {
                this.setVisible(false);
                try {
                    d1.saveToFile();
                } catch (IOException ex) {
                    Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
                }
                new SignOn().setVisible(true);
            }
            else
            {
                this.lblUsername.setForeground(Color.black);
                valid = false;
                this.lblProblems.setVisible(true);
            }
        }
        
        else
        {
            this.lblProblems.setVisible(true);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SignOn().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordConfirm;
    private javax.swing.JLabel lblProblems;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField tbxCredit;
    private javax.swing.JTextField tbxFirstName;
    private javax.swing.JPasswordField tbxPassword;
    private javax.swing.JPasswordField tbxPasswordConfirm;
    private javax.swing.JTextField tbxUsername;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
