/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

/**
 *
 * @author John
 */
public class CustomerOptions extends javax.swing.JFrame {

    /**
     * Creates new form SignOn
     */
    public CustomerOptions() {
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

        upperPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblCustomerOptions = new javax.swing.JLabel();
        lowerPanel = new javax.swing.JPanel();
        btnBrowseTickets = new javax.swing.JButton();
        btnReadNewsletter = new javax.swing.JButton();
        btnBrowseFilms = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 153));
        setName("signOn"); // NOI18N
        setPreferredSize(new java.awt.Dimension(421, 230));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        upperPanel.setBackground(new java.awt.Color(51, 102, 255));
        upperPanel.setName("upperPanel"); // NOI18N
        upperPanel.setPreferredSize(new java.awt.Dimension(421, 50));

        lblWelcome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Hello <<NAME>>!");
        lblWelcome.setAlignmentX(0.5F);

        lblCustomerOptions.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCustomerOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerOptions.setText("Please choose an option. ");

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerOptions)
                    .addGroup(upperPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblWelcome)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerOptions))
        );

        getContentPane().add(upperPanel);
        upperPanel.getAccessibleContext().setAccessibleName("topPanel");

        lowerPanel.setBackground(new java.awt.Color(51, 102, 255));

        btnBrowseTickets.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowseTickets.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBrowseTickets.setText("Browse Tickets");
        btnBrowseTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseTicketsActionPerformed(evt);
            }
        });

        btnReadNewsletter.setBackground(new java.awt.Color(255, 255, 255));
        btnReadNewsletter.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnReadNewsletter.setText("Read Newsletter");
        btnReadNewsletter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadNewsletterActionPerformed(evt);
            }
        });

        btnBrowseFilms.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowseFilms.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBrowseFilms.setText("Browse Films");
        btnBrowseFilms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseFilmsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBrowseFilms, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(btnReadNewsletter, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(btnBrowseTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBrowseTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReadNewsletter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowseFilms, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(lowerPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseTicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrowseTicketsActionPerformed

    private void btnReadNewsletterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadNewsletterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReadNewsletterActionPerformed

    private void btnBrowseFilmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseFilmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrowseFilmsActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOptions().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseFilms;
    private javax.swing.JButton btnBrowseTickets;
    private javax.swing.JButton btnReadNewsletter;
    private javax.swing.JLabel lblCustomerOptions;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables
}
